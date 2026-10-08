package x50;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.x;
import er.l;
import er.p;
import f3.m;
import i30.ButtonIconData;
import l3.d0;
import l3.g0;
import l3.y;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000b\u001a\u00020\u0006*\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000e\u001a\u00020\u0006*\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li30/a;", "buttonIconData", "Ll3/d0;", "nextFocusRequester", "previousFocusRequester", "focusRequester", "Loq/i0;", "j", "(Li30/a;Ll3/d0;Ll3/d0;Ll3/d0;Lm2/r;II)V", "Lx50/a;", "lastElementFocusRequester", "f", "(Lx50/a;Ll3/d0;Ll3/d0;Ll3/d0;Lm2/r;II)V", "Lx50/b;", "h", "(Lx50/b;Ll3/d0;Ll3/d0;Ll3/d0;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f216884a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-532146466);
            if (t.k()) {
                t.o(-532146466, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton.<anonymous> (TopAppBarButton.kt:104)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016e  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x0098  */
    /* JADX WARN: Code duplicated, block: B:64:0x009f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0115  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0126  */
    /* JADX WARN: Code duplicated, block: B:93:0x014a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0152  */
    /* JADX WARN: Code duplicated, block: B:97:0x0161  */
    public static final void f(final x50.a aVar, d0 d0Var, d0 d0Var2, d0 d0Var3, r rVar, final int i15, final int i16) {
        d0 d0Var4;
        int i17;
        int i18;
        int i19;
        d0 d0Var5;
        int i25;
        int i26;
        boolean z15;
        final d0 d0Var6;
        final d0 d0Var7;
        final d0 d0Var8;
        d5 d5VarM;
        d0 d0Var9;
        d0 d0Var10;
        d0 d0Var11;
        d0 d0Var12;
        d0 d0Var13;
        x50.a.IconList iconList;
        d0 d0Var14;
        d0 d0Var15;
        d0 d0Var16;
        r rVarH = rVar.h(-490046510);
        int i27 = (i15 & 6) == 0 ? ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15 : i15;
        int i28 = i16 & 1;
        if (i28 == 0) {
            if ((i15 & 48) == 0) {
                d0Var4 = d0Var;
                i27 |= rVarH.W(d0Var4) ? 32 : 16;
            }
            i17 = i16 & 2;
            if (i17 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(d0Var2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i27 |= i18;
                }
                i19 = i16 & 4;
                if (i19 != 0) {
                    if ((i15 & 3072) == 0) {
                        d0Var5 = d0Var3;
                        if (rVarH.W(d0Var5)) {
                            i25 = 2048;
                        } else {
                            i25 = 1024;
                        }
                        i27 |= i25;
                    }
                    i26 = 0;
                    if ((i27 & 1171) != 1170) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i27 & 1)) {
                        if (i28 != 0) {
                            d0Var9 = null;
                        } else {
                            d0Var9 = d0Var4;
                        }
                        if (i17 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var2;
                        }
                        if (i19 != 0) {
                            d0Var5 = null;
                        }
                        if (t.k()) {
                            t.o(-490046510, i27, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateMenuButtons (TopAppBarButton.kt:60)");
                        }
                        if (aVar instanceof x50.a.Icon) {
                            rVarH.X(1511713907);
                            j(((x50.a.Icon) aVar).getMenuButtonData().a(), d0Var9, d0Var10, d0Var5, rVarH, i27 & 8176, 0);
                            d0Var11 = d0Var9;
                            d0Var12 = d0Var10;
                            d0Var13 = d0Var5;
                            rVarH.R();
                        } else {
                            d0Var11 = d0Var9;
                            d0Var12 = d0Var10;
                            d0Var13 = d0Var5;
                            if (aVar instanceof x50.a.IconList) {
                                rVarH.X(-381236895);
                                iconList = (x50.a.IconList) aVar;
                                for (Object obj : iconList.a()) {
                                    int i29 = i26 + 1;
                                    if (i26 < 0) {
                                        v.x();
                                    }
                                    ButtonIconData buttonIconDataA = ((x50.a.MenuButtonData) obj).a();
                                    if (v.p(iconList.a()) == i26) {
                                        d0Var14 = d0Var11;
                                    } else {
                                        d0Var14 = null;
                                    }
                                    if (i26 == 0) {
                                        d0Var15 = d0Var12;
                                    } else {
                                        d0Var15 = null;
                                    }
                                    if (v.p(iconList.a()) == i26) {
                                        d0Var16 = d0Var13;
                                    } else {
                                        d0Var16 = null;
                                    }
                                    j(buttonIconDataA, d0Var14, d0Var15, d0Var16, rVarH, 0, 0);
                                    i26 = i29;
                                }
                                rVarH.R();
                            } else {
                                if (aVar == null) {
                                    rVarH.X(1511713278);
                                    rVarH.R();
                                    throw new oq.p();
                                }
                                rVarH.X(1511738479);
                                d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                                rVarH.R();
                            }
                        }
                        if (t.k()) {
                            t.n();
                        }
                        d0 d0Var17 = d0Var11;
                        d0Var8 = d0Var13;
                        d0Var7 = d0Var17;
                        d0Var6 = d0Var12;
                    } else {
                        rVarH.O();
                        d0Var6 = d0Var2;
                        d0Var7 = d0Var4;
                        d0Var8 = d0Var5;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: x50.g
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return h.g(aVar, d0Var7, d0Var6, d0Var8, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i27 |= 3072;
                d0Var5 = d0Var3;
                i26 = 0;
                if ((i27 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i27 & 1)) {
                    if (i28 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var4;
                    }
                    if (i17 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i19 != 0) {
                        d0Var5 = null;
                    }
                    if (t.k()) {
                        t.o(-490046510, i27, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateMenuButtons (TopAppBarButton.kt:60)");
                    }
                    if (aVar instanceof x50.a.Icon) {
                        rVarH.X(1511713907);
                        j(((x50.a.Icon) aVar).getMenuButtonData().a(), d0Var9, d0Var10, d0Var5, rVarH, i27 & 8176, 0);
                        d0Var11 = d0Var9;
                        d0Var12 = d0Var10;
                        d0Var13 = d0Var5;
                        rVarH.R();
                    } else {
                        d0Var11 = d0Var9;
                        d0Var12 = d0Var10;
                        d0Var13 = d0Var5;
                        if (aVar instanceof x50.a.IconList) {
                            rVarH.X(-381236895);
                            iconList = (x50.a.IconList) aVar;
                            while (r15.hasNext()) {
                                int i210 = i26 + 1;
                                if (i26 < 0) {
                                    v.x();
                                }
                                ButtonIconData buttonIconDataA2 = ((x50.a.MenuButtonData) obj).a();
                                if (v.p(iconList.a()) == i26) {
                                    d0Var14 = d0Var11;
                                } else {
                                    d0Var14 = null;
                                }
                                if (i26 == 0) {
                                    d0Var15 = d0Var12;
                                } else {
                                    d0Var15 = null;
                                }
                                if (v.p(iconList.a()) == i26) {
                                    d0Var16 = d0Var13;
                                } else {
                                    d0Var16 = null;
                                }
                                j(buttonIconDataA2, d0Var14, d0Var15, d0Var16, rVarH, 0, 0);
                                i26 = i210;
                            }
                            rVarH.R();
                        } else {
                            if (aVar == null) {
                                rVarH.X(1511713278);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1511738479);
                            d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                            rVarH.R();
                        }
                    }
                    if (t.k()) {
                        t.n();
                    }
                    d0 d0Var18 = d0Var11;
                    d0Var8 = d0Var13;
                    d0Var7 = d0Var18;
                    d0Var6 = d0Var12;
                } else {
                    rVarH.O();
                    d0Var6 = d0Var2;
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.g
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return h.g(aVar, d0Var7, d0Var6, d0Var8, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i27 |= MLKEMEngine.KyberPolyBytes;
            i19 = i16 & 4;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    d0Var5 = d0Var3;
                    if (rVarH.W(d0Var5)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i27 |= i25;
                }
                i26 = 0;
                if ((i27 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i27 & 1)) {
                    if (i28 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var4;
                    }
                    if (i17 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i19 != 0) {
                        d0Var5 = null;
                    }
                    if (t.k()) {
                        t.o(-490046510, i27, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateMenuButtons (TopAppBarButton.kt:60)");
                    }
                    if (aVar instanceof x50.a.Icon) {
                        rVarH.X(1511713907);
                        j(((x50.a.Icon) aVar).getMenuButtonData().a(), d0Var9, d0Var10, d0Var5, rVarH, i27 & 8176, 0);
                        d0Var11 = d0Var9;
                        d0Var12 = d0Var10;
                        d0Var13 = d0Var5;
                        rVarH.R();
                    } else {
                        d0Var11 = d0Var9;
                        d0Var12 = d0Var10;
                        d0Var13 = d0Var5;
                        if (aVar instanceof x50.a.IconList) {
                            rVarH.X(-381236895);
                            iconList = (x50.a.IconList) aVar;
                            while (r15.hasNext()) {
                                int i211 = i26 + 1;
                                if (i26 < 0) {
                                    v.x();
                                }
                                ButtonIconData buttonIconDataA3 = ((x50.a.MenuButtonData) obj).a();
                                if (v.p(iconList.a()) == i26) {
                                    d0Var14 = d0Var11;
                                } else {
                                    d0Var14 = null;
                                }
                                if (i26 == 0) {
                                    d0Var15 = d0Var12;
                                } else {
                                    d0Var15 = null;
                                }
                                if (v.p(iconList.a()) == i26) {
                                    d0Var16 = d0Var13;
                                } else {
                                    d0Var16 = null;
                                }
                                j(buttonIconDataA3, d0Var14, d0Var15, d0Var16, rVarH, 0, 0);
                                i26 = i211;
                            }
                            rVarH.R();
                        } else {
                            if (aVar == null) {
                                rVarH.X(1511713278);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1511738479);
                            d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                            rVarH.R();
                        }
                    }
                    if (t.k()) {
                        t.n();
                    }
                    d0 d0Var19 = d0Var11;
                    d0Var8 = d0Var13;
                    d0Var7 = d0Var19;
                    d0Var6 = d0Var12;
                } else {
                    rVarH.O();
                    d0Var6 = d0Var2;
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.g
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return h.g(aVar, d0Var7, d0Var6, d0Var8, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i27 |= 3072;
            d0Var5 = d0Var3;
            i26 = 0;
            if ((i27 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i27 & 1)) {
                if (i28 != 0) {
                    d0Var9 = null;
                } else {
                    d0Var9 = d0Var4;
                }
                if (i17 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var2;
                }
                if (i19 != 0) {
                    d0Var5 = null;
                }
                if (t.k()) {
                    t.o(-490046510, i27, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateMenuButtons (TopAppBarButton.kt:60)");
                }
                if (aVar instanceof x50.a.Icon) {
                    rVarH.X(1511713907);
                    j(((x50.a.Icon) aVar).getMenuButtonData().a(), d0Var9, d0Var10, d0Var5, rVarH, i27 & 8176, 0);
                    d0Var11 = d0Var9;
                    d0Var12 = d0Var10;
                    d0Var13 = d0Var5;
                    rVarH.R();
                } else {
                    d0Var11 = d0Var9;
                    d0Var12 = d0Var10;
                    d0Var13 = d0Var5;
                    if (aVar instanceof x50.a.IconList) {
                        rVarH.X(-381236895);
                        iconList = (x50.a.IconList) aVar;
                        while (r15.hasNext()) {
                            int i212 = i26 + 1;
                            if (i26 < 0) {
                                v.x();
                            }
                            ButtonIconData buttonIconDataA4 = ((x50.a.MenuButtonData) obj).a();
                            if (v.p(iconList.a()) == i26) {
                                d0Var14 = d0Var11;
                            } else {
                                d0Var14 = null;
                            }
                            if (i26 == 0) {
                                d0Var15 = d0Var12;
                            } else {
                                d0Var15 = null;
                            }
                            if (v.p(iconList.a()) == i26) {
                                d0Var16 = d0Var13;
                            } else {
                                d0Var16 = null;
                            }
                            j(buttonIconDataA4, d0Var14, d0Var15, d0Var16, rVarH, 0, 0);
                            i26 = i212;
                        }
                        rVarH.R();
                    } else {
                        if (aVar == null) {
                            rVarH.X(1511713278);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1511738479);
                        d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                        rVarH.R();
                    }
                }
                if (t.k()) {
                    t.n();
                }
                d0 d0Var110 = d0Var11;
                d0Var8 = d0Var13;
                d0Var7 = d0Var110;
                d0Var6 = d0Var12;
            } else {
                rVarH.O();
                d0Var6 = d0Var2;
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.g
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return h.g(aVar, d0Var7, d0Var6, d0Var8, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i27 |= 48;
        d0Var4 = d0Var;
        i17 = i16 & 2;
        if (i17 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.W(d0Var2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i27 |= i18;
            }
            i19 = i16 & 4;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    d0Var5 = d0Var3;
                    if (rVarH.W(d0Var5)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i27 |= i25;
                }
                i26 = 0;
                if ((i27 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i27 & 1)) {
                    if (i28 != 0) {
                        d0Var9 = null;
                    } else {
                        d0Var9 = d0Var4;
                    }
                    if (i17 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var2;
                    }
                    if (i19 != 0) {
                        d0Var5 = null;
                    }
                    if (t.k()) {
                        t.o(-490046510, i27, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateMenuButtons (TopAppBarButton.kt:60)");
                    }
                    if (aVar instanceof x50.a.Icon) {
                        rVarH.X(1511713907);
                        j(((x50.a.Icon) aVar).getMenuButtonData().a(), d0Var9, d0Var10, d0Var5, rVarH, i27 & 8176, 0);
                        d0Var11 = d0Var9;
                        d0Var12 = d0Var10;
                        d0Var13 = d0Var5;
                        rVarH.R();
                    } else {
                        d0Var11 = d0Var9;
                        d0Var12 = d0Var10;
                        d0Var13 = d0Var5;
                        if (aVar instanceof x50.a.IconList) {
                            rVarH.X(-381236895);
                            iconList = (x50.a.IconList) aVar;
                            while (r15.hasNext()) {
                                int i213 = i26 + 1;
                                if (i26 < 0) {
                                    v.x();
                                }
                                ButtonIconData buttonIconDataA5 = ((x50.a.MenuButtonData) obj).a();
                                if (v.p(iconList.a()) == i26) {
                                    d0Var14 = d0Var11;
                                } else {
                                    d0Var14 = null;
                                }
                                if (i26 == 0) {
                                    d0Var15 = d0Var12;
                                } else {
                                    d0Var15 = null;
                                }
                                if (v.p(iconList.a()) == i26) {
                                    d0Var16 = d0Var13;
                                } else {
                                    d0Var16 = null;
                                }
                                j(buttonIconDataA5, d0Var14, d0Var15, d0Var16, rVarH, 0, 0);
                                i26 = i213;
                            }
                            rVarH.R();
                        } else {
                            if (aVar == null) {
                                rVarH.X(1511713278);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1511738479);
                            d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                            rVarH.R();
                        }
                    }
                    if (t.k()) {
                        t.n();
                    }
                    d0 d0Var111 = d0Var11;
                    d0Var8 = d0Var13;
                    d0Var7 = d0Var111;
                    d0Var6 = d0Var12;
                } else {
                    rVarH.O();
                    d0Var6 = d0Var2;
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.g
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return h.g(aVar, d0Var7, d0Var6, d0Var8, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i27 |= 3072;
            d0Var5 = d0Var3;
            i26 = 0;
            if ((i27 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i27 & 1)) {
                if (i28 != 0) {
                    d0Var9 = null;
                } else {
                    d0Var9 = d0Var4;
                }
                if (i17 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var2;
                }
                if (i19 != 0) {
                    d0Var5 = null;
                }
                if (t.k()) {
                    t.o(-490046510, i27, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateMenuButtons (TopAppBarButton.kt:60)");
                }
                if (aVar instanceof x50.a.Icon) {
                    rVarH.X(1511713907);
                    j(((x50.a.Icon) aVar).getMenuButtonData().a(), d0Var9, d0Var10, d0Var5, rVarH, i27 & 8176, 0);
                    d0Var11 = d0Var9;
                    d0Var12 = d0Var10;
                    d0Var13 = d0Var5;
                    rVarH.R();
                } else {
                    d0Var11 = d0Var9;
                    d0Var12 = d0Var10;
                    d0Var13 = d0Var5;
                    if (aVar instanceof x50.a.IconList) {
                        rVarH.X(-381236895);
                        iconList = (x50.a.IconList) aVar;
                        while (r15.hasNext()) {
                            int i214 = i26 + 1;
                            if (i26 < 0) {
                                v.x();
                            }
                            ButtonIconData buttonIconDataA6 = ((x50.a.MenuButtonData) obj).a();
                            if (v.p(iconList.a()) == i26) {
                                d0Var14 = d0Var11;
                            } else {
                                d0Var14 = null;
                            }
                            if (i26 == 0) {
                                d0Var15 = d0Var12;
                            } else {
                                d0Var15 = null;
                            }
                            if (v.p(iconList.a()) == i26) {
                                d0Var16 = d0Var13;
                            } else {
                                d0Var16 = null;
                            }
                            j(buttonIconDataA6, d0Var14, d0Var15, d0Var16, rVarH, 0, 0);
                            i26 = i214;
                        }
                        rVarH.R();
                    } else {
                        if (aVar == null) {
                            rVarH.X(1511713278);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1511738479);
                        d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                        rVarH.R();
                    }
                }
                if (t.k()) {
                    t.n();
                }
                d0 d0Var112 = d0Var11;
                d0Var8 = d0Var13;
                d0Var7 = d0Var112;
                d0Var6 = d0Var12;
            } else {
                rVarH.O();
                d0Var6 = d0Var2;
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.g
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return h.g(aVar, d0Var7, d0Var6, d0Var8, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i27 |= MLKEMEngine.KyberPolyBytes;
        i19 = i16 & 4;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                d0Var5 = d0Var3;
                if (rVarH.W(d0Var5)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i27 |= i25;
            }
            i26 = 0;
            if ((i27 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i27 & 1)) {
                if (i28 != 0) {
                    d0Var9 = null;
                } else {
                    d0Var9 = d0Var4;
                }
                if (i17 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var2;
                }
                if (i19 != 0) {
                    d0Var5 = null;
                }
                if (t.k()) {
                    t.o(-490046510, i27, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateMenuButtons (TopAppBarButton.kt:60)");
                }
                if (aVar instanceof x50.a.Icon) {
                    rVarH.X(1511713907);
                    j(((x50.a.Icon) aVar).getMenuButtonData().a(), d0Var9, d0Var10, d0Var5, rVarH, i27 & 8176, 0);
                    d0Var11 = d0Var9;
                    d0Var12 = d0Var10;
                    d0Var13 = d0Var5;
                    rVarH.R();
                } else {
                    d0Var11 = d0Var9;
                    d0Var12 = d0Var10;
                    d0Var13 = d0Var5;
                    if (aVar instanceof x50.a.IconList) {
                        rVarH.X(-381236895);
                        iconList = (x50.a.IconList) aVar;
                        while (r15.hasNext()) {
                            int i215 = i26 + 1;
                            if (i26 < 0) {
                                v.x();
                            }
                            ButtonIconData buttonIconDataA7 = ((x50.a.MenuButtonData) obj).a();
                            if (v.p(iconList.a()) == i26) {
                                d0Var14 = d0Var11;
                            } else {
                                d0Var14 = null;
                            }
                            if (i26 == 0) {
                                d0Var15 = d0Var12;
                            } else {
                                d0Var15 = null;
                            }
                            if (v.p(iconList.a()) == i26) {
                                d0Var16 = d0Var13;
                            } else {
                                d0Var16 = null;
                            }
                            j(buttonIconDataA7, d0Var14, d0Var15, d0Var16, rVarH, 0, 0);
                            i26 = i215;
                        }
                        rVarH.R();
                    } else {
                        if (aVar == null) {
                            rVarH.X(1511713278);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1511738479);
                        d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                        rVarH.R();
                    }
                }
                if (t.k()) {
                    t.n();
                }
                d0 d0Var113 = d0Var11;
                d0Var8 = d0Var13;
                d0Var7 = d0Var113;
                d0Var6 = d0Var12;
            } else {
                rVarH.O();
                d0Var6 = d0Var2;
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.g
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return h.g(aVar, d0Var7, d0Var6, d0Var8, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i27 |= 3072;
        d0Var5 = d0Var3;
        i26 = 0;
        if ((i27 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i27 & 1)) {
            if (i28 != 0) {
                d0Var9 = null;
            } else {
                d0Var9 = d0Var4;
            }
            if (i17 != 0) {
                d0Var10 = null;
            } else {
                d0Var10 = d0Var2;
            }
            if (i19 != 0) {
                d0Var5 = null;
            }
            if (t.k()) {
                t.o(-490046510, i27, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateMenuButtons (TopAppBarButton.kt:60)");
            }
            if (aVar instanceof x50.a.Icon) {
                rVarH.X(1511713907);
                j(((x50.a.Icon) aVar).getMenuButtonData().a(), d0Var9, d0Var10, d0Var5, rVarH, i27 & 8176, 0);
                d0Var11 = d0Var9;
                d0Var12 = d0Var10;
                d0Var13 = d0Var5;
                rVarH.R();
            } else {
                d0Var11 = d0Var9;
                d0Var12 = d0Var10;
                d0Var13 = d0Var5;
                if (aVar instanceof x50.a.IconList) {
                    rVarH.X(-381236895);
                    iconList = (x50.a.IconList) aVar;
                    while (r15.hasNext()) {
                        int i216 = i26 + 1;
                        if (i26 < 0) {
                            v.x();
                        }
                        ButtonIconData buttonIconDataA8 = ((x50.a.MenuButtonData) obj).a();
                        if (v.p(iconList.a()) == i26) {
                            d0Var14 = d0Var11;
                        } else {
                            d0Var14 = null;
                        }
                        if (i26 == 0) {
                            d0Var15 = d0Var12;
                        } else {
                            d0Var15 = null;
                        }
                        if (v.p(iconList.a()) == i26) {
                            d0Var16 = d0Var13;
                        } else {
                            d0Var16 = null;
                        }
                        j(buttonIconDataA8, d0Var14, d0Var15, d0Var16, rVarH, 0, 0);
                        i26 = i216;
                    }
                    rVarH.R();
                } else {
                    if (aVar == null) {
                        rVarH.X(1511713278);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(1511738479);
                    d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                    rVarH.R();
                }
            }
            if (t.k()) {
                t.n();
            }
            d0 d0Var114 = d0Var11;
            d0Var8 = d0Var13;
            d0Var7 = d0Var114;
            d0Var6 = d0Var12;
        } else {
            rVarH.O();
            d0Var6 = d0Var2;
            d0Var7 = d0Var4;
            d0Var8 = d0Var5;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: x50.g
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return h.g(aVar, d0Var7, d0Var6, d0Var8, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(x50.a aVar, d0 d0Var, d0 d0Var2, d0 d0Var3, int i15, int i16, r rVar, int i17) {
        f(aVar, d0Var, d0Var2, d0Var3, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x0179  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void h(final NavigationButtonData navigationButtonData, d0 d0Var, d0 d0Var2, d0 d0Var3, r rVar, final int i15, final int i16) {
        int i17;
        d0 d0Var4;
        int i18;
        d0 d0Var5;
        int i19;
        int i25;
        d0 d0Var6;
        int i26;
        boolean z15;
        final d0 d0Var7;
        final d0 d0Var8;
        final d0 d0Var9;
        d5 d5VarM;
        d0 d0Var10;
        d0 d0Var11;
        NavigationButtonData.a resource;
        r rVarH = rVar.h(1221557349);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(navigationButtonData) : rVarH.G(navigationButtonData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i27 = i16 & 1;
        if (i27 == 0) {
            if ((i15 & 48) == 0) {
                d0Var4 = d0Var;
                i17 |= rVarH.W(d0Var4) ? 32 : 16;
            }
            i18 = i16 & 2;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    d0Var5 = d0Var2;
                    if (rVarH.W(d0Var5)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 4;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        d0Var6 = d0Var3;
                        if (rVarH.W(d0Var6)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    if ((i17 & 1171) != 1170) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i27 != 0) {
                            d0Var7 = null;
                        } else {
                            d0Var7 = d0Var4;
                        }
                        if (i18 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var5;
                        }
                        if (i25 != 0) {
                            d0Var11 = null;
                        } else {
                            d0Var11 = d0Var6;
                        }
                        if (t.k()) {
                            t.o(1221557349, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton (TopAppBarButton.kt:98)");
                        }
                        if (navigationButtonData == null) {
                            rVarH.X(1390547554);
                            d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                            rVarH.R();
                            d0Var10 = d0Var10;
                            d0Var11 = d0Var11;
                            d0Var7 = d0Var7;
                        } else {
                            rVarH.X(157393131);
                            resource = navigationButtonData.getResource();
                            if (resource instanceof NavigationButtonData.a.Icon) {
                                rVarH.X(157445924);
                                j(new ButtonIconData(null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getIconResId(), a.f216884a, null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getContentDescription(), navigationButtonData.a(), 9, null), d0Var10, d0Var11, d0Var7, rVarH, ((i17 >> 3) & 1008) | ((i17 << 6) & 7168), 0);
                                rVarH.R();
                            } else {
                                if (fr.t.c(resource, NavigationButtonData.a.C5782b.f216863a)) {
                                    rVarH.X(1390550519);
                                    rVarH.R();
                                    throw new oq.p();
                                }
                                rVarH.X(1390566573);
                                h60.f.e(a3.p(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 2, null), null, Integer.valueOf(a30.a.f2274d), h60.g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 3072, 0, 4082);
                                rVarH = rVarH;
                                rVarH.R();
                            }
                            rVarH.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        d0Var8 = d0Var10;
                        d0Var9 = d0Var11;
                    } else {
                        rVarH.O();
                        d0Var7 = d0Var4;
                        d0Var8 = d0Var5;
                        d0Var9 = d0Var6;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: x50.f
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return h.i(navigationButtonData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                d0Var6 = d0Var3;
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var7 = null;
                    } else {
                        d0Var7 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var6;
                    }
                    if (t.k()) {
                        t.o(1221557349, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton (TopAppBarButton.kt:98)");
                    }
                    if (navigationButtonData == null) {
                        rVarH.X(1390547554);
                        d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                        rVarH.R();
                        d0Var10 = d0Var10;
                        d0Var11 = d0Var11;
                        d0Var7 = d0Var7;
                    } else {
                        rVarH.X(157393131);
                        resource = navigationButtonData.getResource();
                        if (resource instanceof NavigationButtonData.a.Icon) {
                            rVarH.X(157445924);
                            j(new ButtonIconData(null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getIconResId(), a.f216884a, null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getContentDescription(), navigationButtonData.a(), 9, null), d0Var10, d0Var11, d0Var7, rVarH, ((i17 >> 3) & 1008) | ((i17 << 6) & 7168), 0);
                            rVarH.R();
                        } else {
                            if (fr.t.c(resource, NavigationButtonData.a.C5782b.f216863a)) {
                                rVarH.X(1390550519);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1390566573);
                            h60.f.e(a3.p(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 2, null), null, Integer.valueOf(a30.a.f2274d), h60.g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 3072, 0, 4082);
                            rVarH = rVarH;
                            rVarH.R();
                        }
                        rVarH.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    d0Var8 = d0Var10;
                    d0Var9 = d0Var11;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.f
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h.i(navigationButtonData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            d0Var5 = d0Var2;
            i25 = i16 & 4;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    d0Var6 = d0Var3;
                    if (rVarH.W(d0Var6)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var7 = null;
                    } else {
                        d0Var7 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var6;
                    }
                    if (t.k()) {
                        t.o(1221557349, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton (TopAppBarButton.kt:98)");
                    }
                    if (navigationButtonData == null) {
                        rVarH.X(1390547554);
                        d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                        rVarH.R();
                        d0Var10 = d0Var10;
                        d0Var11 = d0Var11;
                        d0Var7 = d0Var7;
                    } else {
                        rVarH.X(157393131);
                        resource = navigationButtonData.getResource();
                        if (resource instanceof NavigationButtonData.a.Icon) {
                            rVarH.X(157445924);
                            j(new ButtonIconData(null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getIconResId(), a.f216884a, null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getContentDescription(), navigationButtonData.a(), 9, null), d0Var10, d0Var11, d0Var7, rVarH, ((i17 >> 3) & 1008) | ((i17 << 6) & 7168), 0);
                            rVarH.R();
                        } else {
                            if (fr.t.c(resource, NavigationButtonData.a.C5782b.f216863a)) {
                                rVarH.X(1390550519);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1390566573);
                            h60.f.e(a3.p(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 2, null), null, Integer.valueOf(a30.a.f2274d), h60.g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 3072, 0, 4082);
                            rVarH = rVarH;
                            rVarH.R();
                        }
                        rVarH.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    d0Var8 = d0Var10;
                    d0Var9 = d0Var11;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.f
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h.i(navigationButtonData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            d0Var6 = d0Var3;
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var7 = null;
                } else {
                    d0Var7 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var6;
                }
                if (t.k()) {
                    t.o(1221557349, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton (TopAppBarButton.kt:98)");
                }
                if (navigationButtonData == null) {
                    rVarH.X(1390547554);
                    d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                    rVarH.R();
                    d0Var10 = d0Var10;
                    d0Var11 = d0Var11;
                    d0Var7 = d0Var7;
                } else {
                    rVarH.X(157393131);
                    resource = navigationButtonData.getResource();
                    if (resource instanceof NavigationButtonData.a.Icon) {
                        rVarH.X(157445924);
                        j(new ButtonIconData(null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getIconResId(), a.f216884a, null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getContentDescription(), navigationButtonData.a(), 9, null), d0Var10, d0Var11, d0Var7, rVarH, ((i17 >> 3) & 1008) | ((i17 << 6) & 7168), 0);
                        rVarH.R();
                    } else {
                        if (fr.t.c(resource, NavigationButtonData.a.C5782b.f216863a)) {
                            rVarH.X(1390550519);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1390566573);
                        h60.f.e(a3.p(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 2, null), null, Integer.valueOf(a30.a.f2274d), h60.g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 3072, 0, 4082);
                        rVarH = rVarH;
                        rVarH.R();
                    }
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                d0Var8 = d0Var10;
                d0Var9 = d0Var11;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.i(navigationButtonData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        d0Var4 = d0Var;
        i18 = i16 & 2;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                d0Var5 = d0Var2;
                if (rVarH.W(d0Var5)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 4;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    d0Var6 = d0Var3;
                    if (rVarH.W(d0Var6)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var7 = null;
                    } else {
                        d0Var7 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var6;
                    }
                    if (t.k()) {
                        t.o(1221557349, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton (TopAppBarButton.kt:98)");
                    }
                    if (navigationButtonData == null) {
                        rVarH.X(1390547554);
                        d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                        rVarH.R();
                        d0Var10 = d0Var10;
                        d0Var11 = d0Var11;
                        d0Var7 = d0Var7;
                    } else {
                        rVarH.X(157393131);
                        resource = navigationButtonData.getResource();
                        if (resource instanceof NavigationButtonData.a.Icon) {
                            rVarH.X(157445924);
                            j(new ButtonIconData(null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getIconResId(), a.f216884a, null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getContentDescription(), navigationButtonData.a(), 9, null), d0Var10, d0Var11, d0Var7, rVarH, ((i17 >> 3) & 1008) | ((i17 << 6) & 7168), 0);
                            rVarH.R();
                        } else {
                            if (fr.t.c(resource, NavigationButtonData.a.C5782b.f216863a)) {
                                rVarH.X(1390550519);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1390566573);
                            h60.f.e(a3.p(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 2, null), null, Integer.valueOf(a30.a.f2274d), h60.g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 3072, 0, 4082);
                            rVarH = rVarH;
                            rVarH.R();
                        }
                        rVarH.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    d0Var8 = d0Var10;
                    d0Var9 = d0Var11;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                    d0Var9 = d0Var6;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.f
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h.i(navigationButtonData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            d0Var6 = d0Var3;
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var7 = null;
                } else {
                    d0Var7 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var6;
                }
                if (t.k()) {
                    t.o(1221557349, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton (TopAppBarButton.kt:98)");
                }
                if (navigationButtonData == null) {
                    rVarH.X(1390547554);
                    d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                    rVarH.R();
                    d0Var10 = d0Var10;
                    d0Var11 = d0Var11;
                    d0Var7 = d0Var7;
                } else {
                    rVarH.X(157393131);
                    resource = navigationButtonData.getResource();
                    if (resource instanceof NavigationButtonData.a.Icon) {
                        rVarH.X(157445924);
                        j(new ButtonIconData(null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getIconResId(), a.f216884a, null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getContentDescription(), navigationButtonData.a(), 9, null), d0Var10, d0Var11, d0Var7, rVarH, ((i17 >> 3) & 1008) | ((i17 << 6) & 7168), 0);
                        rVarH.R();
                    } else {
                        if (fr.t.c(resource, NavigationButtonData.a.C5782b.f216863a)) {
                            rVarH.X(1390550519);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1390566573);
                        h60.f.e(a3.p(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 2, null), null, Integer.valueOf(a30.a.f2274d), h60.g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 3072, 0, 4082);
                        rVarH = rVarH;
                        rVarH.R();
                    }
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                d0Var8 = d0Var10;
                d0Var9 = d0Var11;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.i(navigationButtonData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        d0Var5 = d0Var2;
        i25 = i16 & 4;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                d0Var6 = d0Var3;
                if (rVarH.W(d0Var6)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var7 = null;
                } else {
                    d0Var7 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var6;
                }
                if (t.k()) {
                    t.o(1221557349, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton (TopAppBarButton.kt:98)");
                }
                if (navigationButtonData == null) {
                    rVarH.X(1390547554);
                    d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                    rVarH.R();
                    d0Var10 = d0Var10;
                    d0Var11 = d0Var11;
                    d0Var7 = d0Var7;
                } else {
                    rVarH.X(157393131);
                    resource = navigationButtonData.getResource();
                    if (resource instanceof NavigationButtonData.a.Icon) {
                        rVarH.X(157445924);
                        j(new ButtonIconData(null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getIconResId(), a.f216884a, null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getContentDescription(), navigationButtonData.a(), 9, null), d0Var10, d0Var11, d0Var7, rVarH, ((i17 >> 3) & 1008) | ((i17 << 6) & 7168), 0);
                        rVarH.R();
                    } else {
                        if (fr.t.c(resource, NavigationButtonData.a.C5782b.f216863a)) {
                            rVarH.X(1390550519);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1390566573);
                        h60.f.e(a3.p(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 2, null), null, Integer.valueOf(a30.a.f2274d), h60.g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 3072, 0, 4082);
                        rVarH = rVarH;
                        rVarH.R();
                    }
                    rVarH.R();
                }
                if (t.k()) {
                    t.n();
                }
                d0Var8 = d0Var10;
                d0Var9 = d0Var11;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
                d0Var9 = d0Var6;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.f
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.i(navigationButtonData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        d0Var6 = d0Var3;
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i27 != 0) {
                d0Var7 = null;
            } else {
                d0Var7 = d0Var4;
            }
            if (i18 != 0) {
                d0Var10 = null;
            } else {
                d0Var10 = d0Var5;
            }
            if (i25 != 0) {
                d0Var11 = null;
            } else {
                d0Var11 = d0Var6;
            }
            if (t.k()) {
                t.o(1221557349, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.CreateNavigationButton (TopAppBarButton.kt:98)");
            }
            if (navigationButtonData == null) {
                rVarH.X(1390547554);
                d1.r.b(androidx.compose.foundation.layout.d.t(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600()), rVarH, 0);
                rVarH.R();
                d0Var10 = d0Var10;
                d0Var11 = d0Var11;
                d0Var7 = d0Var7;
            } else {
                rVarH.X(157393131);
                resource = navigationButtonData.getResource();
                if (resource instanceof NavigationButtonData.a.Icon) {
                    rVarH.X(157445924);
                    j(new ButtonIconData(null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getIconResId(), a.f216884a, null, ((NavigationButtonData.a.Icon) navigationButtonData.getResource()).getContentDescription(), navigationButtonData.a(), 9, null), d0Var10, d0Var11, d0Var7, rVarH, ((i17 >> 3) & 1008) | ((i17 << 6) & 7168), 0);
                    rVarH.R();
                } else {
                    if (fr.t.c(resource, NavigationButtonData.a.C5782b.f216863a)) {
                        rVarH.X(1390550519);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(1390566573);
                    h60.f.e(a3.p(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing150(), 0.0f, 2, null), null, Integer.valueOf(a30.a.f2274d), h60.g.SBig, 0L, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVarH, 3072, 0, 4082);
                    rVarH = rVarH;
                    rVarH.R();
                }
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
            d0Var8 = d0Var10;
            d0Var9 = d0Var11;
        } else {
            rVarH.O();
            d0Var7 = d0Var4;
            d0Var8 = d0Var5;
            d0Var9 = d0Var6;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: x50.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(navigationButtonData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(NavigationButtonData navigationButtonData, d0 d0Var, d0 d0Var2, d0 d0Var3, int i15, int i16, r rVar, int i17) {
        h(navigationButtonData, d0Var, d0Var2, d0Var3, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0167  */
    /* JADX WARN: Code duplicated, block: B:97:0x016b  */
    public static final void j(final ButtonIconData buttonIconData, d0 d0Var, d0 d0Var2, d0 d0Var3, r rVar, final int i15, final int i16) {
        ButtonIconData buttonIconData2;
        int i17;
        d0 d0Var4;
        int i18;
        d0 d0Var5;
        int i19;
        int i25;
        d0 d0Var6;
        int i26;
        boolean z15;
        final d0 d0Var7;
        final d0 d0Var8;
        final d0 d0Var9;
        d5 d5VarM;
        final d0 d0Var10;
        final d0 d0Var11;
        m mVarA;
        m mVarA2;
        m mVarA3;
        er.a<androidx.compose.ui.node.c> aVarB;
        boolean z16;
        Object objE;
        boolean z17;
        Object objE2;
        r rVarH = rVar.h(-2112406111);
        if ((i15 & 6) == 0) {
            buttonIconData2 = buttonIconData;
            i17 = (rVarH.G(buttonIconData2) ? 4 : 2) | i15;
        } else {
            buttonIconData2 = buttonIconData;
            i17 = i15;
        }
        int i27 = i16 & 2;
        if (i27 == 0) {
            if ((i15 & 48) == 0) {
                d0Var4 = d0Var;
                i17 |= rVarH.W(d0Var4) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    d0Var5 = d0Var2;
                    if (rVarH.W(d0Var5)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        d0Var6 = d0Var3;
                        if (rVarH.W(d0Var6)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    if ((i17 & 1171) != 1170) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i27 != 0) {
                            d0Var10 = null;
                        } else {
                            d0Var10 = d0Var4;
                        }
                        if (i18 != 0) {
                            d0Var11 = null;
                        } else {
                            d0Var11 = d0Var5;
                        }
                        if (i25 != 0) {
                            d0Var6 = null;
                        }
                        if (t.k()) {
                            t.o(-2112406111, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBarButton (TopAppBarButton.kt:24)");
                        }
                        mVarA = m.INSTANCE;
                        m mVarT = androidx.compose.foundation.layout.d.t(mVarA, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                        if (d0Var6 != null) {
                            mVarA2 = g0.a(mVarA, d0Var6);
                        } else {
                            mVarA2 = mVarA;
                        }
                        m mVarU = mVarT.u(mVarA2);
                        if (d0Var10 != null) {
                            rVarH.X(-829152299);
                            if ((i17 & 112) == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objE2 = rVarH.E();
                            if (z17 || objE2 == r.INSTANCE.a()) {
                                objE2 = new l() { // from class: x50.c
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return h.k(d0Var10, (l3.v) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            mVarA3 = y.a(mVarA, (l) objE2);
                            rVarH.R();
                        } else {
                            rVarH.X(-829072381);
                            rVarH.R();
                            mVarA3 = mVarA;
                        }
                        m mVarU2 = mVarU.u(mVarA3);
                        if (d0Var11 != null) {
                            rVarH.X(-828974483);
                            if ((i17 & 896) == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE = rVarH.E();
                            if (z16 || objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: x50.d
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return h.l(d0Var11, (l3.v) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            mVarA = y.a(mVarA, (l) objE);
                            rVarH.R();
                        } else {
                            rVarH.X(-828886877);
                            rVarH.R();
                        }
                        m mVarU3 = mVarU2.u(mVarA);
                        w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT = rVarH.t();
                        m mVarE = f3.j.e(rVarH, mVarU3);
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
                        r rVarC = n6.c(rVarH);
                        n6.i(rVarC, w0VarI, companion.d());
                        n6.i(rVarC, e0VarT, companion.f());
                        n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                        n6.g(rVarC, companion.a());
                        n6.i(rVarC, mVarE, companion.e());
                        x xVar = x.f39368a;
                        i30.g.f(buttonIconData2, false, false, rVarH, i17 & 14, 6);
                        rVarH.x();
                        if (t.k()) {
                            t.n();
                        }
                        d0Var7 = d0Var10;
                        d0Var8 = d0Var11;
                    } else {
                        rVarH.O();
                        d0Var7 = d0Var4;
                        d0Var8 = d0Var5;
                    }
                    d0Var9 = d0Var6;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: x50.e
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return h.m(buttonIconData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                d0Var6 = d0Var3;
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var6 = null;
                    }
                    if (t.k()) {
                        t.o(-2112406111, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBarButton (TopAppBarButton.kt:24)");
                    }
                    mVarA = m.INSTANCE;
                    m mVarT2 = androidx.compose.foundation.layout.d.t(mVarA, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                    if (d0Var6 != null) {
                        mVarA2 = g0.a(mVarA, d0Var6);
                    } else {
                        mVarA2 = mVarA;
                    }
                    m mVarU4 = mVarT2.u(mVarA2);
                    if (d0Var10 != null) {
                        rVarH.X(-829152299);
                        if ((i17 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE2 = rVarH.E();
                        if (z17) {
                            objE2 = new l() { // from class: x50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.k(d0Var10, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: x50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.k(d0Var10, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        mVarA3 = y.a(mVarA, (l) objE2);
                        rVarH.R();
                    } else {
                        rVarH.X(-829072381);
                        rVarH.R();
                        mVarA3 = mVarA;
                    }
                    m mVarU5 = mVarU4.u(mVarA3);
                    if (d0Var11 != null) {
                        rVarH.X(-828974483);
                        if ((i17 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new l() { // from class: x50.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.l(d0Var11, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new l() { // from class: x50.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.l(d0Var11, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarA = y.a(mVarA, (l) objE);
                        rVarH.R();
                    } else {
                        rVarH.X(-828886877);
                        rVarH.R();
                    }
                    m mVarU6 = mVarU5.u(mVarA);
                    w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.e(), false);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT2 = rVarH.t();
                    m mVarE2 = f3.j.e(rVarH, mVarU6);
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
                    r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarI2, companion2.d());
                    n6.i(rVarC2, e0VarT2, companion2.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                    n6.g(rVarC2, companion2.a());
                    n6.i(rVarC2, mVarE2, companion2.e());
                    x xVar2 = x.f39368a;
                    i30.g.f(buttonIconData2, false, false, rVarH, i17 & 14, 6);
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    d0Var7 = d0Var10;
                    d0Var8 = d0Var11;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                }
                d0Var9 = d0Var6;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h.m(buttonIconData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            d0Var5 = d0Var2;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    d0Var6 = d0Var3;
                    if (rVarH.W(d0Var6)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var6 = null;
                    }
                    if (t.k()) {
                        t.o(-2112406111, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBarButton (TopAppBarButton.kt:24)");
                    }
                    mVarA = m.INSTANCE;
                    m mVarT3 = androidx.compose.foundation.layout.d.t(mVarA, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                    if (d0Var6 != null) {
                        mVarA2 = g0.a(mVarA, d0Var6);
                    } else {
                        mVarA2 = mVarA;
                    }
                    m mVarU7 = mVarT3.u(mVarA2);
                    if (d0Var10 != null) {
                        rVarH.X(-829152299);
                        if ((i17 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE2 = rVarH.E();
                        if (z17) {
                            objE2 = new l() { // from class: x50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.k(d0Var10, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: x50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.k(d0Var10, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        mVarA3 = y.a(mVarA, (l) objE2);
                        rVarH.R();
                    } else {
                        rVarH.X(-829072381);
                        rVarH.R();
                        mVarA3 = mVarA;
                    }
                    m mVarU8 = mVarU7.u(mVarA3);
                    if (d0Var11 != null) {
                        rVarH.X(-828974483);
                        if ((i17 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new l() { // from class: x50.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.l(d0Var11, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new l() { // from class: x50.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.l(d0Var11, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarA = y.a(mVarA, (l) objE);
                        rVarH.R();
                    } else {
                        rVarH.X(-828886877);
                        rVarH.R();
                    }
                    m mVarU9 = mVarU8.u(mVarA);
                    w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.e(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT3 = rVarH.t();
                    m mVarE3 = f3.j.e(rVarH, mVarU9);
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
                    r rVarC3 = n6.c(rVarH);
                    n6.i(rVarC3, w0VarI3, companion3.d());
                    n6.i(rVarC3, e0VarT3, companion3.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                    n6.g(rVarC3, companion3.a());
                    n6.i(rVarC3, mVarE3, companion3.e());
                    x xVar3 = x.f39368a;
                    i30.g.f(buttonIconData2, false, false, rVarH, i17 & 14, 6);
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    d0Var7 = d0Var10;
                    d0Var8 = d0Var11;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                }
                d0Var9 = d0Var6;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h.m(buttonIconData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            d0Var6 = d0Var3;
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var6 = null;
                }
                if (t.k()) {
                    t.o(-2112406111, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBarButton (TopAppBarButton.kt:24)");
                }
                mVarA = m.INSTANCE;
                m mVarT4 = androidx.compose.foundation.layout.d.t(mVarA, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                if (d0Var6 != null) {
                    mVarA2 = g0.a(mVarA, d0Var6);
                } else {
                    mVarA2 = mVarA;
                }
                m mVarU10 = mVarT4.u(mVarA2);
                if (d0Var10 != null) {
                    rVarH.X(-829152299);
                    if ((i17 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = new l() { // from class: x50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.k(d0Var10, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: x50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.k(d0Var10, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    mVarA3 = y.a(mVarA, (l) objE2);
                    rVarH.R();
                } else {
                    rVarH.X(-829072381);
                    rVarH.R();
                    mVarA3 = mVarA;
                }
                m mVarU11 = mVarU10.u(mVarA3);
                if (d0Var11 != null) {
                    rVarH.X(-828974483);
                    if ((i17 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new l() { // from class: x50.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.l(d0Var11, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new l() { // from class: x50.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.l(d0Var11, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarA = y.a(mVarA, (l) objE);
                    rVarH.R();
                } else {
                    rVarH.X(-828886877);
                    rVarH.R();
                }
                m mVarU12 = mVarU11.u(mVarA);
                w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT4 = rVarH.t();
                m mVarE4 = f3.j.e(rVarH, mVarU12);
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
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI4, companion4.d());
                n6.i(rVarC4, e0VarT4, companion4.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
                n6.g(rVarC4, companion4.a());
                n6.i(rVarC4, mVarE4, companion4.e());
                x xVar4 = x.f39368a;
                i30.g.f(buttonIconData2, false, false, rVarH, i17 & 14, 6);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                d0Var7 = d0Var10;
                d0Var8 = d0Var11;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
            }
            d0Var9 = d0Var6;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.m(buttonIconData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        d0Var4 = d0Var;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                d0Var5 = d0Var2;
                if (rVarH.W(d0Var5)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    d0Var6 = d0Var3;
                    if (rVarH.W(d0Var6)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        d0Var10 = null;
                    } else {
                        d0Var10 = d0Var4;
                    }
                    if (i18 != 0) {
                        d0Var11 = null;
                    } else {
                        d0Var11 = d0Var5;
                    }
                    if (i25 != 0) {
                        d0Var6 = null;
                    }
                    if (t.k()) {
                        t.o(-2112406111, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBarButton (TopAppBarButton.kt:24)");
                    }
                    mVarA = m.INSTANCE;
                    m mVarT5 = androidx.compose.foundation.layout.d.t(mVarA, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                    if (d0Var6 != null) {
                        mVarA2 = g0.a(mVarA, d0Var6);
                    } else {
                        mVarA2 = mVarA;
                    }
                    m mVarU13 = mVarT5.u(mVarA2);
                    if (d0Var10 != null) {
                        rVarH.X(-829152299);
                        if ((i17 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE2 = rVarH.E();
                        if (z17) {
                            objE2 = new l() { // from class: x50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.k(d0Var10, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: x50.c
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.k(d0Var10, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        mVarA3 = y.a(mVarA, (l) objE2);
                        rVarH.R();
                    } else {
                        rVarH.X(-829072381);
                        rVarH.R();
                        mVarA3 = mVarA;
                    }
                    m mVarU14 = mVarU13.u(mVarA3);
                    if (d0Var11 != null) {
                        rVarH.X(-828974483);
                        if ((i17 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new l() { // from class: x50.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.l(d0Var11, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new l() { // from class: x50.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h.l(d0Var11, (l3.v) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarA = y.a(mVarA, (l) objE);
                        rVarH.R();
                    } else {
                        rVarH.X(-828886877);
                        rVarH.R();
                    }
                    m mVarU15 = mVarU14.u(mVarA);
                    w0 w0VarI5 = d1.r.i(f3.c.INSTANCE.e(), false);
                    int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT5 = rVarH.t();
                    m mVarE5 = f3.j.e(rVarH, mVarU15);
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
                    r rVarC5 = n6.c(rVarH);
                    n6.i(rVarC5, w0VarI5, companion5.d());
                    n6.i(rVarC5, e0VarT5, companion5.f());
                    n6.i(rVarC5, Integer.valueOf(iHashCode5), companion5.c());
                    n6.g(rVarC5, companion5.a());
                    n6.i(rVarC5, mVarE5, companion5.e());
                    x xVar5 = x.f39368a;
                    i30.g.f(buttonIconData2, false, false, rVarH, i17 & 14, 6);
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    d0Var7 = d0Var10;
                    d0Var8 = d0Var11;
                } else {
                    rVarH.O();
                    d0Var7 = d0Var4;
                    d0Var8 = d0Var5;
                }
                d0Var9 = d0Var6;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: x50.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h.m(buttonIconData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            d0Var6 = d0Var3;
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var6 = null;
                }
                if (t.k()) {
                    t.o(-2112406111, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBarButton (TopAppBarButton.kt:24)");
                }
                mVarA = m.INSTANCE;
                m mVarT6 = androidx.compose.foundation.layout.d.t(mVarA, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                if (d0Var6 != null) {
                    mVarA2 = g0.a(mVarA, d0Var6);
                } else {
                    mVarA2 = mVarA;
                }
                m mVarU16 = mVarT6.u(mVarA2);
                if (d0Var10 != null) {
                    rVarH.X(-829152299);
                    if ((i17 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = new l() { // from class: x50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.k(d0Var10, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: x50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.k(d0Var10, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    mVarA3 = y.a(mVarA, (l) objE2);
                    rVarH.R();
                } else {
                    rVarH.X(-829072381);
                    rVarH.R();
                    mVarA3 = mVarA;
                }
                m mVarU17 = mVarU16.u(mVarA3);
                if (d0Var11 != null) {
                    rVarH.X(-828974483);
                    if ((i17 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new l() { // from class: x50.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.l(d0Var11, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new l() { // from class: x50.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.l(d0Var11, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarA = y.a(mVarA, (l) objE);
                    rVarH.R();
                } else {
                    rVarH.X(-828886877);
                    rVarH.R();
                }
                m mVarU18 = mVarU17.u(mVarA);
                w0 w0VarI6 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT6 = rVarH.t();
                m mVarE6 = f3.j.e(rVarH, mVarU18);
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
                r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarI6, companion6.d());
                n6.i(rVarC6, e0VarT6, companion6.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion6.c());
                n6.g(rVarC6, companion6.a());
                n6.i(rVarC6, mVarE6, companion6.e());
                x xVar6 = x.f39368a;
                i30.g.f(buttonIconData2, false, false, rVarH, i17 & 14, 6);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                d0Var7 = d0Var10;
                d0Var8 = d0Var11;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
            }
            d0Var9 = d0Var6;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.m(buttonIconData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        d0Var5 = d0Var2;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                d0Var6 = d0Var3;
                if (rVarH.W(d0Var6)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    d0Var10 = null;
                } else {
                    d0Var10 = d0Var4;
                }
                if (i18 != 0) {
                    d0Var11 = null;
                } else {
                    d0Var11 = d0Var5;
                }
                if (i25 != 0) {
                    d0Var6 = null;
                }
                if (t.k()) {
                    t.o(-2112406111, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBarButton (TopAppBarButton.kt:24)");
                }
                mVarA = m.INSTANCE;
                m mVarT7 = androidx.compose.foundation.layout.d.t(mVarA, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
                if (d0Var6 != null) {
                    mVarA2 = g0.a(mVarA, d0Var6);
                } else {
                    mVarA2 = mVarA;
                }
                m mVarU19 = mVarT7.u(mVarA2);
                if (d0Var10 != null) {
                    rVarH.X(-829152299);
                    if ((i17 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = new l() { // from class: x50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.k(d0Var10, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: x50.c
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.k(d0Var10, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    mVarA3 = y.a(mVarA, (l) objE2);
                    rVarH.R();
                } else {
                    rVarH.X(-829072381);
                    rVarH.R();
                    mVarA3 = mVarA;
                }
                m mVarU110 = mVarU19.u(mVarA3);
                if (d0Var11 != null) {
                    rVarH.X(-828974483);
                    if ((i17 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new l() { // from class: x50.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.l(d0Var11, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new l() { // from class: x50.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h.l(d0Var11, (l3.v) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    mVarA = y.a(mVarA, (l) objE);
                    rVarH.R();
                } else {
                    rVarH.X(-828886877);
                    rVarH.R();
                }
                m mVarU111 = mVarU110.u(mVarA);
                w0 w0VarI7 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT7 = rVarH.t();
                m mVarE7 = f3.j.e(rVarH, mVarU111);
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
                r rVarC7 = n6.c(rVarH);
                n6.i(rVarC7, w0VarI7, companion7.d());
                n6.i(rVarC7, e0VarT7, companion7.f());
                n6.i(rVarC7, Integer.valueOf(iHashCode7), companion7.c());
                n6.g(rVarC7, companion7.a());
                n6.i(rVarC7, mVarE7, companion7.e());
                x xVar7 = x.f39368a;
                i30.g.f(buttonIconData2, false, false, rVarH, i17 & 14, 6);
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                d0Var7 = d0Var10;
                d0Var8 = d0Var11;
            } else {
                rVarH.O();
                d0Var7 = d0Var4;
                d0Var8 = d0Var5;
            }
            d0Var9 = d0Var6;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: x50.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h.m(buttonIconData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        d0Var6 = d0Var3;
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i27 != 0) {
                d0Var10 = null;
            } else {
                d0Var10 = d0Var4;
            }
            if (i18 != 0) {
                d0Var11 = null;
            } else {
                d0Var11 = d0Var5;
            }
            if (i25 != 0) {
                d0Var6 = null;
            }
            if (t.k()) {
                t.o(-2112406111, i17, -1, "pl.gov.coi.common.ui.ds.topappbar.TopAppBarButton (TopAppBarButton.kt:24)");
            }
            mVarA = m.INSTANCE;
            m mVarT8 = androidx.compose.foundation.layout.d.t(mVarA, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing600());
            if (d0Var6 != null) {
                mVarA2 = g0.a(mVarA, d0Var6);
            } else {
                mVarA2 = mVarA;
            }
            m mVarU112 = mVarT8.u(mVarA2);
            if (d0Var10 != null) {
                rVarH.X(-829152299);
                if ((i17 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE2 = rVarH.E();
                if (z17) {
                    objE2 = new l() { // from class: x50.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.k(d0Var10, (l3.v) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: x50.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.k(d0Var10, (l3.v) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                mVarA3 = y.a(mVarA, (l) objE2);
                rVarH.R();
            } else {
                rVarH.X(-829072381);
                rVarH.R();
                mVarA3 = mVarA;
            }
            m mVarU113 = mVarU112.u(mVarA3);
            if (d0Var11 != null) {
                rVarH.X(-828974483);
                if ((i17 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new l() { // from class: x50.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.l(d0Var11, (l3.v) obj);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new l() { // from class: x50.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.l(d0Var11, (l3.v) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                mVarA = y.a(mVarA, (l) objE);
                rVarH.R();
            } else {
                rVarH.X(-828886877);
                rVarH.R();
            }
            m mVarU114 = mVarU113.u(mVarA);
            w0 w0VarI8 = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT8 = rVarH.t();
            m mVarE8 = f3.j.e(rVarH, mVarU114);
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
            r rVarC8 = n6.c(rVarH);
            n6.i(rVarC8, w0VarI8, companion8.d());
            n6.i(rVarC8, e0VarT8, companion8.f());
            n6.i(rVarC8, Integer.valueOf(iHashCode8), companion8.c());
            n6.g(rVarC8, companion8.a());
            n6.i(rVarC8, mVarE8, companion8.e());
            x xVar8 = x.f39368a;
            i30.g.f(buttonIconData2, false, false, rVarH, i17 & 14, 6);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            d0Var7 = d0Var10;
            d0Var8 = d0Var11;
        } else {
            rVarH.O();
            d0Var7 = d0Var4;
            d0Var8 = d0Var5;
        }
        d0Var9 = d0Var6;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: x50.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.m(buttonIconData, d0Var7, d0Var8, d0Var9, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d0 d0Var, l3.v vVar) {
        vVar.m(d0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(ButtonIconData buttonIconData, d0 d0Var, d0 d0Var2, d0 d0Var3, int i15, int i16, r rVar, int i17) {
        j(buttonIconData, d0Var, d0Var2, d0Var3, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
