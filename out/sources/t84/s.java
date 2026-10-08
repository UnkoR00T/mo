package t84;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import fr.q0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;
import v84.m0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aO\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu84/a;", "colorScheme", "Lq84/a;", "featureConfig", "", "studentId", "initialSemesterId", "Ls84/h;", "initialAttendanceType", "Lkotlin/Function0;", "Loq/i0;", "navResult", "o", "(Lu84/a;Lq84/a;Ljava/lang/String;Ljava/lang/String;Ls84/h;Ler/a;Lm2/r;II)V", "r", "(Lq84/a;Ljava/lang/String;Ljava/lang/String;Ls84/h;Ler/a;Lm2/r;II)V", "schoolattendance_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final z zVar, final String str, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-874821119, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.SchoolAttendanceNavGraph.<anonymous>.<anonymous>.<anonymous> (SchoolAttendanceNavContent.kt:114)");
        }
        boolean zG = rVar.G(zVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: t84.h
                @Override // er.l
                public final Object b(Object obj) {
                    return s.B(zVar, (c94.t.a) obj);
                }
            };
            rVar.v(objE);
        }
        c94.t tVar = (c94.t) q7.d.c(q0.c(c94.t.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<c94.a.InterfaceC0654a> bVarY1 = tVar.Y1();
        boolean zW = rVar.W(str) | rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: t84.i
                @Override // er.l
                public final Object b(Object obj) {
                    return s.C(str, aVar, sVar, (c94.a.InterfaceC0654a) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        c94.m.t(tVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c94.t B(z zVar, c94.t.a aVar) {
        return aVar.a(zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(String str, er.a aVar, f00.s sVar, c94.a.InterfaceC0654a interfaceC0654a) {
        if (!fr.t.c(interfaceC0654a, c94.a.InterfaceC0654a.C0655a.f24630a)) {
            throw new oq.p();
        }
        if (str != null) {
            aVar.a();
        } else {
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(q84.a aVar, String str, String str2, s84.h hVar, er.a aVar2, int i15, int i16, p076m2.r rVar, int i17) {
        r(aVar, str, str2, hVar, aVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void o(final u84.a aVar, final q84.a aVar2, final String str, String str2, s84.h hVar, final er.a<i0> aVar3, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final String str3;
        int i18;
        int iOrdinal;
        int i19;
        boolean z15;
        final s84.h hVar2;
        d5 d5VarM;
        final String str4;
        final s84.h hVar3;
        int i25;
        p076m2.r rVarH = rVar.h(-948648224);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.c(aVar2.ordinal()) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(str) ? 256 : 128;
        }
        int i26 = i16 & 8;
        if (i26 == 0) {
            if ((i15 & 3072) == 0) {
                str3 = str2;
                i17 |= rVarH.W(str3) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                i17 |= 24576;
            } else if ((i15 & 24576) == 0) {
                if (hVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = hVar.ordinal();
                }
                if (rVarH.c(iOrdinal)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            if ((196608 & i15) == 0) {
                if (rVarH.G(aVar3)) {
                    i25 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i25 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i25;
            }
            if ((74899 & i17) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i26 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                if (i18 != 0) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-948648224, i17, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.SchoolAttendanceNavContent (SchoolAttendanceNavContent.kt:35)");
                }
                p076m2.d0.c(u84.c.c().d(aVar), y2.m.d(-322843744, true, new er.p() { // from class: t84.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.p(aVar2, str, str4, hVar3, aVar3, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str3 = str4;
                hVar2 = hVar3;
            } else {
                rVarH.O();
                hVar2 = hVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: t84.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.q(aVar, aVar2, str, str3, hVar2, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        str3 = str2;
        i18 = i16 & 16;
        if (i18 != 0) {
            i17 |= 24576;
        } else if ((i15 & 24576) == 0) {
            if (hVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = hVar.ordinal();
            }
            if (rVarH.c(iOrdinal)) {
                i19 = 16384;
            } else {
                i19 = PKIFailureInfo.certRevoked;
            }
            i17 |= i19;
        }
        if ((196608 & i15) == 0) {
            if (rVarH.G(aVar3)) {
                i25 = PKIFailureInfo.unsupportedVersion;
            } else {
                i25 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i25;
        }
        if ((74899 & i17) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i26 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if (i18 != 0) {
                hVar3 = null;
            } else {
                hVar3 = hVar;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-948648224, i17, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.SchoolAttendanceNavContent (SchoolAttendanceNavContent.kt:35)");
            }
            p076m2.d0.c(u84.c.c().d(aVar), y2.m.d(-322843744, true, new er.p() { // from class: t84.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.p(aVar2, str, str4, hVar3, aVar3, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            str3 = str4;
            hVar2 = hVar3;
        } else {
            rVarH.O();
            hVar2 = hVar;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: t84.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.q(aVar, aVar2, str, str3, hVar2, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(q84.a aVar, String str, String str2, s84.h hVar, er.a aVar2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-322843744, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.SchoolAttendanceNavContent.<anonymous> (SchoolAttendanceNavContent.kt:39)");
            }
            r(aVar, str, str2, hVar, aVar2, rVar, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(u84.a aVar, q84.a aVar2, String str, String str2, s84.h hVar, er.a aVar3, int i15, int i16, p076m2.r rVar, int i17) {
        o(aVar, aVar2, str, str2, hVar, aVar3, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0151  */
    /* JADX WARN: Code duplicated, block: B:105:0x015d  */
    /* JADX WARN: Code duplicated, block: B:110:0x016f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0184  */
    /* JADX WARN: Code duplicated, block: B:115:0x018b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0193  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0141  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void r(q84.a aVar, final String str, String str2, s84.h hVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        String str3;
        int i18;
        int iOrdinal;
        int i19;
        boolean z15;
        final q84.a aVar3;
        final s84.h hVar2;
        d5 d5VarM;
        final String str4;
        final s84.h hVar3;
        final f00.s sVarJ;
        boolean z16;
        boolean z17;
        int i25;
        boolean z18;
        boolean z19;
        boolean z25;
        Object objE;
        er.l lVar;
        y0 y0VarC;
        CreationExtras creationExtrasB;
        int i26;
        final z zVar;
        zx.a aVar4;
        boolean z26;
        boolean zG;
        Object objE2;
        int i27;
        p076m2.r rVarH = rVar.h(1105135786);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.c(aVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(str) ? 32 : 16;
        }
        int i28 = i16 & 4;
        if (i28 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                str3 = str2;
                i17 |= rVarH.W(str3) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                i17 |= 3072;
            } else if ((i15 & 3072) == 0) {
                if (hVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = hVar.ordinal();
                }
                if (rVarH.c(iOrdinal)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            if ((i15 & 24576) == 0) {
                if (rVarH.G(aVar2)) {
                    i27 = 16384;
                } else {
                    i27 = PKIFailureInfo.certRevoked;
                }
                i17 |= i27;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i28 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                if (i18 != 0) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1105135786, i17, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.SchoolAttendanceNavGraph (SchoolAttendanceNavContent.kt:57)");
                }
                sVarJ = f00.r.J(null, rVarH, 0, 1);
                if ((i17 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((i17 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z27 = z16 | z17;
                i25 = i17 & 896;
                if (i25 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z28 = z27 | z18;
                if ((i17 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = z28 | z19;
                objE = rVarH.E();
                if (!z25 || objE == p076m2.r.INSTANCE.a()) {
                    aVar3 = aVar;
                    objE = new er.l() { // from class: t84.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return s.s(aVar3, str, str4, hVar3, (z.a) obj);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    aVar3 = aVar;
                }
                lVar = (er.l) objE;
                y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
                if (y0VarC != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                w0.c cVarA = j7.a.a(y0VarC, rVarH, 0);
                if (y0VarC instanceof androidx.p016lifecycle.h) {
                    creationExtrasB = kq.a.b(((androidx.p016lifecycle.h) y0VarC).x(), lVar);
                } else {
                    creationExtrasB = kq.a.b(CreationExtras.b.f153222c, lVar);
                }
                s84.h hVar4 = hVar3;
                i26 = i17;
                zVar = (z) q7.d.c(q0.c(z.class), y0VarC, null, cVarA, creationExtrasB, rVarH, 0, 0);
                if (str4 != null || hVar4 == null) {
                    aVar4 = c.f188870a;
                } else {
                    aVar4 = b.f188867a;
                }
                boolean zG2 = rVarH.G(zVar);
                if ((i26 & 57344) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zG = zG2 | z26 | rVarH.G(sVarJ) | (i25 == 256);
                objE2 = rVarH.E();
                if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.l() { // from class: t84.l
                        @Override // er.l
                        public final Object b(Object obj) {
                            return s.t(zVar, aVar2, sVarJ, str4, (d1) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                f00.d0.j(sVarJ, aVar4, (er.l) objE2, rVarH, f00.s.f54562e);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str3 = str4;
                hVar2 = hVar4;
            } else {
                aVar3 = aVar;
                rVarH.O();
                hVar2 = hVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final q84.a aVar5 = aVar3;
                final String str5 = str3;
                d5VarM.a(new er.p() { // from class: t84.m
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.D(aVar5, str, str5, hVar2, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        str3 = str2;
        i18 = i16 & 8;
        if (i18 != 0) {
            i17 |= 3072;
        } else if ((i15 & 3072) == 0) {
            if (hVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = hVar.ordinal();
            }
            if (rVarH.c(iOrdinal)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i17 |= i19;
        }
        if ((i15 & 24576) == 0) {
            if (rVarH.G(aVar2)) {
                i27 = 16384;
            } else {
                i27 = PKIFailureInfo.certRevoked;
            }
            i17 |= i27;
        }
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i28 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if (i18 != 0) {
                hVar3 = null;
            } else {
                hVar3 = hVar;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1105135786, i17, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.SchoolAttendanceNavGraph (SchoolAttendanceNavContent.kt:57)");
            }
            sVarJ = f00.r.J(null, rVarH, 0, 1);
            if ((i17 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((i17 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z29 = z16 | z17;
            i25 = i17 & 896;
            if (i25 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z210 = z29 | z18;
            if ((i17 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            z25 = z210 | z19;
            objE = rVarH.E();
            if (z25) {
                aVar3 = aVar;
                objE = new er.l() { // from class: t84.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.s(aVar3, str, str4, hVar3, (z.a) obj);
                    }
                };
                rVarH.v(objE);
            } else {
                aVar3 = aVar;
                objE = new er.l() { // from class: t84.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.s(aVar3, str, str4, hVar3, (z.a) obj);
                    }
                };
                rVarH.v(objE);
            }
            lVar = (er.l) objE;
            y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
            if (y0VarC != null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0.c cVarA2 = j7.a.a(y0VarC, rVarH, 0);
            if (y0VarC instanceof androidx.p016lifecycle.h) {
                creationExtrasB = kq.a.b(((androidx.p016lifecycle.h) y0VarC).x(), lVar);
            } else {
                creationExtrasB = kq.a.b(CreationExtras.b.f153222c, lVar);
            }
            s84.h hVar5 = hVar3;
            i26 = i17;
            zVar = (z) q7.d.c(q0.c(z.class), y0VarC, null, cVarA2, creationExtrasB, rVarH, 0, 0);
            if (str4 != null) {
                aVar4 = c.f188870a;
            } else {
                aVar4 = c.f188870a;
            }
            boolean zG3 = rVarH.G(zVar);
            if ((i26 & 57344) == 16384) {
                z26 = true;
            } else {
                z26 = false;
            }
            zG = zG3 | z26 | rVarH.G(sVarJ) | (i25 == 256);
            objE2 = rVarH.E();
            if (zG) {
                objE2 = new er.l() { // from class: t84.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.t(zVar, aVar2, sVarJ, str4, (d1) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new er.l() { // from class: t84.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.t(zVar, aVar2, sVarJ, str4, (d1) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f00.d0.j(sVarJ, aVar4, (er.l) objE2, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            str3 = str4;
            hVar2 = hVar5;
        } else {
            aVar3 = aVar;
            rVarH.O();
            hVar2 = hVar;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final q84.a aVar6 = aVar3;
            final String str6 = str3;
            d5VarM.a(new er.p() { // from class: t84.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.D(aVar6, str, str6, hVar2, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z s(q84.a aVar, String str, String str2, s84.h hVar, z.a aVar2) {
        return aVar2.a(aVar, str, str2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final z zVar, final er.a aVar, final f00.s sVar, final String str, d1 d1Var) {
        f00.r.u(d1Var, c.f188870a, null, y2.m.b(1325457673, true, new er.r() { // from class: t84.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s.u(zVar, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.f188864a, null, y2.m.b(1281306304, true, new er.r() { // from class: t84.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s.x(zVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b.f188867a, null, y2.m.b(-874821119, true, new er.r() { // from class: t84.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s.A(zVar, str, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final z zVar, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1325457673, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.SchoolAttendanceNavGraph.<anonymous>.<anonymous>.<anonymous> (SchoolAttendanceNavContent.kt:79)");
        }
        boolean zG = rVar.G(zVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: t84.f
                @Override // er.l
                public final Object b(Object obj) {
                    return s.v(zVar, (v84.m.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        v84.m mVar = (v84.m) q7.d.c(q0.c(v84.m.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<v84.a.d> bVarY1 = mVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: t84.g
                @Override // er.l
                public final Object b(Object obj) {
                    return s.w(aVar, sVar, (v84.a.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        m0.C(mVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v84.m v(z zVar, v84.m.a aVar) {
        return aVar.a(zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(er.a aVar, f00.s sVar, v84.a.d dVar) {
        if (fr.t.c(dVar, v84.a.d.C5346a.f204760a)) {
            aVar.a();
        } else if (fr.t.c(dVar, v84.a.d.b.f204761a)) {
            f00.s.m(sVar, a.f188864a, null, 2, null);
        } else {
            if (!fr.t.c(dVar, v84.a.d.c.f204762a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, b.f188867a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final z zVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1281306304, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.SchoolAttendanceNavGraph.<anonymous>.<anonymous>.<anonymous> (SchoolAttendanceNavContent.kt:99)");
        }
        boolean zG = rVar.G(zVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: t84.q
                @Override // er.l
                public final Object b(Object obj) {
                    return s.y(zVar, (z84.o.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        z84.o oVar = (z84.o) q7.d.c(q0.c(z84.o.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<z84.a.InterfaceC6280a> bVarY1 = oVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: t84.r
                @Override // er.l
                public final Object b(Object obj) {
                    return s.z(sVar, (z84.a.InterfaceC6280a) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        z84.j.l(oVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z84.o y(z zVar, z84.o.a aVar) {
        return aVar.a(zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(f00.s sVar, z84.a.InterfaceC6280a interfaceC6280a) {
        if (!fr.t.c(interfaceC6280a, z84.a.InterfaceC6280a.C6281a.f233380a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }
}
