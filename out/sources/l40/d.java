package l40;

import androidx.compose.ui.graphics.Color;
import d1.m3;
import d1.q3;
import d1.r3;
import d40.h;
import er.l;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "testTag", "Lmx/a;", "errorText", "", "ignoreForAccessibility", "Loq/i0;", "d", "(Ljava/lang/String;Lmx/a;ZLm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f115866a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(742467814);
            if (t.k()) {
                t.o(742467814, i15, -1, "pl.gov.coi.common.ui.ds.errortext.ErrorText.<anonymous>.<anonymous> (ErrorText.kt:54)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jG;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0110  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x0166  */
    /* JADX WARN: Code duplicated, block: B:76:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209  */
    /* JADX WARN: Code duplicated, block: B:81:0x0212  */
    /* JADX WARN: Code duplicated, block: B:84:0x021f  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0152, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0198, please report this as an issue */
    public static final void d(String str, final Label label, boolean z15, r rVar, final int i15, final int i16) {
        final String str2;
        int i17;
        boolean z16;
        int i18;
        boolean z17;
        r rVar2;
        final String str3;
        final boolean z18;
        d5 d5VarM;
        String str4;
        boolean z19;
        m.Companion companion;
        boolean z25;
        Object objE;
        m mVarG;
        er.a<androidx.compose.ui.node.c> aVarB;
        String str5;
        Object objE2;
        r rVarH = rVar.h(648966235);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            str2 = str;
        } else if ((i15 & 6) == 0) {
            str2 = str;
            i17 = (rVarH.W(str2) ? 4 : 2) | i15;
        } else {
            str2 = str;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(label) ? 32 : 16;
        }
        int i25 = i16 & 4;
        if (i25 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 256 : 128;
            }
            i18 = i17;
            if ((i18 & 147) != 146) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i18 & 1)) {
                str4 = null;
                if (i19 != 0) {
                    str2 = null;
                }
                if (i25 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(648966235, i18, -1, "pl.gov.coi.common.ui.ds.errortext.ErrorText (ErrorText.kt:29)");
                }
                companion = m.INSTANCE;
                if ((i18 & 14) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objE = rVarH.E();
                if (z25 || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: l40.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d.e(str2, (i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarD = v.d(companion, false, (l) objE, 1, null);
                if (z19) {
                    rVarH.X(1705608136);
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = new l() { // from class: l40.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return d.f((i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    mVarG = v.d(companion, false, (l) objE2, 1, null);
                    rVarH.R();
                } else {
                    rVarH.X(1705709072);
                    mVarG = i.G(companion, label.getText(), rVarH, 6);
                    rVarH.R();
                }
                m mVarU = mVarD.u(mVarG);
                w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarU);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion2.b();
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
                n6.i(rVarC, w0VarB, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                q3 q3Var = q3.f39261a;
                if (str2 != null) {
                    str5 = str2 + "Icon";
                } else {
                    str5 = null;
                }
                h.f(null, new d40.b.C0864b(str5, jz.a.J1, d40.i.e.f39708e, a.f115866a, null, null, 32, null), false, rVarH, 0, 5);
                k70.a aVar = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i26).getSpacing50()), rVarH, 0);
                if (str2 != null) {
                    str4 = str2 + "Text";
                }
                rVar2 = rVarH;
                j70.h.g(null, str4, label, null, null, aVar.a(rVarH, i26).getSupport().g(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i26).f(), null, null, false, true, null, rVar2, (i18 << 3) & 896, 0, 3072, 24637401);
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
                String str6 = str2;
                z18 = z19;
                str3 = str6;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                str3 = str2;
                z18 = z16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: l40.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.g(str3, label, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        i18 = i17;
        if ((i18 & 147) != 146) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i18 & 1)) {
            str4 = null;
            if (i19 != 0) {
                str2 = null;
            }
            if (i25 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (t.k()) {
                t.o(648966235, i18, -1, "pl.gov.coi.common.ui.ds.errortext.ErrorText (ErrorText.kt:29)");
            }
            companion = m.INSTANCE;
            if ((i18 & 14) == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            objE = rVarH.E();
            if (z25) {
                objE = new l() { // from class: l40.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.e(str2, (i0) obj);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new l() { // from class: l40.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.e(str2, (i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD2 = v.d(companion, false, (l) objE, 1, null);
            if (z19) {
                rVarH.X(1705608136);
                objE2 = rVarH.E();
                if (objE2 == r.INSTANCE.a()) {
                    objE2 = new l() { // from class: l40.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d.f((i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                mVarG = v.d(companion, false, (l) objE2, 1, null);
                rVarH.R();
            } else {
                rVarH.X(1705709072);
                mVarG = i.G(companion, label.getText(), rVarH, 6);
                rVarH.R();
            }
            m mVarU2 = mVarD2.u(mVarG);
            w0 w0VarB2 = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarU2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var2 = q3.f39261a;
            if (str2 != null) {
                str5 = str2 + "Icon";
            } else {
                str5 = null;
            }
            h.f(null, new d40.b.C0864b(str5, jz.a.J1, d40.i.e.f39708e, a.f115866a, null, null, 32, null), false, rVarH, 0, 5);
            k70.a aVar2 = k70.a.f108864a;
            int i27 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar2.b(rVarH, i27).getSpacing50()), rVarH, 0);
            if (str2 != null) {
                str4 = str2 + "Text";
            }
            rVar2 = rVarH;
            j70.h.g(null, str4, label, null, null, aVar2.a(rVarH, i27).getSupport().g(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i27).f(), null, null, false, true, null, rVar2, (i18 << 3) & 896, 0, 3072, 24637401);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            String str7 = str2;
            z18 = z19;
            str3 = str7;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            str3 = str2;
            z18 = z16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: l40.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.g(str3, label, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(String str, i0 i0Var) {
        g0.a(i0Var, true);
        if (str == null) {
            str = "errorText";
        }
        f0.y0(i0Var, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(i0 i0Var) {
        i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(String str, Label label, boolean z15, int i15, int i16, r rVar, int i17) {
        d(str, label, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
