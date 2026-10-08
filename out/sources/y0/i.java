package y0;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001ak\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ly0/t;", "state", "Lkotlin/Function0;", "Loq/i0;", "onDismiss", "Lkotlin/Function1;", "Ly0/r;", "contextMenuBuilderBlock", "Lf3/m;", "modifier", "", "enabled", "onOpenGesture", "content", "i", "(Ly0/t;Ler/a;Ler/l;Lf3/m;ZLer/a;Ler/p;Lm2/r;II)V", "f", "(Ly0/t;Ler/a;Lf3/m;Ler/l;Lm2/r;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final void f(final ContextMenuState contextMenuState, final er.a<i0> aVar, f3.m mVar, final er.l<? super r, i0> lVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVar2;
        final f3.m mVar2;
        d5 d5VarM;
        er.p<? super p076m2.r, ? super Integer, i0> pVar;
        p076m2.r rVarH = rVar.h(-195055274);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(contextMenuState) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(mVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(lVar) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            mVar2 = mVar;
            if (p076m2.t.k()) {
                p076m2.t.o(-195055274, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.kt:73)");
            }
            ContextMenuState.a aVarA = contextMenuState.a();
            if (aVarA instanceof ContextMenuState.a.Open) {
                ContextMenuState.a.Open open = (ContextMenuState.a.Open) aVarA;
                boolean zW = rVarH.W(open);
                Object objE = rVarH.E();
                if (zW || objE == p076m2.r.INSTANCE.a()) {
                    n nVar = new n(c5.o.d(open.getOffset()), (er.p) null, 2, (fr.k) null);
                    rVarH.v(nVar);
                    objE = nVar;
                }
                rVar2 = rVarH;
                d0.q((n) objE, aVar, mVar2, lVar, rVar2, i17 & 8176, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                d5VarM = rVarH.m();
                if (d5VarM == null) {
                    return;
                } else {
                    pVar = new er.p() { // from class: y0.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.g(contextMenuState, aVar, mVar2, lVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            d5VarM.a(pVar);
        }
        rVar2 = rVarH;
        rVar2.O();
        mVar2 = mVar;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            pVar = new er.p() { // from class: y0.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(contextMenuState, aVar, mVar2, lVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            };
            d5VarM.a(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(ContextMenuState contextMenuState, er.a aVar, f3.m mVar, er.l lVar, int i15, int i16, p076m2.r rVar, int i17) {
        f(contextMenuState, aVar, mVar, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(ContextMenuState contextMenuState, er.a aVar, f3.m mVar, er.l lVar, int i15, int i16, p076m2.r rVar, int i17) {
        f(contextMenuState, aVar, mVar, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0160  */
    /* JADX WARN: Code duplicated, block: B:105:0x016c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0170  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static final void i(final ContextMenuState contextMenuState, final er.a<i0> aVar, final er.l<? super r, i0> lVar, f3.m mVar, boolean z15, er.a<i0> aVar2, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.a<i0> aVar3;
        f3.m mVar2;
        int i18;
        boolean z16;
        int i19;
        int i25;
        final er.a<i0> aVar4;
        int i26;
        boolean z17;
        final boolean z18;
        final er.a<i0> aVar5;
        d5 d5VarM;
        f3.m mVarA;
        er.a<androidx.compose.ui.node.c> aVarB;
        boolean z19;
        boolean z25;
        boolean z26;
        Object objE;
        Object objE2;
        int i27;
        p076m2.r rVarH = rVar.h(1195420540);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(contextMenuState) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar3 = aVar;
            i17 |= rVarH.G(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(lVar) ? 256 : 128;
        }
        int i28 = i16 & 8;
        if (i28 == 0) {
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
                i25 = i16 & 32;
                if (i25 != 0) {
                    if ((196608 & i15) == 0) {
                        aVar4 = aVar2;
                        if (rVarH.G(aVar4)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(pVar)) {
                            i27 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i27;
                    }
                    if ((i17 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        if (i28 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new er.a() { // from class: y0.d
                                    @Override // er.a
                                    public final Object a() {
                                        return i.j();
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            aVar4 = (er.a) objE2;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1195420540, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                        }
                        if (z16) {
                            rVarH.X(-1095188022);
                            if ((458752 & i17) == 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if ((i17 & 14) == 4) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            z26 = z19 | z25;
                            objE = rVarH.E();
                            if (z26 || objE == p076m2.r.INSTANCE.a()) {
                                objE = new er.l() { // from class: y0.e
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return i.k(aVar4, contextMenuState, (m3.e) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            mVarA = k.a(mVar2, (er.l) objE);
                            rVarH.R();
                        } else {
                            rVarH.X(-1095031162);
                            rVarH.R();
                            mVarA = mVar2;
                        }
                        w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT = rVarH.t();
                        f3.m mVarE = f3.j.e(rVarH, mVarA);
                        androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = companion.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        p076m2.r rVarC = n6.c(rVarH);
                        n6.i(rVarC, w0VarI, companion.d());
                        n6.i(rVarC, e0VarT, companion.f());
                        n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                        n6.g(rVarC, companion.a());
                        n6.i(rVarC, mVarE, companion.e());
                        d1.x xVar = d1.x.f39368a;
                        pVar.B(rVarH, Integer.valueOf((i17 >> 18) & 14));
                        f(contextMenuState, aVar3, null, lVar, rVarH, (i17 & 126) | ((i17 << 3) & 7168), 4);
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVarH.O();
                    }
                    z18 = z16;
                    aVar5 = aVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final f3.m mVar3 = mVar2;
                        d5VarM.a(new er.p() { // from class: y0.f
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i.l(contextMenuState, aVar, lVar, mVar3, z18, aVar5, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                aVar4 = aVar2;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i28 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: y0.d
                                @Override // er.a
                                public final Object a() {
                                    return i.j();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar4 = (er.a) objE2;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1195420540, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                    }
                    if (z16) {
                        rVarH.X(-1095188022);
                        if ((458752 & i17) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i17 & 14) == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z19 | z25;
                        objE = rVarH.E();
                        if (z26) {
                            objE = new er.l() { // from class: y0.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.k(aVar4, contextMenuState, (m3.e) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.l() { // from class: y0.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.k(aVar4, contextMenuState, (m3.e) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarA = k.a(mVar2, (er.l) objE);
                        rVarH.R();
                    } else {
                        rVarH.X(-1095031162);
                        rVarH.R();
                        mVarA = mVar2;
                    }
                    w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), true);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    f3.m mVarE2 = f3.j.e(rVarH, mVarA);
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
                    p076m2.r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarI2, companion2.d());
                    n6.i(rVarC2, e0VarT2, companion2.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                    n6.g(rVarC2, companion2.a());
                    n6.i(rVarC2, mVarE2, companion2.e());
                    d1.x xVar2 = d1.x.f39368a;
                    pVar.B(rVarH, Integer.valueOf((i17 >> 18) & 14));
                    f(contextMenuState, aVar3, null, lVar, rVarH, (i17 & 126) | ((i17 << 3) & 7168), 4);
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                }
                z18 = z16;
                aVar5 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar4 = mVar2;
                    d5VarM.a(new er.p() { // from class: y0.f
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.l(contextMenuState, aVar, lVar, mVar4, z18, aVar5, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            z16 = z15;
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    aVar4 = aVar2;
                    if (rVarH.G(aVar4)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i28 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: y0.d
                                @Override // er.a
                                public final Object a() {
                                    return i.j();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar4 = (er.a) objE2;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1195420540, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                    }
                    if (z16) {
                        rVarH.X(-1095188022);
                        if ((458752 & i17) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i17 & 14) == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z19 | z25;
                        objE = rVarH.E();
                        if (z26) {
                            objE = new er.l() { // from class: y0.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.k(aVar4, contextMenuState, (m3.e) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.l() { // from class: y0.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.k(aVar4, contextMenuState, (m3.e) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarA = k.a(mVar2, (er.l) objE);
                        rVarH.R();
                    } else {
                        rVarH.X(-1095031162);
                        rVarH.R();
                        mVarA = mVar2;
                    }
                    w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.o(), true);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT3 = rVarH.t();
                    f3.m mVarE3 = f3.j.e(rVarH, mVarA);
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
                    p076m2.r rVarC3 = n6.c(rVarH);
                    n6.i(rVarC3, w0VarI3, companion3.d());
                    n6.i(rVarC3, e0VarT3, companion3.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                    n6.g(rVarC3, companion3.a());
                    n6.i(rVarC3, mVarE3, companion3.e());
                    d1.x xVar3 = d1.x.f39368a;
                    pVar.B(rVarH, Integer.valueOf((i17 >> 18) & 14));
                    f(contextMenuState, aVar3, null, lVar, rVarH, (i17 & 126) | ((i17 << 3) & 7168), 4);
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                }
                z18 = z16;
                aVar5 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar5 = mVar2;
                    d5VarM.a(new er.p() { // from class: y0.f
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.l(contextMenuState, aVar, lVar, mVar5, z18, aVar5, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            aVar4 = aVar2;
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((i17 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i28 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i25 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new er.a() { // from class: y0.d
                            @Override // er.a
                            public final Object a() {
                                return i.j();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar4 = (er.a) objE2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1195420540, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                }
                if (z16) {
                    rVarH.X(-1095188022);
                    if ((458752 & i17) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if ((i17 & 14) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z19 | z25;
                    objE = rVarH.E();
                    if (z26) {
                        objE = new er.l() { // from class: y0.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.k(aVar4, contextMenuState, (m3.e) obj);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.l() { // from class: y0.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.k(aVar4, contextMenuState, (m3.e) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarA = k.a(mVar2, (er.l) objE);
                    rVarH.R();
                } else {
                    rVarH.X(-1095031162);
                    rVarH.R();
                    mVarA = mVar2;
                }
                w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.o(), true);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT4 = rVarH.t();
                f3.m mVarE4 = f3.j.e(rVarH, mVarA);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI4, companion4.d());
                n6.i(rVarC4, e0VarT4, companion4.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
                n6.g(rVarC4, companion4.a());
                n6.i(rVarC4, mVarE4, companion4.e());
                d1.x xVar4 = d1.x.f39368a;
                pVar.B(rVarH, Integer.valueOf((i17 >> 18) & 14));
                f(contextMenuState, aVar3, null, lVar, rVarH, (i17 & 126) | ((i17 << 3) & 7168), 4);
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            z18 = z16;
            aVar5 = aVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar6 = mVar2;
                d5VarM.a(new er.p() { // from class: y0.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.l(contextMenuState, aVar, lVar, mVar6, z18, aVar5, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    aVar4 = aVar2;
                    if (rVarH.G(aVar4)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((i17 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i28 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new er.a() { // from class: y0.d
                                @Override // er.a
                                public final Object a() {
                                    return i.j();
                                }
                            };
                            rVarH.v(objE2);
                        }
                        aVar4 = (er.a) objE2;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1195420540, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                    }
                    if (z16) {
                        rVarH.X(-1095188022);
                        if ((458752 & i17) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i17 & 14) == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z19 | z25;
                        objE = rVarH.E();
                        if (z26) {
                            objE = new er.l() { // from class: y0.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.k(aVar4, contextMenuState, (m3.e) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.l() { // from class: y0.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return i.k(aVar4, contextMenuState, (m3.e) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarA = k.a(mVar2, (er.l) objE);
                        rVarH.R();
                    } else {
                        rVarH.X(-1095031162);
                        rVarH.R();
                        mVarA = mVar2;
                    }
                    w0 w0VarI5 = d1.r.i(f3.c.INSTANCE.o(), true);
                    int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT5 = rVarH.t();
                    f3.m mVarE5 = f3.j.e(rVarH, mVarA);
                    androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion5.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC5 = n6.c(rVarH);
                    n6.i(rVarC5, w0VarI5, companion5.d());
                    n6.i(rVarC5, e0VarT5, companion5.f());
                    n6.i(rVarC5, Integer.valueOf(iHashCode5), companion5.c());
                    n6.g(rVarC5, companion5.a());
                    n6.i(rVarC5, mVarE5, companion5.e());
                    d1.x xVar5 = d1.x.f39368a;
                    pVar.B(rVarH, Integer.valueOf((i17 >> 18) & 14));
                    f(contextMenuState, aVar3, null, lVar, rVarH, (i17 & 126) | ((i17 << 3) & 7168), 4);
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                }
                z18 = z16;
                aVar5 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final f3.m mVar7 = mVar2;
                    d5VarM.a(new er.p() { // from class: y0.f
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.l(contextMenuState, aVar, lVar, mVar7, z18, aVar5, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            aVar4 = aVar2;
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((i17 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i28 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i25 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new er.a() { // from class: y0.d
                            @Override // er.a
                            public final Object a() {
                                return i.j();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar4 = (er.a) objE2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1195420540, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                }
                if (z16) {
                    rVarH.X(-1095188022);
                    if ((458752 & i17) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if ((i17 & 14) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z19 | z25;
                    objE = rVarH.E();
                    if (z26) {
                        objE = new er.l() { // from class: y0.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.k(aVar4, contextMenuState, (m3.e) obj);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.l() { // from class: y0.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.k(aVar4, contextMenuState, (m3.e) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarA = k.a(mVar2, (er.l) objE);
                    rVarH.R();
                } else {
                    rVarH.X(-1095031162);
                    rVarH.R();
                    mVarA = mVar2;
                }
                w0 w0VarI6 = d1.r.i(f3.c.INSTANCE.o(), true);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT6 = rVarH.t();
                f3.m mVarE6 = f3.j.e(rVarH, mVarA);
                androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion6.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarI6, companion6.d());
                n6.i(rVarC6, e0VarT6, companion6.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion6.c());
                n6.g(rVarC6, companion6.a());
                n6.i(rVarC6, mVarE6, companion6.e());
                d1.x xVar6 = d1.x.f39368a;
                pVar.B(rVarH, Integer.valueOf((i17 >> 18) & 14));
                f(contextMenuState, aVar3, null, lVar, rVarH, (i17 & 126) | ((i17 << 3) & 7168), 4);
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            z18 = z16;
            aVar5 = aVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar8 = mVar2;
                d5VarM.a(new er.p() { // from class: y0.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.l(contextMenuState, aVar, lVar, mVar8, z18, aVar5, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        z16 = z15;
        i25 = i16 & 32;
        if (i25 != 0) {
            if ((196608 & i15) == 0) {
                aVar4 = aVar2;
                if (rVarH.G(aVar4)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((i17 & 599187) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i28 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i25 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new er.a() { // from class: y0.d
                            @Override // er.a
                            public final Object a() {
                                return i.j();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    aVar4 = (er.a) objE2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1195420540, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                }
                if (z16) {
                    rVarH.X(-1095188022);
                    if ((458752 & i17) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if ((i17 & 14) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z19 | z25;
                    objE = rVarH.E();
                    if (z26) {
                        objE = new er.l() { // from class: y0.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.k(aVar4, contextMenuState, (m3.e) obj);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.l() { // from class: y0.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return i.k(aVar4, contextMenuState, (m3.e) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarA = k.a(mVar2, (er.l) objE);
                    rVarH.R();
                } else {
                    rVarH.X(-1095031162);
                    rVarH.R();
                    mVarA = mVar2;
                }
                w0 w0VarI7 = d1.r.i(f3.c.INSTANCE.o(), true);
                int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT7 = rVarH.t();
                f3.m mVarE7 = f3.j.e(rVarH, mVarA);
                androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion7.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC7 = n6.c(rVarH);
                n6.i(rVarC7, w0VarI7, companion7.d());
                n6.i(rVarC7, e0VarT7, companion7.f());
                n6.i(rVarC7, Integer.valueOf(iHashCode7), companion7.c());
                n6.g(rVarC7, companion7.a());
                n6.i(rVarC7, mVarE7, companion7.e());
                d1.x xVar7 = d1.x.f39368a;
                pVar.B(rVarH, Integer.valueOf((i17 >> 18) & 14));
                f(contextMenuState, aVar3, null, lVar, rVarH, (i17 & 126) | ((i17 << 3) & 7168), 4);
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            z18 = z16;
            aVar5 = aVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final f3.m mVar9 = mVar2;
                d5VarM.a(new er.p() { // from class: y0.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.l(contextMenuState, aVar, lVar, mVar9, z18, aVar5, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        aVar4 = aVar2;
        if ((i15 & 1572864) == 0) {
            if (rVarH.G(pVar)) {
                i27 = PKIFailureInfo.badCertTemplate;
            } else {
                i27 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i27;
        }
        if ((i17 & 599187) != 599186) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i28 != 0) {
                mVar2 = f3.m.INSTANCE;
            }
            if (i18 != 0) {
                z16 = true;
            }
            if (i25 != 0) {
                objE2 = rVarH.E();
                if (objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: y0.d
                        @Override // er.a
                        public final Object a() {
                            return i.j();
                        }
                    };
                    rVarH.v(objE2);
                }
                aVar4 = (er.a) objE2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1195420540, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
            }
            if (z16) {
                rVarH.X(-1095188022);
                if ((458752 & i17) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((i17 & 14) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z19 | z25;
                objE = rVarH.E();
                if (z26) {
                    objE = new er.l() { // from class: y0.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.k(aVar4, contextMenuState, (m3.e) obj);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.l() { // from class: y0.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.k(aVar4, contextMenuState, (m3.e) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                mVarA = k.a(mVar2, (er.l) objE);
                rVarH.R();
            } else {
                rVarH.X(-1095031162);
                rVarH.R();
                mVarA = mVar2;
            }
            w0 w0VarI8 = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT8 = rVarH.t();
            f3.m mVarE8 = f3.j.e(rVarH, mVarA);
            androidx.compose.ui.node.c.Companion companion8 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion8.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC8 = n6.c(rVarH);
            n6.i(rVarC8, w0VarI8, companion8.d());
            n6.i(rVarC8, e0VarT8, companion8.f());
            n6.i(rVarC8, Integer.valueOf(iHashCode8), companion8.c());
            n6.g(rVarC8, companion8.a());
            n6.i(rVarC8, mVarE8, companion8.e());
            d1.x xVar8 = d1.x.f39368a;
            pVar.B(rVarH, Integer.valueOf((i17 >> 18) & 14));
            f(contextMenuState, aVar3, null, lVar, rVarH, (i17 & 126) | ((i17 << 3) & 7168), 4);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        z18 = z16;
        aVar5 = aVar4;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final f3.m mVar10 = mVar2;
            d5VarM.a(new er.p() { // from class: y0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(contextMenuState, aVar, lVar, mVar10, z18, aVar5, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(er.a aVar, ContextMenuState contextMenuState, m3.e eVar) {
        aVar.a();
        contextMenuState.b(new ContextMenuState.a.Open(eVar.getPackedValue(), null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(ContextMenuState contextMenuState, er.a aVar, er.l lVar, f3.m mVar, boolean z15, er.a aVar2, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        i(contextMenuState, aVar, lVar, mVar, z15, aVar2, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
