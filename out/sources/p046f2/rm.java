package p046f2;

import androidx.compose.material3.i;
import androidx.compose.ui.graphics.Color;
import c5.d;
import c5.h;
import c5.w;
import d1.a3;
import d1.h0;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import fr.t;
import java.util.List;
import l2.k0;
import l2.q0;
import oq.g;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.f0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.x5;
import p114t0.Function1;
import q4.TextStyle;
import u0.j0;
import u0.k2;
import u0.v2;
import u0.y2;
import w0.r1;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001am\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001a\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010!\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001aK\u0010*\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+\"\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.\"\u001a\u00105\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00104\"\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.\"\u0014\u00109\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.\"\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\"\u0014\u0010?\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010.¨\u0006A²\u0006\f\u0010@\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lf3/m;", "modifier", "enabled", "text", "icon", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Lb1/l;", "interactionSource", "j", "(ZLer/a;Lf3/m;ZLer/p;Ler/p;JJLb1/l;Lm2/r;II)V", "Lkotlin/Function1;", "Ld1/h0;", "content", "i", "(ZLer/a;Lf3/m;ZJJLb1/l;Ler/q;Lm2/r;II)V", "activeColor", "inactiveColor", "m", "(JJZLer/p;Lm2/r;I)V", "k", "(Ler/p;Ler/p;Lm2/r;I)V", "Le4/a2$a;", "Le4/a2;", "textOrIconPlaceable", "", "tabHeight", "C", "(Le4/a2$a;Le4/a2;I)V", "Lc5/d;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "B", "(Le4/a2$a;Lc5/d;Le4/a2;Le4/a2;IIII)V", "Lc5/h;", "a", "F", "SmallTabHeight", "b", "LargeTabHeight", "c", "A", "()F", "HorizontalTextPadding", "d", "SingleLineTextBaselineWithIcon", "e", "DoubleLineTextBaselineWithIcon", "Lc5/v;", "f", "J", "IconDistanceFromBaseline", "g", "TextDistanceFromLeadingIcon", "color", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class rm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f57611a = q0.f115180a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f57612b = h.n(72);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f57613c = h.n(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f57614d = h.n(14);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f57615e = h.n(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f57616f = w.g(20);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f57617g = h.n(8);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<r, Integer, i0> f57618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<r, Integer, i0> f57619b;

        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super r, ? super Integer, i0> pVar, p<? super r, ? super Integer, i0> pVar2) {
            this.f57618a = pVar;
            this.f57619b = pVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(a2 a2Var, a2 a2Var2, y0 y0Var, int i15, int i16, Integer num, Integer num2, a2.a aVar) {
            if (a2Var != null && a2Var2 != null) {
                rm.B(aVar, y0Var, a2Var, a2Var2, i15, i16, num.intValue(), num2.intValue());
            } else if (a2Var != null) {
                rm.C(aVar, a2Var, i16);
            } else if (a2Var2 != null) {
                rm.C(aVar, a2Var2, i16);
            }
            return i0.f148189a;
        }

        @Override // p036e4.w0
        public final x0 e(final y0 y0Var, List<? extends v0> list, long j15) {
            a2 a2VarO0;
            a2 a2VarO1;
            if (this.f57618a != null) {
                int size = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        e5.b.f("Collection contains no element matching the predicate.");
                        throw new g();
                    }
                    v0 v0Var = list.get(i15);
                    if (t.c(f0.a(v0Var), "text")) {
                        a2VarO0 = v0Var.o0(c5.b.d(j15, 0, 0, 0, 0, 11, null));
                        break;
                    }
                    i15++;
                }
            } else {
                a2VarO0 = null;
            }
            if (this.f57619b != null) {
                int size2 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        e5.b.f("Collection contains no element matching the predicate.");
                        throw new g();
                    }
                    v0 v0Var2 = list.get(i16);
                    if (t.c(f0.a(v0Var2), "icon")) {
                        a2VarO1 = v0Var2.o0(j15);
                        break;
                    }
                    i16++;
                }
            } else {
                a2VarO1 = null;
            }
            final int iMax = Math.max(a2VarO0 != null ? a2VarO0.getWidth() : 0, a2VarO1 != null ? a2VarO1.getWidth() : 0);
            final int iMax2 = Math.max(y0Var.X0((a2VarO0 == null || a2VarO1 == null) ? rm.f57611a : rm.f57612b), (a2VarO1 != null ? a2VarO1.getHeight() : 0) + (a2VarO0 != null ? a2VarO0.getHeight() : 0) + y0Var.q2(rm.f57616f));
            final Integer numValueOf = a2VarO0 != null ? Integer.valueOf(a2VarO0.I(p036e4.b.a())) : null;
            final Integer numValueOf2 = a2VarO0 != null ? Integer.valueOf(a2VarO0.I(p036e4.b.b())) : null;
            final a2 a2Var = a2VarO0;
            final a2 a2Var2 = a2VarO1;
            return y0.j2(y0Var, iMax, iMax2, null, new l() { // from class: f2.qm
                @Override // er.l
                public final Object b(Object obj) {
                    return rm.a.b(a2Var, a2Var2, y0Var, iMax, iMax2, numValueOf, numValueOf2, (a2.a) obj);
                }
            }, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements er.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f57620a;

        public b(k2 k2Var) {
            this.f57620a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
        @Override // er.a
        public final Boolean a() {
            return this.f57620a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements er.a<k2.b<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f57621a;

        public c(k2 k2Var) {
            this.f57621a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final k2.b<Boolean> a() {
            return this.f57621a.u();
        }
    }

    public static final float A() {
        return f57613c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(a2.a aVar, d dVar, a2 a2Var, a2 a2Var2, int i15, int i16, int i17, int i18) {
        int iX0 = dVar.X0(i17 == i18 ? f57614d : f57615e) + dVar.X0(q0.f115180a.b());
        int height = (a2Var2.getHeight() + dVar.q2(f57616f)) - i17;
        int i19 = (i16 - i18) - iX0;
        a2.a.I(aVar, a2Var, (i15 - a2Var.getWidth()) / 2, i19, 0.0f, 4, null);
        a2.a.I(aVar, a2Var2, (i15 - a2Var2.getWidth()) / 2, i19 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(a2.a aVar, a2 a2Var, int i15) {
        a2.a.I(aVar, a2Var, 0, (i15 - a2Var.getHeight()) / 2, 0.0f, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x013a  */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:115:0x014f  */
    /* JADX WARN: Code duplicated, block: B:118:0x019d  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:98:0x010d A[PHI: r0 r4 r8 r9 r12
      0x010d: PHI (r0v25 int) = (r0v13 int), (r0v29 int), (r0v30 int) binds: [B:111:0x013c, B:96:0x010a, B:97:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r4v8 f3.m) = (r4v5 f3.m), (r4v2 f3.m), (r4v2 f3.m) binds: [B:111:0x013c, B:96:0x010a, B:97:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r8v8 boolean) = (r8v3 boolean), (r8v2 boolean), (r8v2 boolean) binds: [B:111:0x013c, B:96:0x010a, B:97:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r9v11 long) = (r9v8 long), (r9v6 long), (r9v6 long) binds: [B:111:0x013c, B:96:0x010a, B:97:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r12v8 long) = (r12v5 long), (r12v3 long), (r12v3 long) binds: [B:111:0x013c, B:96:0x010a, B:97:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void i(final boolean z15, final er.a<i0> aVar, m mVar, boolean z16, long j15, long j16, b1.l lVar, final q<? super h0, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        boolean z17;
        int i19;
        long jM20unboximpl;
        long j17;
        int i25;
        final b1.l lVar2;
        int i26;
        int i27;
        boolean z18;
        final m mVar3;
        final boolean z19;
        final long j18;
        final long j19;
        final b1.l lVar3;
        d5 d5VarM;
        int i28;
        final m mVar4;
        long j25;
        int i29;
        int i35;
        int i36;
        r rVarH = rVar.h(-1573136853);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i37 = i16 & 4;
        if (i37 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    z17 = z16;
                    if (rVarH.a(z17)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        jM20unboximpl = j15;
                        if (rVarH.d(jM20unboximpl)) {
                            i36 = 16384;
                        }
                        i17 |= i36;
                    } else {
                        jM20unboximpl = j15;
                    }
                    i36 = PKIFailureInfo.certRevoked;
                    i17 |= i36;
                } else {
                    jM20unboximpl = j15;
                }
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        j17 = j16;
                        if (rVarH.d(j17)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i35;
                    } else {
                        j17 = j16;
                    }
                    i35 = PKIFailureInfo.notAuthorized;
                    i17 |= i35;
                } else {
                    j17 = j16;
                }
                i25 = i16 & 64;
                if (i25 != 0) {
                    if ((1572864 & i15) == 0) {
                        lVar2 = lVar;
                        if (rVarH.W(lVar2)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i17 |= i29;
                    }
                    i27 = i17;
                    if ((i17 & 4793491) != 4793490) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i37 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if ((i16 & 16) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i28 = i27 & (-57345);
                            } else {
                                i28 = i27;
                            }
                            if ((i16 & 32) != 0) {
                                i28 &= -458753;
                                j17 = jM20unboximpl;
                            }
                            if (i25 != 0) {
                                mVar4 = mVar2;
                                j25 = j17;
                                lVar2 = null;
                            }
                            final boolean z25 = z17;
                            long j26 = jM20unboximpl;
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                            }
                            final r1 r1VarH = i.h(true, 0.0f, j26, null, false, false, false, false, 250, null);
                            int i38 = i28 >> 12;
                            m(j26, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.q(mVar4, z15, lVar2, r1VarH, z25, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i38 & 112) | (i38 & 14) | 3072 | ((i28 << 6) & 896));
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            j18 = j26;
                            j19 = j25;
                            mVar3 = mVar4;
                            z19 = z25;
                        } else {
                            rVarH.O();
                            i28 = (i16 & 16) != 0 ? i27 & (-57345) : i27;
                            if ((i16 & 32) != 0) {
                                i28 &= -458753;
                            }
                        }
                        mVar4 = mVar2;
                        j25 = j17;
                        final boolean z26 = z17;
                        long j27 = jM20unboximpl;
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                        }
                        final r1 r1VarH2 = i.h(true, 0.0f, j27, null, false, false, false, false, 250, null);
                        int i39 = i28 >> 12;
                        m(j27, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.q(mVar4, z15, lVar2, r1VarH2, z26, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i39 & 112) | (i39 & 14) | 3072 | ((i28 << 6) & 896));
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        j18 = j27;
                        j19 = j25;
                        mVar3 = mVar4;
                        z19 = z26;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z19 = z17;
                        j18 = jM20unboximpl;
                        j19 = j17;
                    }
                    lVar3 = lVar2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.mm
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.r(z15, aVar, mVar3, z19, j18, j19, lVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                lVar2 = lVar;
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                i27 = i17;
                if ((i17 & 4793491) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i28 = i27 & (-57345);
                        } else {
                            i28 = i27;
                        }
                        if ((i16 & 32) != 0) {
                            i28 &= -458753;
                            j17 = jM20unboximpl;
                        }
                        if (i25 != 0) {
                            mVar4 = mVar2;
                            j25 = j17;
                            lVar2 = null;
                        } else {
                            mVar4 = mVar2;
                            j25 = j17;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i28 = i27 & (-57345);
                        } else {
                            i28 = i27;
                        }
                        if ((i16 & 32) != 0) {
                            i28 &= -458753;
                            j17 = jM20unboximpl;
                        }
                        if (i25 != 0) {
                            mVar4 = mVar2;
                            j25 = j17;
                            lVar2 = null;
                        } else {
                            mVar4 = mVar2;
                            j25 = j17;
                        }
                    }
                    final boolean z27 = z17;
                    long j28 = jM20unboximpl;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    final r1 r1VarH3 = i.h(true, 0.0f, j28, null, false, false, false, false, 250, null);
                    int i310 = i28 >> 12;
                    m(j28, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.q(mVar4, z15, lVar2, r1VarH3, z27, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i310 & 112) | (i310 & 14) | 3072 | ((i28 << 6) & 896));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    j18 = j28;
                    j19 = j25;
                    mVar3 = mVar4;
                    z19 = z27;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z19 = z17;
                    j18 = jM20unboximpl;
                    j19 = j17;
                }
                lVar3 = lVar2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.mm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.r(z15, aVar, mVar3, z19, j18, j19, lVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            z17 = z16;
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jM20unboximpl = j15;
                    if (rVarH.d(jM20unboximpl)) {
                        i36 = 16384;
                    }
                    i17 |= i36;
                } else {
                    jM20unboximpl = j15;
                }
                i36 = PKIFailureInfo.certRevoked;
                i17 |= i36;
            } else {
                jM20unboximpl = j15;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    j17 = j16;
                    if (rVarH.d(j17)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i35;
                } else {
                    j17 = j16;
                }
                i35 = PKIFailureInfo.notAuthorized;
                i17 |= i35;
            } else {
                j17 = j16;
            }
            i25 = i16 & 64;
            if (i25 != 0) {
                if ((1572864 & i15) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i26;
                }
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                i27 = i17;
                if ((i17 & 4793491) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i28 = i27 & (-57345);
                        } else {
                            i28 = i27;
                        }
                        if ((i16 & 32) != 0) {
                            i28 &= -458753;
                            j17 = jM20unboximpl;
                        }
                        if (i25 != 0) {
                            mVar4 = mVar2;
                            j25 = j17;
                            lVar2 = null;
                        } else {
                            mVar4 = mVar2;
                            j25 = j17;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i28 = i27 & (-57345);
                        } else {
                            i28 = i27;
                        }
                        if ((i16 & 32) != 0) {
                            i28 &= -458753;
                            j17 = jM20unboximpl;
                        }
                        if (i25 != 0) {
                            mVar4 = mVar2;
                            j25 = j17;
                            lVar2 = null;
                        } else {
                            mVar4 = mVar2;
                            j25 = j17;
                        }
                    }
                    final boolean z28 = z17;
                    long j29 = jM20unboximpl;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    final r1 r1VarH4 = i.h(true, 0.0f, j29, null, false, false, false, false, 250, null);
                    int i311 = i28 >> 12;
                    m(j29, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.q(mVar4, z15, lVar2, r1VarH4, z28, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i311 & 112) | (i311 & 14) | 3072 | ((i28 << 6) & 896));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    j18 = j29;
                    j19 = j25;
                    mVar3 = mVar4;
                    z19 = z28;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z19 = z17;
                    j18 = jM20unboximpl;
                    j19 = j17;
                }
                lVar3 = lVar2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.mm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.r(z15, aVar, mVar3, z19, j18, j19, lVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            lVar2 = lVar;
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            i27 = i17;
            if ((i17 & 4793491) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i28 = i27 & (-57345);
                    } else {
                        i28 = i27;
                    }
                    if ((i16 & 32) != 0) {
                        i28 &= -458753;
                        j17 = jM20unboximpl;
                    }
                    if (i25 != 0) {
                        mVar4 = mVar2;
                        j25 = j17;
                        lVar2 = null;
                    } else {
                        mVar4 = mVar2;
                        j25 = j17;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i28 = i27 & (-57345);
                    } else {
                        i28 = i27;
                    }
                    if ((i16 & 32) != 0) {
                        i28 &= -458753;
                        j17 = jM20unboximpl;
                    }
                    if (i25 != 0) {
                        mVar4 = mVar2;
                        j25 = j17;
                        lVar2 = null;
                    } else {
                        mVar4 = mVar2;
                        j25 = j17;
                    }
                }
                final boolean z29 = z17;
                long j210 = jM20unboximpl;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                final r1 r1VarH5 = i.h(true, 0.0f, j210, null, false, false, false, false, 250, null);
                int i312 = i28 >> 12;
                m(j210, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.q(mVar4, z15, lVar2, r1VarH5, z29, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i312 & 112) | (i312 & 14) | 3072 | ((i28 << 6) & 896));
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                j18 = j210;
                j19 = j25;
                mVar3 = mVar4;
                z19 = z29;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z19 = z17;
                j18 = jM20unboximpl;
                j19 = j17;
            }
            lVar3 = lVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.mm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.r(z15, aVar, mVar3, z19, j18, j19, lVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                z17 = z16;
                if (rVarH.a(z17)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jM20unboximpl = j15;
                    if (rVarH.d(jM20unboximpl)) {
                        i36 = 16384;
                    }
                    i17 |= i36;
                } else {
                    jM20unboximpl = j15;
                }
                i36 = PKIFailureInfo.certRevoked;
                i17 |= i36;
            } else {
                jM20unboximpl = j15;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    j17 = j16;
                    if (rVarH.d(j17)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i35;
                } else {
                    j17 = j16;
                }
                i35 = PKIFailureInfo.notAuthorized;
                i17 |= i35;
            } else {
                j17 = j16;
            }
            i25 = i16 & 64;
            if (i25 != 0) {
                if ((1572864 & i15) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i26;
                }
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                i27 = i17;
                if ((i17 & 4793491) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i28 = i27 & (-57345);
                        } else {
                            i28 = i27;
                        }
                        if ((i16 & 32) != 0) {
                            i28 &= -458753;
                            j17 = jM20unboximpl;
                        }
                        if (i25 != 0) {
                            mVar4 = mVar2;
                            j25 = j17;
                            lVar2 = null;
                        } else {
                            mVar4 = mVar2;
                            j25 = j17;
                        }
                    } else {
                        if (i37 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if ((i16 & 16) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i28 = i27 & (-57345);
                        } else {
                            i28 = i27;
                        }
                        if ((i16 & 32) != 0) {
                            i28 &= -458753;
                            j17 = jM20unboximpl;
                        }
                        if (i25 != 0) {
                            mVar4 = mVar2;
                            j25 = j17;
                            lVar2 = null;
                        } else {
                            mVar4 = mVar2;
                            j25 = j17;
                        }
                    }
                    final boolean z210 = z17;
                    long j211 = jM20unboximpl;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                    }
                    final r1 r1VarH6 = i.h(true, 0.0f, j211, null, false, false, false, false, 250, null);
                    int i313 = i28 >> 12;
                    m(j211, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.q(mVar4, z15, lVar2, r1VarH6, z210, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i313 & 112) | (i313 & 14) | 3072 | ((i28 << 6) & 896));
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    j18 = j211;
                    j19 = j25;
                    mVar3 = mVar4;
                    z19 = z210;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z19 = z17;
                    j18 = jM20unboximpl;
                    j19 = j17;
                }
                lVar3 = lVar2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.mm
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.r(z15, aVar, mVar3, z19, j18, j19, lVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            lVar2 = lVar;
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            i27 = i17;
            if ((i17 & 4793491) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i28 = i27 & (-57345);
                    } else {
                        i28 = i27;
                    }
                    if ((i16 & 32) != 0) {
                        i28 &= -458753;
                        j17 = jM20unboximpl;
                    }
                    if (i25 != 0) {
                        mVar4 = mVar2;
                        j25 = j17;
                        lVar2 = null;
                    } else {
                        mVar4 = mVar2;
                        j25 = j17;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i28 = i27 & (-57345);
                    } else {
                        i28 = i27;
                    }
                    if ((i16 & 32) != 0) {
                        i28 &= -458753;
                        j17 = jM20unboximpl;
                    }
                    if (i25 != 0) {
                        mVar4 = mVar2;
                        j25 = j17;
                        lVar2 = null;
                    } else {
                        mVar4 = mVar2;
                        j25 = j17;
                    }
                }
                final boolean z211 = z17;
                long j212 = jM20unboximpl;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                final r1 r1VarH7 = i.h(true, 0.0f, j212, null, false, false, false, false, 250, null);
                int i314 = i28 >> 12;
                m(j212, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.q(mVar4, z15, lVar2, r1VarH7, z211, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i314 & 112) | (i314 & 14) | 3072 | ((i28 << 6) & 896));
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                j18 = j212;
                j19 = j25;
                mVar3 = mVar4;
                z19 = z211;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z19 = z17;
                j18 = jM20unboximpl;
                j19 = j17;
            }
            lVar3 = lVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.mm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.r(z15, aVar, mVar3, z19, j18, j19, lVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        z17 = z16;
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                jM20unboximpl = j15;
                if (rVarH.d(jM20unboximpl)) {
                    i36 = 16384;
                }
                i17 |= i36;
            } else {
                jM20unboximpl = j15;
            }
            i36 = PKIFailureInfo.certRevoked;
            i17 |= i36;
        } else {
            jM20unboximpl = j15;
        }
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                j17 = j16;
                if (rVarH.d(j17)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i35;
            } else {
                j17 = j16;
            }
            i35 = PKIFailureInfo.notAuthorized;
            i17 |= i35;
        } else {
            j17 = j16;
        }
        i25 = i16 & 64;
        if (i25 != 0) {
            if ((1572864 & i15) == 0) {
                lVar2 = lVar;
                if (rVarH.W(lVar2)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i26;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            i27 = i17;
            if ((i17 & 4793491) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i28 = i27 & (-57345);
                    } else {
                        i28 = i27;
                    }
                    if ((i16 & 32) != 0) {
                        i28 &= -458753;
                        j17 = jM20unboximpl;
                    }
                    if (i25 != 0) {
                        mVar4 = mVar2;
                        j25 = j17;
                        lVar2 = null;
                    } else {
                        mVar4 = mVar2;
                        j25 = j17;
                    }
                } else {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if ((i16 & 16) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i28 = i27 & (-57345);
                    } else {
                        i28 = i27;
                    }
                    if ((i16 & 32) != 0) {
                        i28 &= -458753;
                        j17 = jM20unboximpl;
                    }
                    if (i25 != 0) {
                        mVar4 = mVar2;
                        j25 = j17;
                        lVar2 = null;
                    } else {
                        mVar4 = mVar2;
                        j25 = j17;
                    }
                }
                final boolean z212 = z17;
                long j213 = jM20unboximpl;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                }
                final r1 r1VarH8 = i.h(true, 0.0f, j213, null, false, false, false, false, 250, null);
                int i315 = i28 >> 12;
                m(j213, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.q(mVar4, z15, lVar2, r1VarH8, z212, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i315 & 112) | (i315 & 14) | 3072 | ((i28 << 6) & 896));
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                j18 = j213;
                j19 = j25;
                mVar3 = mVar4;
                z19 = z212;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z19 = z17;
                j18 = jM20unboximpl;
                j19 = j17;
            }
            lVar3 = lVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.mm
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.r(z15, aVar, mVar3, z19, j18, j19, lVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 1572864;
        lVar2 = lVar;
        if ((i15 & 12582912) == 0) {
            if (rVarH.G(qVar)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i17 |= i29;
        }
        i27 = i17;
        if ((i17 & 4793491) != 4793490) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (rVarH.r(z18, i27 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i37 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                if ((i16 & 16) != 0) {
                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                    i28 = i27 & (-57345);
                } else {
                    i28 = i27;
                }
                if ((i16 & 32) != 0) {
                    i28 &= -458753;
                    j17 = jM20unboximpl;
                }
                if (i25 != 0) {
                    mVar4 = mVar2;
                    j25 = j17;
                    lVar2 = null;
                } else {
                    mVar4 = mVar2;
                    j25 = j17;
                }
            } else {
                if (i37 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                if ((i16 & 16) != 0) {
                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                    i28 = i27 & (-57345);
                } else {
                    i28 = i27;
                }
                if ((i16 & 32) != 0) {
                    i28 &= -458753;
                    j17 = jM20unboximpl;
                }
                if (i25 != 0) {
                    mVar4 = mVar2;
                    j25 = j17;
                    lVar2 = null;
                } else {
                    mVar4 = mVar2;
                    j25 = j17;
                }
            }
            final boolean z213 = z17;
            long j214 = jM20unboximpl;
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-1573136853, i28, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
            }
            final r1 r1VarH9 = i.h(true, 0.0f, j214, null, false, false, false, false, 250, null);
            int i316 = i28 >> 12;
            m(j214, j25, z15, y2.m.d(1128552423, true, new p() { // from class: f2.lm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return rm.q(mVar4, z15, lVar2, r1VarH9, z213, aVar, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i316 & 112) | (i316 & 14) | 3072 | ((i28 << 6) & 896));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            j18 = j214;
            j19 = j25;
            mVar3 = mVar4;
            z19 = z213;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            z19 = z17;
            j18 = jM20unboximpl;
            j19 = j17;
        }
        lVar3 = lVar2;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.mm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return rm.r(z15, aVar, mVar3, z19, j18, j19, lVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:118:0x0156  */
    /* JADX WARN: Code duplicated, block: B:121:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:129:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x018b  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:143:0x020e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0223  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    public static final void j(final boolean z15, final er.a<i0> aVar, m mVar, boolean z16, p<? super r, ? super Integer, i0> pVar, p<? super r, ? super Integer, i0> pVar2, long j15, long j16, b1.l lVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        boolean z17;
        int i19;
        int i25;
        final p<? super r, ? super Integer, i0> pVar3;
        int i26;
        int i27;
        final p<? super r, ? super Integer, i0> pVar4;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        boolean z18;
        r rVar2;
        final b1.l lVar2;
        final m mVar3;
        final boolean z19;
        final p<? super r, ? super Integer, i0> pVar5;
        final p<? super r, ? super Integer, i0> pVar6;
        final long j17;
        final long j18;
        d5 d5VarM;
        long jM20unboximpl;
        long j19;
        boolean z25;
        final f fVarD;
        long j25;
        long j26;
        int i38;
        b1.l lVar3;
        int i39;
        int i45;
        int i46;
        r rVarH = rVar.h(1015017965);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i47 = i16 & 4;
        if (i47 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    z17 = z16;
                    if (rVarH.a(z17)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        pVar3 = pVar;
                        if (rVarH.G(pVar3)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 32;
                    if (i27 != 0) {
                        if ((196608 & i15) == 0) {
                            pVar4 = pVar2;
                            if (rVarH.G(pVar4)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                        if ((1572864 & i15) == 0) {
                            if ((i16 & 64) == 0) {
                                i45 = i17;
                                i35 = i47;
                                if (rVarH.d(j15)) {
                                    i46 = PKIFailureInfo.badCertTemplate;
                                }
                                i29 = i45 | i46;
                            } else {
                                i45 = i17;
                                i35 = i47;
                            }
                            i46 = PKIFailureInfo.signerNotTrusted;
                            i29 = i45 | i46;
                        } else {
                            i29 = i17;
                            i35 = i47;
                        }
                        if ((i15 & 12582912) != 0) {
                            if ((i16 & 128) == 0 || !rVarH.d(j16)) {
                                i39 = 4194304;
                            } else {
                                i39 = 8388608;
                            }
                            i29 |= i39;
                        }
                        i36 = i16 & 256;
                        if (i36 != 0) {
                            if ((i15 & 100663296) == 0) {
                                if (rVarH.W(lVar)) {
                                    i37 = 67108864;
                                } else {
                                    i37 = 33554432;
                                }
                                i29 |= i37;
                            }
                            if ((i29 & 38347923) != 38347922) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (rVarH.r(z18, i29 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0 || rVarH.Q()) {
                                    if (i35 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        z17 = true;
                                    }
                                    if (i25 != 0) {
                                        pVar3 = null;
                                    }
                                    if (i27 != 0) {
                                        pVar4 = null;
                                    }
                                    if ((i16 & 64) != 0) {
                                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                        i29 &= -3670017;
                                    } else {
                                        jM20unboximpl = j15;
                                    }
                                    if ((i16 & 128) != 0) {
                                        i29 &= -29360129;
                                        j19 = jM20unboximpl;
                                    } else {
                                        j19 = j16;
                                    }
                                    z25 = z17;
                                    fVarD = null;
                                    if (i36 != 0) {
                                        j25 = jM20unboximpl;
                                        i38 = 1015017965;
                                        lVar3 = null;
                                        j26 = j19;
                                    } else {
                                        j25 = jM20unboximpl;
                                        j26 = j19;
                                        i38 = 1015017965;
                                        lVar3 = lVar;
                                    }
                                } else {
                                    rVarH.O();
                                    if ((i16 & 64) != 0) {
                                        i29 &= -3670017;
                                    }
                                    if ((i16 & 128) != 0) {
                                        i29 &= -29360129;
                                    }
                                    j25 = j15;
                                    lVar3 = lVar;
                                    z25 = z17;
                                    fVarD = null;
                                    i38 = 1015017965;
                                    j26 = j16;
                                }
                                rVarH.y();
                                if (p076m2.t.k()) {
                                    p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                                }
                                if (pVar3 == null) {
                                    rVarH.X(1830887765);
                                    rVarH.R();
                                } else {
                                    rVarH.X(1830887766);
                                    fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVarH, 54);
                                    rVarH.R();
                                }
                                int i48 = i29 >> 6;
                                rVar2 = rVarH;
                                i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                                    @Override // er.q
                                    public final Object w(Object obj, Object obj2, Object obj3) {
                                        return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                                    }
                                }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i48) | (458752 & i48) | (i48 & 3670016), 0);
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                                mVar3 = mVar2;
                                pVar5 = pVar3;
                                pVar6 = pVar4;
                                z19 = z25;
                                j17 = j25;
                                j18 = j26;
                                lVar2 = lVar3;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                lVar2 = lVar;
                                mVar3 = mVar2;
                                z19 = z17;
                                pVar5 = pVar3;
                                pVar6 = pVar4;
                                j17 = j15;
                                j18 = j16;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.km
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i29 |= 100663296;
                        if ((i29 & 38347923) != 38347922) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (rVarH.r(z18, i29 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            } else {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (pVar3 == null) {
                                rVarH.X(1830887765);
                                rVarH.R();
                            } else {
                                rVarH.X(1830887766);
                                fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                rVarH.R();
                            }
                            int i49 = i29 >> 6;
                            rVar2 = rVarH;
                            i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i49) | (458752 & i49) | (i49 & 3670016), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mVar3 = mVar2;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            z19 = z25;
                            j17 = j25;
                            j18 = j26;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            z19 = z17;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            j17 = j15;
                            j18 = j16;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.km
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 196608;
                    pVar4 = pVar2;
                    if ((1572864 & i15) == 0) {
                        if ((i16 & 64) == 0) {
                            i45 = i17;
                            i35 = i47;
                            if (rVarH.d(j15)) {
                                i46 = PKIFailureInfo.badCertTemplate;
                            }
                            i29 = i45 | i46;
                        } else {
                            i45 = i17;
                            i35 = i47;
                        }
                        i46 = PKIFailureInfo.signerNotTrusted;
                        i29 = i45 | i46;
                    } else {
                        i29 = i17;
                        i35 = i47;
                    }
                    if ((i15 & 12582912) != 0) {
                        if ((i16 & 128) == 0) {
                            i39 = 4194304;
                        } else {
                            i39 = 4194304;
                        }
                        i29 |= i39;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i29 |= i37;
                        }
                        if ((i29 & 38347923) != 38347922) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (rVarH.r(z18, i29 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            } else {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (pVar3 == null) {
                                rVarH.X(1830887765);
                                rVarH.R();
                            } else {
                                rVarH.X(1830887766);
                                fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                rVarH.R();
                            }
                            int i410 = i29 >> 6;
                            rVar2 = rVarH;
                            i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i410) | (458752 & i410) | (i410 & 3670016), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mVar3 = mVar2;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            z19 = z25;
                            j17 = j25;
                            j18 = j26;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            z19 = z17;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            j17 = j15;
                            j18 = j16;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.km
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i29 |= 100663296;
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i411 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i411) | (458752 & i411) | (i411 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                pVar3 = pVar;
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        pVar4 = pVar2;
                        if (rVarH.G(pVar4)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if ((i16 & 64) == 0) {
                            i45 = i17;
                            i35 = i47;
                            if (rVarH.d(j15)) {
                                i46 = PKIFailureInfo.badCertTemplate;
                            }
                            i29 = i45 | i46;
                        } else {
                            i45 = i17;
                            i35 = i47;
                        }
                        i46 = PKIFailureInfo.signerNotTrusted;
                        i29 = i45 | i46;
                    } else {
                        i29 = i17;
                        i35 = i47;
                    }
                    if ((i15 & 12582912) != 0) {
                        if ((i16 & 128) == 0) {
                            i39 = 4194304;
                        } else {
                            i39 = 4194304;
                        }
                        i29 |= i39;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i29 |= i37;
                        }
                        if ((i29 & 38347923) != 38347922) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (rVarH.r(z18, i29 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            } else {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (pVar3 == null) {
                                rVarH.X(1830887765);
                                rVarH.R();
                            } else {
                                rVarH.X(1830887766);
                                fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                rVarH.R();
                            }
                            int i412 = i29 >> 6;
                            rVar2 = rVarH;
                            i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i412) | (458752 & i412) | (i412 & 3670016), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mVar3 = mVar2;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            z19 = z25;
                            j17 = j25;
                            j18 = j26;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            z19 = z17;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            j17 = j15;
                            j18 = j16;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.km
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i29 |= 100663296;
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i413 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i413) | (458752 & i413) | (i413 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                pVar4 = pVar2;
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        i45 = i17;
                        i35 = i47;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.badCertTemplate;
                        }
                        i29 = i45 | i46;
                    } else {
                        i45 = i17;
                        i35 = i47;
                    }
                    i46 = PKIFailureInfo.signerNotTrusted;
                    i29 = i45 | i46;
                } else {
                    i29 = i17;
                    i35 = i47;
                }
                if ((i15 & 12582912) != 0) {
                    if ((i16 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i29 |= i39;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i29 |= i37;
                    }
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i414 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i414) | (458752 & i414) | (i414 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i29 |= 100663296;
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i415 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i415) | (458752 & i415) | (i415 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            z17 = z16;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    pVar3 = pVar;
                    if (rVarH.G(pVar3)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        pVar4 = pVar2;
                        if (rVarH.G(pVar4)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if ((i16 & 64) == 0) {
                            i45 = i17;
                            i35 = i47;
                            if (rVarH.d(j15)) {
                                i46 = PKIFailureInfo.badCertTemplate;
                            }
                            i29 = i45 | i46;
                        } else {
                            i45 = i17;
                            i35 = i47;
                        }
                        i46 = PKIFailureInfo.signerNotTrusted;
                        i29 = i45 | i46;
                    } else {
                        i29 = i17;
                        i35 = i47;
                    }
                    if ((i15 & 12582912) != 0) {
                        if ((i16 & 128) == 0) {
                            i39 = 4194304;
                        } else {
                            i39 = 4194304;
                        }
                        i29 |= i39;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i29 |= i37;
                        }
                        if ((i29 & 38347923) != 38347922) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (rVarH.r(z18, i29 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            } else {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (pVar3 == null) {
                                rVarH.X(1830887765);
                                rVarH.R();
                            } else {
                                rVarH.X(1830887766);
                                fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                rVarH.R();
                            }
                            int i416 = i29 >> 6;
                            rVar2 = rVarH;
                            i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i416) | (458752 & i416) | (i416 & 3670016), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mVar3 = mVar2;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            z19 = z25;
                            j17 = j25;
                            j18 = j26;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            z19 = z17;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            j17 = j15;
                            j18 = j16;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.km
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i29 |= 100663296;
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i417 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i417) | (458752 & i417) | (i417 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                pVar4 = pVar2;
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        i45 = i17;
                        i35 = i47;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.badCertTemplate;
                        }
                        i29 = i45 | i46;
                    } else {
                        i45 = i17;
                        i35 = i47;
                    }
                    i46 = PKIFailureInfo.signerNotTrusted;
                    i29 = i45 | i46;
                } else {
                    i29 = i17;
                    i35 = i47;
                }
                if ((i15 & 12582912) != 0) {
                    if ((i16 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i29 |= i39;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i29 |= i37;
                    }
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i418 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i418) | (458752 & i418) | (i418 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i29 |= 100663296;
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i419 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i419) | (458752 & i419) | (i419 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            pVar3 = pVar;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        i45 = i17;
                        i35 = i47;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.badCertTemplate;
                        }
                        i29 = i45 | i46;
                    } else {
                        i45 = i17;
                        i35 = i47;
                    }
                    i46 = PKIFailureInfo.signerNotTrusted;
                    i29 = i45 | i46;
                } else {
                    i29 = i17;
                    i35 = i47;
                }
                if ((i15 & 12582912) != 0) {
                    if ((i16 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i29 |= i39;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i29 |= i37;
                    }
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i4110 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4110) | (458752 & i4110) | (i4110 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i29 |= 100663296;
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i4111 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4111) | (458752 & i4111) | (i4111 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar4 = pVar2;
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    i45 = i17;
                    i35 = i47;
                    if (rVarH.d(j15)) {
                        i46 = PKIFailureInfo.badCertTemplate;
                    }
                    i29 = i45 | i46;
                } else {
                    i45 = i17;
                    i35 = i47;
                }
                i46 = PKIFailureInfo.signerNotTrusted;
                i29 = i45 | i46;
            } else {
                i29 = i17;
                i35 = i47;
            }
            if ((i15 & 12582912) != 0) {
                if ((i16 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i29 |= i39;
            }
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i29 |= i37;
                }
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i4112 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4112) | (458752 & i4112) | (i4112 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i29 |= 100663296;
            if ((i29 & 38347923) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i29 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                } else {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (pVar3 == null) {
                    rVarH.X(1830887765);
                    rVarH.R();
                } else {
                    rVarH.X(1830887766);
                    fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                }
                int i4113 = i29 >> 6;
                rVar2 = rVarH;
                i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4113) | (458752 & i4113) | (i4113 & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar2;
                pVar5 = pVar3;
                pVar6 = pVar4;
                z19 = z25;
                j17 = j25;
                j18 = j26;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                z19 = z17;
                pVar5 = pVar3;
                pVar6 = pVar4;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.km
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                z17 = z16;
                if (rVarH.a(z17)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    pVar3 = pVar;
                    if (rVarH.G(pVar3)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        pVar4 = pVar2;
                        if (rVarH.G(pVar4)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if ((i16 & 64) == 0) {
                            i45 = i17;
                            i35 = i47;
                            if (rVarH.d(j15)) {
                                i46 = PKIFailureInfo.badCertTemplate;
                            }
                            i29 = i45 | i46;
                        } else {
                            i45 = i17;
                            i35 = i47;
                        }
                        i46 = PKIFailureInfo.signerNotTrusted;
                        i29 = i45 | i46;
                    } else {
                        i29 = i17;
                        i35 = i47;
                    }
                    if ((i15 & 12582912) != 0) {
                        if ((i16 & 128) == 0) {
                            i39 = 4194304;
                        } else {
                            i39 = 4194304;
                        }
                        i29 |= i39;
                    }
                    i36 = i16 & 256;
                    if (i36 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i37 = 67108864;
                            } else {
                                i37 = 33554432;
                            }
                            i29 |= i37;
                        }
                        if ((i29 & 38347923) != 38347922) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (rVarH.r(z18, i29 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            } else {
                                if (i35 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z17 = true;
                                }
                                if (i25 != 0) {
                                    pVar3 = null;
                                }
                                if (i27 != 0) {
                                    pVar4 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                    i29 &= -3670017;
                                } else {
                                    jM20unboximpl = j15;
                                }
                                if ((i16 & 128) != 0) {
                                    i29 &= -29360129;
                                    j19 = jM20unboximpl;
                                } else {
                                    j19 = j16;
                                }
                                z25 = z17;
                                fVarD = null;
                                if (i36 != 0) {
                                    j25 = jM20unboximpl;
                                    i38 = 1015017965;
                                    lVar3 = null;
                                    j26 = j19;
                                } else {
                                    j25 = jM20unboximpl;
                                    j26 = j19;
                                    i38 = 1015017965;
                                    lVar3 = lVar;
                                }
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                            }
                            if (pVar3 == null) {
                                rVarH.X(1830887765);
                                rVarH.R();
                            } else {
                                rVarH.X(1830887766);
                                fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                rVarH.R();
                            }
                            int i4114 = i29 >> 6;
                            rVar2 = rVarH;
                            i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4114) | (458752 & i4114) | (i4114 & 3670016), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mVar3 = mVar2;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            z19 = z25;
                            j17 = j25;
                            j18 = j26;
                            lVar2 = lVar3;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            lVar2 = lVar;
                            mVar3 = mVar2;
                            z19 = z17;
                            pVar5 = pVar3;
                            pVar6 = pVar4;
                            j17 = j15;
                            j18 = j16;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.km
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i29 |= 100663296;
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i4115 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4115) | (458752 & i4115) | (i4115 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                pVar4 = pVar2;
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        i45 = i17;
                        i35 = i47;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.badCertTemplate;
                        }
                        i29 = i45 | i46;
                    } else {
                        i45 = i17;
                        i35 = i47;
                    }
                    i46 = PKIFailureInfo.signerNotTrusted;
                    i29 = i45 | i46;
                } else {
                    i29 = i17;
                    i35 = i47;
                }
                if ((i15 & 12582912) != 0) {
                    if ((i16 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i29 |= i39;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i29 |= i37;
                    }
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i4116 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4116) | (458752 & i4116) | (i4116 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i29 |= 100663296;
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i4117 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4117) | (458752 & i4117) | (i4117 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            pVar3 = pVar;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        i45 = i17;
                        i35 = i47;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.badCertTemplate;
                        }
                        i29 = i45 | i46;
                    } else {
                        i45 = i17;
                        i35 = i47;
                    }
                    i46 = PKIFailureInfo.signerNotTrusted;
                    i29 = i45 | i46;
                } else {
                    i29 = i17;
                    i35 = i47;
                }
                if ((i15 & 12582912) != 0) {
                    if ((i16 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i29 |= i39;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i29 |= i37;
                    }
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i4118 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4118) | (458752 & i4118) | (i4118 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i29 |= 100663296;
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i4119 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i4119) | (458752 & i4119) | (i4119 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar4 = pVar2;
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    i45 = i17;
                    i35 = i47;
                    if (rVarH.d(j15)) {
                        i46 = PKIFailureInfo.badCertTemplate;
                    }
                    i29 = i45 | i46;
                } else {
                    i45 = i17;
                    i35 = i47;
                }
                i46 = PKIFailureInfo.signerNotTrusted;
                i29 = i45 | i46;
            } else {
                i29 = i17;
                i35 = i47;
            }
            if ((i15 & 12582912) != 0) {
                if ((i16 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i29 |= i39;
            }
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i29 |= i37;
                }
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i41110 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41110) | (458752 & i41110) | (i41110 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i29 |= 100663296;
            if ((i29 & 38347923) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i29 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                } else {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (pVar3 == null) {
                    rVarH.X(1830887765);
                    rVarH.R();
                } else {
                    rVarH.X(1830887766);
                    fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                }
                int i41111 = i29 >> 6;
                rVar2 = rVarH;
                i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41111) | (458752 & i41111) | (i41111 & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar2;
                pVar5 = pVar3;
                pVar6 = pVar4;
                z19 = z25;
                j17 = j25;
                j18 = j26;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                z19 = z17;
                pVar5 = pVar3;
                pVar6 = pVar4;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.km
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        z17 = z16;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                pVar3 = pVar;
                if (rVarH.G(pVar3)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if ((i16 & 64) == 0) {
                        i45 = i17;
                        i35 = i47;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.badCertTemplate;
                        }
                        i29 = i45 | i46;
                    } else {
                        i45 = i17;
                        i35 = i47;
                    }
                    i46 = PKIFailureInfo.signerNotTrusted;
                    i29 = i45 | i46;
                } else {
                    i29 = i17;
                    i35 = i47;
                }
                if ((i15 & 12582912) != 0) {
                    if ((i16 & 128) == 0) {
                        i39 = 4194304;
                    } else {
                        i39 = 4194304;
                    }
                    i29 |= i39;
                }
                i36 = i16 & 256;
                if (i36 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i37 = 67108864;
                        } else {
                            i37 = 33554432;
                        }
                        i29 |= i37;
                    }
                    if ((i29 & 38347923) != 38347922) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (rVarH.r(z18, i29 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        } else {
                            if (i35 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                pVar3 = null;
                            }
                            if (i27 != 0) {
                                pVar4 = null;
                            }
                            if ((i16 & 64) != 0) {
                                jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                                i29 &= -3670017;
                            } else {
                                jM20unboximpl = j15;
                            }
                            if ((i16 & 128) != 0) {
                                i29 &= -29360129;
                                j19 = jM20unboximpl;
                            } else {
                                j19 = j16;
                            }
                            z25 = z17;
                            fVarD = null;
                            if (i36 != 0) {
                                j25 = jM20unboximpl;
                                i38 = 1015017965;
                                lVar3 = null;
                                j26 = j19;
                            } else {
                                j25 = jM20unboximpl;
                                j26 = j19;
                                i38 = 1015017965;
                                lVar3 = lVar;
                            }
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                        }
                        if (pVar3 == null) {
                            rVarH.X(1830887765);
                            rVarH.R();
                        } else {
                            rVarH.X(1830887766);
                            fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i41112 = i29 >> 6;
                        rVar2 = rVarH;
                        i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41112) | (458752 & i41112) | (i41112 & 3670016), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar2;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        z19 = z25;
                        j17 = j25;
                        j18 = j26;
                        lVar2 = lVar3;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        lVar2 = lVar;
                        mVar3 = mVar2;
                        z19 = z17;
                        pVar5 = pVar3;
                        pVar6 = pVar4;
                        j17 = j15;
                        j18 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.km
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i29 |= 100663296;
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i41113 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41113) | (458752 & i41113) | (i41113 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar4 = pVar2;
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    i45 = i17;
                    i35 = i47;
                    if (rVarH.d(j15)) {
                        i46 = PKIFailureInfo.badCertTemplate;
                    }
                    i29 = i45 | i46;
                } else {
                    i45 = i17;
                    i35 = i47;
                }
                i46 = PKIFailureInfo.signerNotTrusted;
                i29 = i45 | i46;
            } else {
                i29 = i17;
                i35 = i47;
            }
            if ((i15 & 12582912) != 0) {
                if ((i16 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i29 |= i39;
            }
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i29 |= i37;
                }
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i41114 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41114) | (458752 & i41114) | (i41114 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i29 |= 100663296;
            if ((i29 & 38347923) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i29 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                } else {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (pVar3 == null) {
                    rVarH.X(1830887765);
                    rVarH.R();
                } else {
                    rVarH.X(1830887766);
                    fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                }
                int i41115 = i29 >> 6;
                rVar2 = rVarH;
                i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41115) | (458752 & i41115) | (i41115 & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar2;
                pVar5 = pVar3;
                pVar6 = pVar4;
                z19 = z25;
                j17 = j25;
                j18 = j26;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                z19 = z17;
                pVar5 = pVar3;
                pVar6 = pVar4;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.km
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        pVar3 = pVar;
        i27 = i16 & 32;
        if (i27 != 0) {
            if ((196608 & i15) == 0) {
                pVar4 = pVar2;
                if (rVarH.G(pVar4)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
            if ((1572864 & i15) == 0) {
                if ((i16 & 64) == 0) {
                    i45 = i17;
                    i35 = i47;
                    if (rVarH.d(j15)) {
                        i46 = PKIFailureInfo.badCertTemplate;
                    }
                    i29 = i45 | i46;
                } else {
                    i45 = i17;
                    i35 = i47;
                }
                i46 = PKIFailureInfo.signerNotTrusted;
                i29 = i45 | i46;
            } else {
                i29 = i17;
                i35 = i47;
            }
            if ((i15 & 12582912) != 0) {
                if ((i16 & 128) == 0) {
                    i39 = 4194304;
                } else {
                    i39 = 4194304;
                }
                i29 |= i39;
            }
            i36 = i16 & 256;
            if (i36 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i29 |= i37;
                }
                if ((i29 & 38347923) != 38347922) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (rVarH.r(z18, i29 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    } else {
                        if (i35 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            pVar3 = null;
                        }
                        if (i27 != 0) {
                            pVar4 = null;
                        }
                        if ((i16 & 64) != 0) {
                            jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                            i29 &= -3670017;
                        } else {
                            jM20unboximpl = j15;
                        }
                        if ((i16 & 128) != 0) {
                            i29 &= -29360129;
                            j19 = jM20unboximpl;
                        } else {
                            j19 = j16;
                        }
                        z25 = z17;
                        fVarD = null;
                        if (i36 != 0) {
                            j25 = jM20unboximpl;
                            i38 = 1015017965;
                            lVar3 = null;
                            j26 = j19;
                        } else {
                            j25 = jM20unboximpl;
                            j26 = j19;
                            i38 = 1015017965;
                            lVar3 = lVar;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                    }
                    if (pVar3 == null) {
                        rVarH.X(1830887765);
                        rVarH.R();
                    } else {
                        rVarH.X(1830887766);
                        fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i41116 = i29 >> 6;
                    rVar2 = rVarH;
                    i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41116) | (458752 & i41116) | (i41116 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar2;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    z19 = z25;
                    j17 = j25;
                    j18 = j26;
                    lVar2 = lVar3;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                    z19 = z17;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    j17 = j15;
                    j18 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.km
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i29 |= 100663296;
            if ((i29 & 38347923) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i29 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                } else {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (pVar3 == null) {
                    rVarH.X(1830887765);
                    rVarH.R();
                } else {
                    rVarH.X(1830887766);
                    fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                }
                int i41117 = i29 >> 6;
                rVar2 = rVarH;
                i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41117) | (458752 & i41117) | (i41117 & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar2;
                pVar5 = pVar3;
                pVar6 = pVar4;
                z19 = z25;
                j17 = j25;
                j18 = j26;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                z19 = z17;
                pVar5 = pVar3;
                pVar6 = pVar4;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.km
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        pVar4 = pVar2;
        if ((1572864 & i15) == 0) {
            if ((i16 & 64) == 0) {
                i45 = i17;
                i35 = i47;
                if (rVarH.d(j15)) {
                    i46 = PKIFailureInfo.badCertTemplate;
                }
                i29 = i45 | i46;
            } else {
                i45 = i17;
                i35 = i47;
            }
            i46 = PKIFailureInfo.signerNotTrusted;
            i29 = i45 | i46;
        } else {
            i29 = i17;
            i35 = i47;
        }
        if ((i15 & 12582912) != 0) {
            if ((i16 & 128) == 0) {
                i39 = 4194304;
            } else {
                i39 = 4194304;
            }
            i29 |= i39;
        }
        i36 = i16 & 256;
        if (i36 != 0) {
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(lVar)) {
                    i37 = 67108864;
                } else {
                    i37 = 33554432;
                }
                i29 |= i37;
            }
            if ((i29 & 38347923) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i29 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                } else {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        pVar3 = null;
                    }
                    if (i27 != 0) {
                        pVar4 = null;
                    }
                    if ((i16 & 64) != 0) {
                        jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                        i29 &= -3670017;
                    } else {
                        jM20unboximpl = j15;
                    }
                    if ((i16 & 128) != 0) {
                        i29 &= -29360129;
                        j19 = jM20unboximpl;
                    } else {
                        j19 = j16;
                    }
                    z25 = z17;
                    fVarD = null;
                    if (i36 != 0) {
                        j25 = jM20unboximpl;
                        i38 = 1015017965;
                        lVar3 = null;
                        j26 = j19;
                    } else {
                        j25 = jM20unboximpl;
                        j26 = j19;
                        i38 = 1015017965;
                        lVar3 = lVar;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                }
                if (pVar3 == null) {
                    rVarH.X(1830887765);
                    rVarH.R();
                } else {
                    rVarH.X(1830887766);
                    fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                }
                int i41118 = i29 >> 6;
                rVar2 = rVarH;
                i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41118) | (458752 & i41118) | (i41118 & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar2;
                pVar5 = pVar3;
                pVar6 = pVar4;
                z19 = z25;
                j17 = j25;
                j18 = j26;
                lVar2 = lVar3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar2 = lVar;
                mVar3 = mVar2;
                z19 = z17;
                pVar5 = pVar3;
                pVar6 = pVar4;
                j17 = j15;
                j18 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.km
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i29 |= 100663296;
        if ((i29 & 38347923) != 38347922) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (rVarH.r(z18, i29 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i35 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                if (i25 != 0) {
                    pVar3 = null;
                }
                if (i27 != 0) {
                    pVar4 = null;
                }
                if ((i16 & 64) != 0) {
                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                    i29 &= -3670017;
                } else {
                    jM20unboximpl = j15;
                }
                if ((i16 & 128) != 0) {
                    i29 &= -29360129;
                    j19 = jM20unboximpl;
                } else {
                    j19 = j16;
                }
                z25 = z17;
                fVarD = null;
                if (i36 != 0) {
                    j25 = jM20unboximpl;
                    i38 = 1015017965;
                    lVar3 = null;
                    j26 = j19;
                } else {
                    j25 = jM20unboximpl;
                    j26 = j19;
                    i38 = 1015017965;
                    lVar3 = lVar;
                }
            } else {
                if (i35 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                if (i25 != 0) {
                    pVar3 = null;
                }
                if (i27 != 0) {
                    pVar4 = null;
                }
                if ((i16 & 64) != 0) {
                    jM20unboximpl = ((Color) rVarH.N(h4.a())).m20unboximpl();
                    i29 &= -3670017;
                } else {
                    jM20unboximpl = j15;
                }
                if ((i16 & 128) != 0) {
                    i29 &= -29360129;
                    j19 = jM20unboximpl;
                } else {
                    j19 = j16;
                }
                z25 = z17;
                fVarD = null;
                if (i36 != 0) {
                    j25 = jM20unboximpl;
                    i38 = 1015017965;
                    lVar3 = null;
                    j26 = j19;
                } else {
                    j25 = jM20unboximpl;
                    j26 = j19;
                    i38 = 1015017965;
                    lVar3 = lVar;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(i38, i29, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
            }
            if (pVar3 == null) {
                rVarH.X(1830887765);
                rVarH.R();
            } else {
                rVarH.X(1830887766);
                fVarD = y2.m.d(-1745256900, true, new p() { // from class: f2.im
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return rm.s(pVar3, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                rVarH.R();
            }
            int i41119 = i29 >> 6;
            rVar2 = rVarH;
            i(z15, aVar, g0.d(mVar2), z25, j25, j26, lVar3, y2.m.d(-906085472, true, new q() { // from class: f2.jm
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return rm.t(fVarD, pVar4, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, (i29 & 14) | 12582912 | (i29 & 112) | (i29 & 7168) | (57344 & i41119) | (458752 & i41119) | (i41119 & 3670016), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar2;
            pVar5 = pVar3;
            pVar6 = pVar4;
            z19 = z25;
            j17 = j25;
            j18 = j26;
            lVar2 = lVar3;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            lVar2 = lVar;
            mVar3 = mVar2;
            z19 = z17;
            pVar5 = pVar3;
            pVar6 = pVar4;
            j17 = j15;
            j18 = j16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.km
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return rm.u(z15, aVar, mVar3, z19, pVar5, pVar6, j17, j18, lVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void k(final p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1349901398);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1349901398, i16, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:300)");
            }
            int i17 = i16 & 14;
            boolean z15 = (i17 == 4) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new a(pVar, pVar2);
                rVarH.v(objE);
            }
            w0 w0Var = (w0) objE;
            m.Companion companion = m.INSTANCE;
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0Var, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            if (pVar != null) {
                rVarH.X(870361332);
                m mVarP = a3.p(f0.b(companion, "text"), f57613c, 0.0f, 2, null);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                m mVarE2 = j.e(rVarH, mVarP);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI, companion2.d());
                n6.i(rVarC2, e0VarT2, companion2.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                n6.g(rVarC2, companion2.a());
                n6.i(rVarC2, mVarE2, companion2.e());
                x xVar = x.f39368a;
                pVar.B(rVarH, Integer.valueOf(i17));
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(870466081);
                rVarH.R();
            }
            if (pVar2 != null) {
                rVarH.X(870494880);
                m mVarB = f0.b(companion, "icon");
                w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT3 = rVarH.t();
                m mVarE3 = j.e(rVarH, mVarB);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB3);
                } else {
                    rVarH.u();
                }
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarI2, companion2.d());
                n6.i(rVarC3, e0VarT3, companion2.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion2.c());
                n6.g(rVarC3, companion2.a());
                n6.i(rVarC3, mVarE3, companion2.e());
                x xVar2 = x.f39368a;
                pVar2.B(rVarH, Integer.valueOf((i16 >> 3) & 14));
                rVarH.x();
                rVarH.R();
            } else {
                rVarH.X(870557345);
                rVarH.R();
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.nm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return rm.l(pVar, pVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(p pVar, p pVar2, int i15, r rVar, int i16) {
        k(pVar, pVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final long j15, final long j16, boolean z15, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        final boolean z16;
        Object objP;
        r rVarH = rVar.h(-833145221);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.d(j15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.d(j16) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            z16 = z15;
            i16 |= rVarH.a(z16) ? 256 : 128;
        } else {
            z16 = z15;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(pVar) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-833145221, i16, -1, "androidx.compose.material3.TabTransition (Tab.kt:274)");
            }
            int i17 = i16 >> 6;
            k2 k2VarX = v2.x(Boolean.valueOf(z16), null, rVarH, i17 & 14, 2);
            q qVar = new q() { // from class: f2.om
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return rm.n((k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            };
            boolean zBooleanValue = ((Boolean) k2VarX.w()).booleanValue();
            rVarH.X(-1069234984);
            if (p076m2.t.k()) {
                p076m2.t.o(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j17 = zBooleanValue ? j15 : j16;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVarH.R();
            o3.c cVarM14getColorSpaceimpl = Color.m14getColorSpaceimpl(j17);
            boolean zW = rVarH.W(cVarM14getColorSpaceimpl);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = (y2) Function1.a(Color.INSTANCE).b(cVarM14getColorSpaceimpl);
                rVarH.v(objE);
            }
            y2 y2Var = (y2) objE;
            if (k2VarX.B()) {
                i17 = i17;
                rVarH.X(1666827533);
                rVarH.R();
                objP = k2VarX.p();
            } else {
                rVarH.X(1666573488);
                boolean zW2 = rVarH.W(k2VarX);
                objP = rVarH.E();
                if (zW2 || objP == r.INSTANCE.a()) {
                    c3.l.Companion companion = c3.l.INSTANCE;
                    c3.l lVarD = companion.d();
                    l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
                    c3.l lVarE = companion.e(lVarD);
                    try {
                        Object objP2 = k2VarX.p();
                        companion.l(lVarD, lVarE, lVarG);
                        rVarH.v(objP2);
                        objP = objP2;
                    } catch (Throwable th4) {
                        companion.l(lVarD, lVarE, lVarG);
                        throw th4;
                    }
                }
                rVarH.R();
            }
            boolean zBooleanValue2 = ((Boolean) objP).booleanValue();
            rVarH.X(-1069234984);
            if (p076m2.t.k()) {
                p076m2.t.o(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j18 = zBooleanValue2 ? j15 : j16;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVarH.R();
            Color colorM0boximpl = Color.m0boximpl(j18);
            boolean zW3 = rVarH.W(k2VarX);
            Object objE2 = rVarH.E();
            if (zW3 || objE2 == r.INSTANCE.a()) {
                objE2 = x5.d(new b(k2VarX));
                rVarH.v(objE2);
            }
            boolean zBooleanValue3 = ((Boolean) ((f6) objE2).getValue()).booleanValue();
            rVarH.X(-1069234984);
            if (p076m2.t.k()) {
                p076m2.t.o(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j19 = zBooleanValue3 ? j15 : j16;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVarH.R();
            Color colorM0boximpl2 = Color.m0boximpl(j19);
            boolean zW4 = rVarH.W(k2VarX);
            Object objE3 = rVarH.E();
            if (zW4 || objE3 == r.INSTANCE.a()) {
                objE3 = x5.d(new c(k2VarX));
                rVarH.v(objE3);
            }
            d0.c(h4.a().d(Color.m0boximpl(o(v2.r(k2VarX, colorM0boximpl, colorM0boximpl2, (j0) qVar.w(((f6) objE3).getValue(), rVarH, 0), y2Var, "ColorAnimation", rVarH, 0)))), pVar, rVarH, c4.f122821i | (i17 & 112));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.pm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return rm.p(j15, j16, z16, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 n(k2.b bVar, r rVar, int i15) {
        j0 j0VarB;
        rVar.X(1058649156);
        if (p076m2.t.k()) {
            p076m2.t.o(1058649156, i15, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:280)");
        }
        if (bVar.c(Boolean.FALSE, Boolean.TRUE)) {
            rVar.X(272207019);
            j0VarB = of.b(k0.DefaultEffects, rVar, 6);
            rVar.R();
        } else {
            rVar.X(272326989);
            j0VarB = of.b(k0.FastEffects, rVar, 6);
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return j0VarB;
    }

    private static final long o(f6<Color> f6Var) {
        return f6Var.getValue().m20unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(long j15, long j16, boolean z15, p pVar, int i15, r rVar, int i16) {
        m(j15, j16, z15, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(m mVar, boolean z15, b1.l lVar, r1 r1Var, boolean z16, er.a aVar, q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1128552423, i15, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:244)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(k1.d.a(mVar, z15, lVar, r1Var, z16, n4.l.j(n4.l.INSTANCE.h()), aVar), 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            qVar.w(d1.i0.f39176a, rVar, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(boolean z15, er.a aVar, m mVar, boolean z16, long j15, long j16, b1.l lVar, q qVar, int i15, int i16, r rVar, int i17) {
        i(z15, aVar, mVar, z16, j15, j16, lVar, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1745256900, i15, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
            }
            oo.h(TextStyle.e(ds.e(q0.f115180a.f(), rVar, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, b5.j.INSTANCE.a(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), pVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(p pVar, p pVar2, h0 h0Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-906085472, i15, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:120)");
            }
            k(pVar, pVar2, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(boolean z15, er.a aVar, m mVar, boolean z16, p pVar, p pVar2, long j15, long j16, b1.l lVar, int i15, int i16, r rVar, int i17) {
        j(z15, aVar, mVar, z16, pVar, pVar2, j15, j16, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
