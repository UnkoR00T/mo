package x50;

import l3.d0;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.rr;
import p046f2.ur;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx50/i;", "data", "Lf2/ur;", "scrollBehavior", "Ll3/d0;", "nextFocusRequester", "previousFocusRequester", "lastElementFocusRequester", "Loq/i0;", "b", "(Lx50/i;Lf2/ur;Ll3/d0;Ll3/d0;Ll3/d0;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    /* JADX WARN: Code duplicated, block: B:100:0x0151  */
    /* JADX WARN: Code duplicated, block: B:102:0x0160  */
    /* JADX WARN: Code duplicated, block: B:105:0x016f  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0129  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0149  */
    public static final void b(final i iVar, ur urVar, d0 d0Var, d0 d0Var2, d0 d0Var3, r rVar, final int i15, final int i16) {
        int i17;
        ur urVarP;
        d0 d0Var4;
        int i18;
        d0 d0Var5;
        int i19;
        int i25;
        d0 d0Var6;
        int i26;
        boolean z15;
        r rVar2;
        final ur urVar2;
        final d0 d0Var7;
        final d0 d0Var8;
        final d0 d0Var9;
        d5 d5VarM;
        d0 d0Var10;
        ur urVar3;
        d0 d0Var11;
        r rVarH = rVar.h(2108191389);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                urVarP = urVar;
                int i27 = rVarH.W(urVarP) ? 32 : 16;
                i17 |= i27;
            } else {
                urVarP = urVar;
            }
            i17 |= i27;
        } else {
            urVarP = urVar;
        }
        int i28 = i16 & 4;
        if (i28 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                d0Var4 = d0Var;
                i17 |= rVarH.W(d0Var4) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                i17 |= 3072;
                d0Var5 = d0Var2;
            } else {
                d0Var5 = d0Var2;
                if ((i15 & 3072) == 0) {
                    if (rVarH.W(d0Var5)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    d0Var6 = d0Var3;
                    if (rVarH.W(d0Var6)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if ((i16 & 2) != 0) {
                            rVar2 = rVarH;
                            urVarP = rr.f57664a.p(null, null, rVar2, rr.f57675l << 6, 3);
                            i17 &= -113;
                        } else {
                            rVar2 = rVarH;
                        }
                        if (i28 != 0) {
                            d0Var4 = null;
                        }
                        if (i18 != 0) {
                            d0Var5 = null;
                        }
                        if (i25 != 0) {
                            urVar3 = urVarP;
                            d0Var11 = d0Var4;
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var3;
                            urVar3 = urVarP;
                            d0Var11 = d0Var4;
                        }
                    } else {
                        rVarH.O();
                        if ((i16 & 2) != 0) {
                            i17 &= -113;
                        }
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                        d0Var10 = d0Var6;
                        rVar2 = rVarH;
                    }
                    rVar2.y();
                    if (t.k()) {
                        t.o(2108191389, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBar (TopAppBar.kt:35)");
                    }
                    if (iVar instanceof i.Medium) {
                        rVar2.X(-1252628412);
                        r rVar3 = rVar2;
                        d0 d0Var12 = d0Var5;
                        z50.f.f((i.Medium) iVar, urVar3, d0Var11, d0Var12, d0Var10, rVar3, i17 & 65534, 0);
                        d0Var5 = d0Var12;
                        rVar2 = rVar3;
                        rVar2.R();
                    } else if (iVar instanceof i.Large) {
                        rVar2.X(-1252620218);
                        y50.f.f((i.Large) iVar, urVar3, rVar2, i17 & 126);
                        rVar2.R();
                    } else {
                        if (iVar instanceof i.Small) {
                            rVar2.X(-1252629380);
                            rVar2.R();
                            throw new p();
                        }
                        rVar2.X(-1252616765);
                        r rVar4 = rVar2;
                        d0 d0Var13 = d0Var5;
                        a60.e.e((i.Small) iVar, urVar3, d0Var11, d0Var13, d0Var10, rVar4, i17 & 65534, 0);
                        d0Var5 = d0Var13;
                        rVar2 = rVar4;
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    urVar2 = urVar3;
                    d0Var7 = d0Var11;
                    d0Var8 = d0Var10;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    urVar2 = urVarP;
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var3;
                }
                d0Var9 = d0Var5;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: x50.j
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return k.c(iVar, urVar2, d0Var7, d0Var9, d0Var8, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            d0Var6 = d0Var3;
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if ((i16 & 2) != 0) {
                        rVar2 = rVarH;
                        urVarP = rr.f57664a.p(null, null, rVar2, rr.f57675l << 6, 3);
                        i17 &= -113;
                    } else {
                        rVar2 = rVarH;
                    }
                    if (i28 != 0) {
                        d0Var4 = null;
                    }
                    if (i18 != 0) {
                        d0Var5 = null;
                    }
                    if (i25 != 0) {
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var3;
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                    }
                } else {
                    if ((i16 & 2) != 0) {
                        rVar2 = rVarH;
                        urVarP = rr.f57664a.p(null, null, rVar2, rr.f57675l << 6, 3);
                        i17 &= -113;
                    } else {
                        rVar2 = rVarH;
                    }
                    if (i28 != 0) {
                        d0Var4 = null;
                    }
                    if (i18 != 0) {
                        d0Var5 = null;
                    }
                    if (i25 != 0) {
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var3;
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                    }
                }
                rVar2.y();
                if (t.k()) {
                    t.o(2108191389, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBar (TopAppBar.kt:35)");
                }
                if (iVar instanceof i.Medium) {
                    rVar2.X(-1252628412);
                    r rVar5 = rVar2;
                    d0 d0Var14 = d0Var5;
                    z50.f.f((i.Medium) iVar, urVar3, d0Var11, d0Var14, d0Var10, rVar5, i17 & 65534, 0);
                    d0Var5 = d0Var14;
                    rVar2 = rVar5;
                    rVar2.R();
                } else if (iVar instanceof i.Large) {
                    rVar2.X(-1252620218);
                    y50.f.f((i.Large) iVar, urVar3, rVar2, i17 & 126);
                    rVar2.R();
                } else {
                    if (iVar instanceof i.Small) {
                        rVar2.X(-1252629380);
                        rVar2.R();
                        throw new p();
                    }
                    rVar2.X(-1252616765);
                    r rVar6 = rVar2;
                    d0 d0Var15 = d0Var5;
                    a60.e.e((i.Small) iVar, urVar3, d0Var11, d0Var15, d0Var10, rVar6, i17 & 65534, 0);
                    d0Var5 = d0Var15;
                    rVar2 = rVar6;
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                urVar2 = urVar3;
                d0Var7 = d0Var11;
                d0Var8 = d0Var10;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                urVar2 = urVarP;
                d0Var7 = d0Var4;
                d0Var8 = d0Var3;
            }
            d0Var9 = d0Var5;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: x50.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.c(iVar, urVar2, d0Var7, d0Var9, d0Var8, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        d0Var4 = d0Var;
        i18 = i16 & 8;
        if (i18 != 0) {
            i17 |= 3072;
            d0Var5 = d0Var2;
        } else {
            d0Var5 = d0Var2;
            if ((i15 & 3072) == 0) {
                if (rVarH.W(d0Var5)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
        }
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                d0Var6 = d0Var3;
                if (rVarH.W(d0Var6)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if ((i16 & 2) != 0) {
                        rVar2 = rVarH;
                        urVarP = rr.f57664a.p(null, null, rVar2, rr.f57675l << 6, 3);
                        i17 &= -113;
                    } else {
                        rVar2 = rVarH;
                    }
                    if (i28 != 0) {
                        d0Var4 = null;
                    }
                    if (i18 != 0) {
                        d0Var5 = null;
                    }
                    if (i25 != 0) {
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var3;
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                    }
                } else {
                    if ((i16 & 2) != 0) {
                        rVar2 = rVarH;
                        urVarP = rr.f57664a.p(null, null, rVar2, rr.f57675l << 6, 3);
                        i17 &= -113;
                    } else {
                        rVar2 = rVarH;
                    }
                    if (i28 != 0) {
                        d0Var4 = null;
                    }
                    if (i18 != 0) {
                        d0Var5 = null;
                    }
                    if (i25 != 0) {
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var3;
                        urVar3 = urVarP;
                        d0Var11 = d0Var4;
                    }
                }
                rVar2.y();
                if (t.k()) {
                    t.o(2108191389, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBar (TopAppBar.kt:35)");
                }
                if (iVar instanceof i.Medium) {
                    rVar2.X(-1252628412);
                    r rVar7 = rVar2;
                    d0 d0Var16 = d0Var5;
                    z50.f.f((i.Medium) iVar, urVar3, d0Var11, d0Var16, d0Var10, rVar7, i17 & 65534, 0);
                    d0Var5 = d0Var16;
                    rVar2 = rVar7;
                    rVar2.R();
                } else if (iVar instanceof i.Large) {
                    rVar2.X(-1252620218);
                    y50.f.f((i.Large) iVar, urVar3, rVar2, i17 & 126);
                    rVar2.R();
                } else {
                    if (iVar instanceof i.Small) {
                        rVar2.X(-1252629380);
                        rVar2.R();
                        throw new p();
                    }
                    rVar2.X(-1252616765);
                    r rVar8 = rVar2;
                    d0 d0Var17 = d0Var5;
                    a60.e.e((i.Small) iVar, urVar3, d0Var11, d0Var17, d0Var10, rVar8, i17 & 65534, 0);
                    d0Var5 = d0Var17;
                    rVar2 = rVar8;
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                urVar2 = urVar3;
                d0Var7 = d0Var11;
                d0Var8 = d0Var10;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                urVar2 = urVarP;
                d0Var7 = d0Var4;
                d0Var8 = d0Var3;
            }
            d0Var9 = d0Var5;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: x50.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.c(iVar, urVar2, d0Var7, d0Var9, d0Var8, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        d0Var6 = d0Var3;
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if ((i16 & 2) != 0) {
                    rVar2 = rVarH;
                    urVarP = rr.f57664a.p(null, null, rVar2, rr.f57675l << 6, 3);
                    i17 &= -113;
                } else {
                    rVar2 = rVarH;
                }
                if (i28 != 0) {
                    d0Var4 = null;
                }
                if (i18 != 0) {
                    d0Var5 = null;
                }
                if (i25 != 0) {
                    urVar3 = urVarP;
                    d0Var11 = d0Var4;
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var3;
                    urVar3 = urVarP;
                    d0Var11 = d0Var4;
                }
            } else {
                if ((i16 & 2) != 0) {
                    rVar2 = rVarH;
                    urVarP = rr.f57664a.p(null, null, rVar2, rr.f57675l << 6, 3);
                    i17 &= -113;
                } else {
                    rVar2 = rVarH;
                }
                if (i28 != 0) {
                    d0Var4 = null;
                }
                if (i18 != 0) {
                    d0Var5 = null;
                }
                if (i25 != 0) {
                    urVar3 = urVarP;
                    d0Var11 = d0Var4;
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var3;
                    urVar3 = urVarP;
                    d0Var11 = d0Var4;
                }
            }
            rVar2.y();
            if (t.k()) {
                t.o(2108191389, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBar (TopAppBar.kt:35)");
            }
            if (iVar instanceof i.Medium) {
                rVar2.X(-1252628412);
                r rVar9 = rVar2;
                d0 d0Var18 = d0Var5;
                z50.f.f((i.Medium) iVar, urVar3, d0Var11, d0Var18, d0Var10, rVar9, i17 & 65534, 0);
                d0Var5 = d0Var18;
                rVar2 = rVar9;
                rVar2.R();
            } else if (iVar instanceof i.Large) {
                rVar2.X(-1252620218);
                y50.f.f((i.Large) iVar, urVar3, rVar2, i17 & 126);
                rVar2.R();
            } else {
                if (iVar instanceof i.Small) {
                    rVar2.X(-1252629380);
                    rVar2.R();
                    throw new p();
                }
                rVar2.X(-1252616765);
                r rVar10 = rVar2;
                d0 d0Var19 = d0Var5;
                a60.e.e((i.Small) iVar, urVar3, d0Var11, d0Var19, d0Var10, rVar10, i17 & 65534, 0);
                d0Var5 = d0Var19;
                rVar2 = rVar10;
                rVar2.R();
            }
            if (t.k()) {
                t.n();
            }
            urVar2 = urVar3;
            d0Var7 = d0Var11;
            d0Var8 = d0Var10;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            urVar2 = urVarP;
            d0Var7 = d0Var4;
            d0Var8 = d0Var3;
        }
        d0Var9 = d0Var5;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: x50.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.c(iVar, urVar2, d0Var7, d0Var9, d0Var8, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(i iVar, ur urVar, d0 d0Var, d0 d0Var2, d0 d0Var3, int i15, int i16, r rVar, int i17) {
        b(iVar, urVar, d0Var, d0Var2, d0Var3, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
