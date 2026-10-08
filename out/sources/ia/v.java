package ia;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r0;
import p076m2.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001as\u0010\f\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u000e\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lia/x;", "Lha/g;", "state", "", "isForwardEnabled", "Lkotlin/Function0;", "Loq/i0;", "onForwardCancelled", "onForwardCompleted", "isBackEnabled", "onBackCancelled", "onBackCompleted", "s", "(Lia/x;ZLer/a;Ler/a;ZLer/a;Ler/a;Lm2/r;II)V", "n", "(Lia/x;ZLer/a;Ler/a;Lm2/r;II)V", "navigationevent-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class v {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ia/v$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f90597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f90598b;

        public a(e eVar, x xVar) {
            this.f90597a = eVar;
            this.f90598b = xVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f90597a.x();
            this.f90598b.i(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(x xVar, boolean z15, er.a aVar, er.a aVar2, boolean z16, er.a aVar3, er.a aVar4, int i15, int i16, p076m2.r rVar, int i17) {
        s(xVar, z15, aVar, aVar2, z16, aVar3, aVar4, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void n(final x<? extends ha.g> xVar, boolean z15, er.a<i0> aVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15, final int i16) {
        x<? extends ha.g> xVar2;
        int i17;
        boolean z16;
        int i18;
        er.a<i0> aVar3;
        int i19;
        boolean z17;
        final boolean z18;
        final er.a<i0> aVar4;
        d5 d5VarM;
        er.a<i0> aVar5;
        Object objE;
        p076m2.r.Companion companion;
        Object objE2;
        Object objE3;
        int i25;
        p076m2.r rVarH = rVar.h(1220469155);
        if ((i15 & 6) == 0) {
            xVar2 = xVar;
            i17 = (rVarH.W(xVar2) ? 4 : 2) | i15;
        } else {
            xVar2 = xVar;
            i17 = i15;
        }
        int i26 = i16 & 2;
        if (i26 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    aVar3 = aVar;
                    if (rVarH.G(aVar3)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if (rVarH.G(aVar2)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
                if ((i17 & 1171) != 1170) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    boolean z19 = i26 == 0 ? z16 : true;
                    if (i18 != 0) {
                        objE3 = rVarH.E();
                        if (objE3 == p076m2.r.INSTANCE.a()) {
                            objE3 = new er.a() { // from class: ia.i
                                @Override // er.a
                                public final Object a() {
                                    return v.o();
                                }
                            };
                            rVarH.v(objE3);
                        }
                        aVar5 = (er.a) objE3;
                    } else {
                        aVar5 = aVar3;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1220469155, i17, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:152)");
                    }
                    objE = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new er.a() { // from class: ia.m
                            @Override // er.a
                            public final Object a() {
                                return v.p();
                            }
                        };
                        rVarH.v(objE);
                    }
                    er.a aVar6 = (er.a) objE;
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = new er.a() { // from class: ia.n
                            @Override // er.a
                            public final Object a() {
                                return v.q();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    er.a aVar7 = (er.a) objE2;
                    int i27 = (i17 & 14) | 3504;
                    int i28 = i17 << 9;
                    s(xVar2, false, aVar6, aVar7, z19, aVar5, aVar2, rVarH, i27 | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    z18 = z19;
                    aVar4 = aVar5;
                } else {
                    rVarH.O();
                    z18 = z16;
                    aVar4 = aVar3;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: ia.o
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return v.r(xVar, z18, aVar4, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            aVar3 = aVar;
            if ((i15 & 3072) == 0) {
                if (rVarH.G(aVar2)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i26 == 0) {
                }
                if (i18 != 0) {
                    objE3 = rVarH.E();
                    if (objE3 == p076m2.r.INSTANCE.a()) {
                        objE3 = new er.a() { // from class: ia.i
                            @Override // er.a
                            public final Object a() {
                                return v.o();
                            }
                        };
                        rVarH.v(objE3);
                    }
                    aVar5 = (er.a) objE3;
                } else {
                    aVar5 = aVar3;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1220469155, i17, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:152)");
                }
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new er.a() { // from class: ia.m
                        @Override // er.a
                        public final Object a() {
                            return v.p();
                        }
                    };
                    rVarH.v(objE);
                }
                er.a aVar8 = (er.a) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new er.a() { // from class: ia.n
                        @Override // er.a
                        public final Object a() {
                            return v.q();
                        }
                    };
                    rVarH.v(objE2);
                }
                er.a aVar9 = (er.a) objE2;
                int i29 = (i17 & 14) | 3504;
                int i210 = i17 << 9;
                s(xVar2, false, aVar8, aVar9, z19, aVar5, aVar2, rVarH, i29 | (57344 & i210) | (458752 & i210) | (i210 & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                z18 = z19;
                aVar4 = aVar5;
            } else {
                rVarH.O();
                z18 = z16;
                aVar4 = aVar3;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ia.o
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return v.r(xVar, z18, aVar4, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                aVar3 = aVar;
                if (rVarH.G(aVar3)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.G(aVar2)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i26 == 0) {
                }
                if (i18 != 0) {
                    objE3 = rVarH.E();
                    if (objE3 == p076m2.r.INSTANCE.a()) {
                        objE3 = new er.a() { // from class: ia.i
                            @Override // er.a
                            public final Object a() {
                                return v.o();
                            }
                        };
                        rVarH.v(objE3);
                    }
                    aVar5 = (er.a) objE3;
                } else {
                    aVar5 = aVar3;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1220469155, i17, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:152)");
                }
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new er.a() { // from class: ia.m
                        @Override // er.a
                        public final Object a() {
                            return v.p();
                        }
                    };
                    rVarH.v(objE);
                }
                er.a aVar10 = (er.a) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new er.a() { // from class: ia.n
                        @Override // er.a
                        public final Object a() {
                            return v.q();
                        }
                    };
                    rVarH.v(objE2);
                }
                er.a aVar11 = (er.a) objE2;
                int i211 = (i17 & 14) | 3504;
                int i212 = i17 << 9;
                s(xVar2, false, aVar10, aVar11, z19, aVar5, aVar2, rVarH, i211 | (57344 & i212) | (458752 & i212) | (i212 & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                z18 = z19;
                aVar4 = aVar5;
            } else {
                rVarH.O();
                z18 = z16;
                aVar4 = aVar3;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ia.o
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return v.r(xVar, z18, aVar4, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        aVar3 = aVar;
        if ((i15 & 3072) == 0) {
            if (rVarH.G(aVar2)) {
                i25 = 2048;
            } else {
                i25 = 1024;
            }
            i17 |= i25;
        }
        if ((i17 & 1171) != 1170) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i26 == 0) {
            }
            if (i18 != 0) {
                objE3 = rVarH.E();
                if (objE3 == p076m2.r.INSTANCE.a()) {
                    objE3 = new er.a() { // from class: ia.i
                        @Override // er.a
                        public final Object a() {
                            return v.o();
                        }
                    };
                    rVarH.v(objE3);
                }
                aVar5 = (er.a) objE3;
            } else {
                aVar5 = aVar3;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1220469155, i17, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:152)");
            }
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.a() { // from class: ia.m
                    @Override // er.a
                    public final Object a() {
                        return v.p();
                    }
                };
                rVarH.v(objE);
            }
            er.a aVar12 = (er.a) objE;
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.a() { // from class: ia.n
                    @Override // er.a
                    public final Object a() {
                        return v.q();
                    }
                };
                rVarH.v(objE2);
            }
            er.a aVar13 = (er.a) objE2;
            int i213 = (i17 & 14) | 3504;
            int i214 = i17 << 9;
            s(xVar2, false, aVar12, aVar13, z19, aVar5, aVar2, rVarH, i213 | (57344 & i214) | (458752 & i214) | (i214 & 3670016), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            z18 = z19;
            aVar4 = aVar5;
        } else {
            rVarH.O();
            z18 = z16;
            aVar4 = aVar3;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ia.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.r(xVar, z18, aVar4, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(x xVar, boolean z15, er.a aVar, er.a aVar2, int i15, int i16, p076m2.r rVar, int i17) {
        n(xVar, z15, aVar, aVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x015c  */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0171  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0186  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0198  */
    /* JADX WARN: Code duplicated, block: B:128:0x019b  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:156:0x0202  */
    /* JADX WARN: Code duplicated, block: B:157:0x0205  */
    /* JADX WARN: Code duplicated, block: B:160:0x020a  */
    /* JADX WARN: Code duplicated, block: B:161:0x020d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0215  */
    /* JADX WARN: Code duplicated, block: B:166:0x021d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0235  */
    /* JADX WARN: Code duplicated, block: B:174:0x0247  */
    /* JADX WARN: Code duplicated, block: B:176:0x024f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0262  */
    /* JADX WARN: Code duplicated, block: B:180:0x0266  */
    /* JADX WARN: Code duplicated, block: B:182:0x026e  */
    /* JADX WARN: Code duplicated, block: B:185:0x027f  */
    /* JADX WARN: Code duplicated, block: B:186:0x028a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
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
    public static final void s(x<? extends ha.g> xVar, boolean z15, er.a<i0> aVar, er.a<i0> aVar2, boolean z16, er.a<i0> aVar3, er.a<i0> aVar4, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        boolean z17;
        int i18;
        int i19;
        int i25;
        er.a<i0> aVar5;
        int i26;
        int i27;
        boolean z18;
        int i28;
        int i29;
        er.a<i0> aVar6;
        int i35;
        int i36;
        int i37;
        boolean z19;
        final er.a<i0> aVar7;
        final boolean z25;
        final er.a<i0> aVar8;
        final boolean z26;
        final er.a<i0> aVar9;
        final er.a<i0> aVar10;
        d5 d5VarM;
        er.p<? super p076m2.r, ? super Integer, i0> pVar;
        final boolean z27;
        ha.d dVarC;
        final ha.c cVarD;
        int i38;
        boolean z28;
        Object objE;
        final e eVar;
        boolean z29;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z45;
        boolean z46;
        Object objE2;
        boolean zG;
        Object objE3;
        Object objE4;
        Object objE5;
        Object objE6;
        Object objE7;
        final x<? extends ha.g> xVar2 = xVar;
        p076m2.r rVarH = rVar.h(898330592);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(xVar2) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i39 = i16 & 2;
        if (i39 == 0) {
            if ((i15 & 48) == 0) {
                z17 = z15;
                i17 |= rVarH.a(z17) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.G(aVar)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        aVar5 = aVar2;
                        if (rVarH.G(aVar5)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 16;
                    if (i27 != 0) {
                        if ((i15 & 24576) == 0) {
                            z18 = z16;
                            if (rVarH.a(z18)) {
                                i28 = 16384;
                            } else {
                                i28 = PKIFailureInfo.certRevoked;
                            }
                            i17 |= i28;
                        }
                        i29 = i16 & 32;
                        if (i29 != 0) {
                            i17 |= 196608;
                            aVar6 = aVar3;
                        } else {
                            aVar6 = aVar3;
                            if ((i15 & 196608) == 0) {
                                if (rVarH.G(aVar6)) {
                                    i35 = PKIFailureInfo.unsupportedVersion;
                                } else {
                                    i35 = PKIFailureInfo.notAuthorized;
                                }
                                i17 |= i35;
                            }
                        }
                        i36 = i16 & 64;
                        if (i36 != 0) {
                            i17 |= 1572864;
                        } else if ((i15 & 1572864) == 0) {
                            if (rVarH.G(aVar4)) {
                                i37 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i37 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i37;
                        }
                        if ((i17 & 599187) != 599186) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (rVarH.r(z19, i17 & 1)) {
                            if (i39 != 0) {
                                z17 = true;
                            }
                            if (i18 != 0) {
                                objE7 = rVarH.E();
                                if (objE7 == p076m2.r.INSTANCE.a()) {
                                    objE7 = new er.a() { // from class: ia.p
                                        @Override // er.a
                                        public final Object a() {
                                            return v.t();
                                        }
                                    };
                                    rVarH.v(objE7);
                                }
                                aVar7 = (er.a) objE7;
                            } else {
                                aVar7 = aVar;
                            }
                            if (i25 != 0) {
                                objE6 = rVarH.E();
                                if (objE6 == p076m2.r.INSTANCE.a()) {
                                    objE6 = new er.a() { // from class: ia.q
                                        @Override // er.a
                                        public final Object a() {
                                            return v.y();
                                        }
                                    };
                                    rVarH.v(objE6);
                                }
                                aVar9 = (er.a) objE6;
                            } else {
                                aVar9 = aVar5;
                            }
                            z27 = z17;
                            if (i27 != 0) {
                                z26 = true;
                            } else {
                                z26 = z18;
                            }
                            if (i29 != 0) {
                                objE5 = rVarH.E();
                                if (objE5 == p076m2.r.INSTANCE.a()) {
                                    objE5 = new er.a() { // from class: ia.r
                                        @Override // er.a
                                        public final Object a() {
                                            return v.z();
                                        }
                                    };
                                    rVarH.v(objE5);
                                }
                                aVar8 = (er.a) objE5;
                            } else {
                                aVar8 = aVar6;
                            }
                            if (i36 != 0) {
                                objE4 = rVarH.E();
                                if (objE4 == p076m2.r.INSTANCE.a()) {
                                    objE4 = new er.a() { // from class: ia.s
                                        @Override // er.a
                                        public final Object a() {
                                            return v.A();
                                        }
                                    };
                                    rVarH.v(objE4);
                                }
                                aVar10 = (er.a) objE4;
                            } else {
                                aVar10 = aVar4;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                            }
                            if (w.a(rVarH, 0)) {
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                                d5VarM = rVarH.m();
                                if (d5VarM != null) {
                                    return;
                                } else {
                                    pVar = new er.p() { // from class: ia.t
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                }
                            } else {
                                dVarC = g.f90558a.c(rVarH, 6);
                                if (dVarC != null) {
                                    throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                                }
                                cVarD = dVarC.d();
                                i38 = i17 & 14;
                                if (i38 == 4) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                objE = rVarH.E();
                                if (z28 || objE == p076m2.r.INSTANCE.a()) {
                                    objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return v.u(xVar2, (ha.j) obj);
                                        }
                                    });
                                    rVarH.v(objE);
                                }
                                eVar = (e) objE;
                                boolean zG2 = rVarH.G(eVar);
                                if ((i17 & 112) == 32) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                boolean z47 = zG2 | z29;
                                if ((i17 & 896) == 256) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                boolean z48 = z47 | z35;
                                if ((i17 & 7168) == 2048) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                boolean z49 = z48 | z36;
                                if ((57344 & i17) == 16384) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                boolean z55 = z49 | z37;
                                if ((458752 & i17) == 131072) {
                                    z38 = true;
                                } else {
                                    z38 = false;
                                }
                                boolean z56 = z55 | z38;
                                if ((i17 & 3670016) == 1048576) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                boolean z57 = z39 | z56;
                                if (i38 == 4) {
                                    z45 = true;
                                } else {
                                    z45 = false;
                                }
                                z46 = z57 | z45;
                                objE2 = rVarH.E();
                                if (!z46 || objE2 == p076m2.r.INSTANCE.a()) {
                                    z25 = z27;
                                    er.a aVar11 = new er.a() { // from class: ia.j
                                        @Override // er.a
                                        public final Object a() {
                                            return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                        }
                                    };
                                    xVar2 = xVar2;
                                    rVarH.v(aVar11);
                                    objE2 = aVar11;
                                } else {
                                    z25 = z27;
                                }
                                Function0.g((er.a) objE2, rVarH, 0);
                                zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                                objE3 = rVarH.E();
                                if (zG || objE3 == p076m2.r.INSTANCE.a()) {
                                    objE3 = new er.l() { // from class: ia.k
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return v.w(xVar2, eVar, cVarD, (s0) obj);
                                        }
                                    };
                                    rVarH.v(objE3);
                                }
                                Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                            }
                            d5VarM.a(pVar);
                        }
                        rVarH.O();
                        aVar7 = aVar;
                        z25 = z17;
                        aVar8 = aVar6;
                        z26 = z18;
                        aVar9 = aVar5;
                        aVar10 = aVar4;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            pVar = new er.p() { // from class: ia.l
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            d5VarM.a(pVar);
                        }
                    }
                    i17 |= 24576;
                    z18 = z16;
                    i29 = i16 & 32;
                    if (i29 != 0) {
                        i17 |= 196608;
                        aVar6 = aVar3;
                    } else {
                        aVar6 = aVar3;
                        if ((i15 & 196608) == 0) {
                            if (rVarH.G(aVar6)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                    }
                    i36 = i16 & 64;
                    if (i36 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.G(aVar4)) {
                            i37 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i37 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 599187) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        if (i39 != 0) {
                            z17 = true;
                        }
                        if (i18 != 0) {
                            objE7 = rVarH.E();
                            if (objE7 == p076m2.r.INSTANCE.a()) {
                                objE7 = new er.a() { // from class: ia.p
                                    @Override // er.a
                                    public final Object a() {
                                        return v.t();
                                    }
                                };
                                rVarH.v(objE7);
                            }
                            aVar7 = (er.a) objE7;
                        } else {
                            aVar7 = aVar;
                        }
                        if (i25 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == p076m2.r.INSTANCE.a()) {
                                objE6 = new er.a() { // from class: ia.q
                                    @Override // er.a
                                    public final Object a() {
                                        return v.y();
                                    }
                                };
                                rVarH.v(objE6);
                            }
                            aVar9 = (er.a) objE6;
                        } else {
                            aVar9 = aVar5;
                        }
                        z27 = z17;
                        if (i27 != 0) {
                            z26 = true;
                        } else {
                            z26 = z18;
                        }
                        if (i29 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == p076m2.r.INSTANCE.a()) {
                                objE5 = new er.a() { // from class: ia.r
                                    @Override // er.a
                                    public final Object a() {
                                        return v.z();
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar8 = (er.a) objE5;
                        } else {
                            aVar8 = aVar6;
                        }
                        if (i36 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == p076m2.r.INSTANCE.a()) {
                                objE4 = new er.a() { // from class: ia.s
                                    @Override // er.a
                                    public final Object a() {
                                        return v.A();
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            aVar10 = (er.a) objE4;
                        } else {
                            aVar10 = aVar4;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                        }
                        if (w.a(rVarH, 0)) {
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                return;
                            } else {
                                pVar = new er.p() { // from class: ia.t
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                            }
                        } else {
                            dVarC = g.f90558a.c(rVarH, 6);
                            if (dVarC != null) {
                                throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                            }
                            cVarD = dVarC.d();
                            i38 = i17 & 14;
                            if (i38 == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            objE = rVarH.E();
                            if (z28) {
                                objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.u(xVar2, (ha.j) obj);
                                    }
                                });
                                rVarH.v(objE);
                            } else {
                                objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.u(xVar2, (ha.j) obj);
                                    }
                                });
                                rVarH.v(objE);
                            }
                            eVar = (e) objE;
                            boolean zG3 = rVarH.G(eVar);
                            if ((i17 & 112) == 32) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            boolean z410 = zG3 | z29;
                            if ((i17 & 896) == 256) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z411 = z410 | z35;
                            if ((i17 & 7168) == 2048) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z412 = z411 | z36;
                            if ((57344 & i17) == 16384) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            boolean z58 = z412 | z37;
                            if ((458752 & i17) == 131072) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            boolean z59 = z58 | z38;
                            if ((i17 & 3670016) == 1048576) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            boolean z510 = z39 | z59;
                            if (i38 == 4) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z510 | z45;
                            objE2 = rVarH.E();
                            if (z46) {
                                z25 = z27;
                                er.a aVar12 = new er.a() { // from class: ia.j
                                    @Override // er.a
                                    public final Object a() {
                                        return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                    }
                                };
                                xVar2 = xVar2;
                                rVarH.v(aVar12);
                                objE2 = aVar12;
                            } else {
                                z25 = z27;
                                er.a aVar13 = new er.a() { // from class: ia.j
                                    @Override // er.a
                                    public final Object a() {
                                        return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                    }
                                };
                                xVar2 = xVar2;
                                rVarH.v(aVar13);
                                objE2 = aVar13;
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                            objE3 = rVarH.E();
                            if (zG) {
                                objE3 = new er.l() { // from class: ia.k
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.w(xVar2, eVar, cVarD, (s0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.l() { // from class: ia.k
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.w(xVar2, eVar, cVarD, (s0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                        }
                        d5VarM.a(pVar);
                    }
                    rVarH.O();
                    aVar7 = aVar;
                    z25 = z17;
                    aVar8 = aVar6;
                    z26 = z18;
                    aVar9 = aVar5;
                    aVar10 = aVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        pVar = new er.p() { // from class: ia.l
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        d5VarM.a(pVar);
                    }
                }
                i17 |= 3072;
                aVar5 = aVar2;
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        z18 = z16;
                        if (rVarH.a(z18)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 32;
                    if (i29 != 0) {
                        i17 |= 196608;
                        aVar6 = aVar3;
                    } else {
                        aVar6 = aVar3;
                        if ((i15 & 196608) == 0) {
                            if (rVarH.G(aVar6)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                    }
                    i36 = i16 & 64;
                    if (i36 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.G(aVar4)) {
                            i37 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i37 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 599187) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        if (i39 != 0) {
                            z17 = true;
                        }
                        if (i18 != 0) {
                            objE7 = rVarH.E();
                            if (objE7 == p076m2.r.INSTANCE.a()) {
                                objE7 = new er.a() { // from class: ia.p
                                    @Override // er.a
                                    public final Object a() {
                                        return v.t();
                                    }
                                };
                                rVarH.v(objE7);
                            }
                            aVar7 = (er.a) objE7;
                        } else {
                            aVar7 = aVar;
                        }
                        if (i25 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == p076m2.r.INSTANCE.a()) {
                                objE6 = new er.a() { // from class: ia.q
                                    @Override // er.a
                                    public final Object a() {
                                        return v.y();
                                    }
                                };
                                rVarH.v(objE6);
                            }
                            aVar9 = (er.a) objE6;
                        } else {
                            aVar9 = aVar5;
                        }
                        z27 = z17;
                        if (i27 != 0) {
                            z26 = true;
                        } else {
                            z26 = z18;
                        }
                        if (i29 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == p076m2.r.INSTANCE.a()) {
                                objE5 = new er.a() { // from class: ia.r
                                    @Override // er.a
                                    public final Object a() {
                                        return v.z();
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar8 = (er.a) objE5;
                        } else {
                            aVar8 = aVar6;
                        }
                        if (i36 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == p076m2.r.INSTANCE.a()) {
                                objE4 = new er.a() { // from class: ia.s
                                    @Override // er.a
                                    public final Object a() {
                                        return v.A();
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            aVar10 = (er.a) objE4;
                        } else {
                            aVar10 = aVar4;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                        }
                        if (w.a(rVarH, 0)) {
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                return;
                            } else {
                                pVar = new er.p() { // from class: ia.t
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                            }
                        } else {
                            dVarC = g.f90558a.c(rVarH, 6);
                            if (dVarC != null) {
                                throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                            }
                            cVarD = dVarC.d();
                            i38 = i17 & 14;
                            if (i38 == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            objE = rVarH.E();
                            if (z28) {
                                objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.u(xVar2, (ha.j) obj);
                                    }
                                });
                                rVarH.v(objE);
                            } else {
                                objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.u(xVar2, (ha.j) obj);
                                    }
                                });
                                rVarH.v(objE);
                            }
                            eVar = (e) objE;
                            boolean zG4 = rVarH.G(eVar);
                            if ((i17 & 112) == 32) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            boolean z413 = zG4 | z29;
                            if ((i17 & 896) == 256) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z414 = z413 | z35;
                            if ((i17 & 7168) == 2048) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z415 = z414 | z36;
                            if ((57344 & i17) == 16384) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            boolean z511 = z415 | z37;
                            if ((458752 & i17) == 131072) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            boolean z512 = z511 | z38;
                            if ((i17 & 3670016) == 1048576) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            boolean z513 = z39 | z512;
                            if (i38 == 4) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z513 | z45;
                            objE2 = rVarH.E();
                            if (z46) {
                                z25 = z27;
                                er.a aVar14 = new er.a() { // from class: ia.j
                                    @Override // er.a
                                    public final Object a() {
                                        return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                    }
                                };
                                xVar2 = xVar2;
                                rVarH.v(aVar14);
                                objE2 = aVar14;
                            } else {
                                z25 = z27;
                                er.a aVar15 = new er.a() { // from class: ia.j
                                    @Override // er.a
                                    public final Object a() {
                                        return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                    }
                                };
                                xVar2 = xVar2;
                                rVarH.v(aVar15);
                                objE2 = aVar15;
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                            objE3 = rVarH.E();
                            if (zG) {
                                objE3 = new er.l() { // from class: ia.k
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.w(xVar2, eVar, cVarD, (s0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.l() { // from class: ia.k
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.w(xVar2, eVar, cVarD, (s0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                        }
                        d5VarM.a(pVar);
                    }
                    rVarH.O();
                    aVar7 = aVar;
                    z25 = z17;
                    aVar8 = aVar6;
                    z26 = z18;
                    aVar9 = aVar5;
                    aVar10 = aVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        pVar = new er.p() { // from class: ia.l
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        d5VarM.a(pVar);
                    }
                }
                i17 |= 24576;
                z18 = z16;
                i29 = i16 & 32;
                if (i29 != 0) {
                    i17 |= 196608;
                    aVar6 = aVar3;
                } else {
                    aVar6 = aVar3;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(aVar6)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 64;
                if (i36 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(aVar4)) {
                        i37 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i37 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i37;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if (i18 != 0) {
                        objE7 = rVarH.E();
                        if (objE7 == p076m2.r.INSTANCE.a()) {
                            objE7 = new er.a() { // from class: ia.p
                                @Override // er.a
                                public final Object a() {
                                    return v.t();
                                }
                            };
                            rVarH.v(objE7);
                        }
                        aVar7 = (er.a) objE7;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i25 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.a() { // from class: ia.q
                                @Override // er.a
                                public final Object a() {
                                    return v.y();
                                }
                            };
                            rVarH.v(objE6);
                        }
                        aVar9 = (er.a) objE6;
                    } else {
                        aVar9 = aVar5;
                    }
                    z27 = z17;
                    if (i27 != 0) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    if (i29 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.a() { // from class: ia.r
                                @Override // er.a
                                public final Object a() {
                                    return v.z();
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar8 = (er.a) objE5;
                    } else {
                        aVar8 = aVar6;
                    }
                    if (i36 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.a() { // from class: ia.s
                                @Override // er.a
                                public final Object a() {
                                    return v.A();
                                }
                            };
                            rVarH.v(objE4);
                        }
                        aVar10 = (er.a) objE4;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    if (w.a(rVarH, 0)) {
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            return;
                        } else {
                            pVar = new er.p() { // from class: ia.t
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            };
                        }
                    } else {
                        dVarC = g.f90558a.c(rVarH, 6);
                        if (dVarC != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                        }
                        cVarD = dVarC.d();
                        i38 = i17 & 14;
                        if (i38 == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objE = rVarH.E();
                        if (z28) {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        } else {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        }
                        eVar = (e) objE;
                        boolean zG5 = rVarH.G(eVar);
                        if ((i17 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z416 = zG5 | z29;
                        if ((i17 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z417 = z416 | z35;
                        if ((i17 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z418 = z417 | z36;
                        if ((57344 & i17) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z514 = z418 | z37;
                        if ((458752 & i17) == 131072) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        boolean z515 = z514 | z38;
                        if ((i17 & 3670016) == 1048576) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        boolean z516 = z39 | z515;
                        if (i38 == 4) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z516 | z45;
                        objE2 = rVarH.E();
                        if (z46) {
                            z25 = z27;
                            er.a aVar16 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar16);
                            objE2 = aVar16;
                        } else {
                            z25 = z27;
                            er.a aVar17 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar17);
                            objE2 = aVar17;
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                        objE3 = rVarH.E();
                        if (zG) {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    }
                    d5VarM.a(pVar);
                }
                rVarH.O();
                aVar7 = aVar;
                z25 = z17;
                aVar8 = aVar6;
                z26 = z18;
                aVar9 = aVar5;
                aVar10 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    pVar = new er.p() { // from class: ia.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    d5VarM.a(pVar);
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    aVar5 = aVar2;
                    if (rVarH.G(aVar5)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        z18 = z16;
                        if (rVarH.a(z18)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 32;
                    if (i29 != 0) {
                        i17 |= 196608;
                        aVar6 = aVar3;
                    } else {
                        aVar6 = aVar3;
                        if ((i15 & 196608) == 0) {
                            if (rVarH.G(aVar6)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                    }
                    i36 = i16 & 64;
                    if (i36 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.G(aVar4)) {
                            i37 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i37 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 599187) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        if (i39 != 0) {
                            z17 = true;
                        }
                        if (i18 != 0) {
                            objE7 = rVarH.E();
                            if (objE7 == p076m2.r.INSTANCE.a()) {
                                objE7 = new er.a() { // from class: ia.p
                                    @Override // er.a
                                    public final Object a() {
                                        return v.t();
                                    }
                                };
                                rVarH.v(objE7);
                            }
                            aVar7 = (er.a) objE7;
                        } else {
                            aVar7 = aVar;
                        }
                        if (i25 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == p076m2.r.INSTANCE.a()) {
                                objE6 = new er.a() { // from class: ia.q
                                    @Override // er.a
                                    public final Object a() {
                                        return v.y();
                                    }
                                };
                                rVarH.v(objE6);
                            }
                            aVar9 = (er.a) objE6;
                        } else {
                            aVar9 = aVar5;
                        }
                        z27 = z17;
                        if (i27 != 0) {
                            z26 = true;
                        } else {
                            z26 = z18;
                        }
                        if (i29 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == p076m2.r.INSTANCE.a()) {
                                objE5 = new er.a() { // from class: ia.r
                                    @Override // er.a
                                    public final Object a() {
                                        return v.z();
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar8 = (er.a) objE5;
                        } else {
                            aVar8 = aVar6;
                        }
                        if (i36 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == p076m2.r.INSTANCE.a()) {
                                objE4 = new er.a() { // from class: ia.s
                                    @Override // er.a
                                    public final Object a() {
                                        return v.A();
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            aVar10 = (er.a) objE4;
                        } else {
                            aVar10 = aVar4;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                        }
                        if (w.a(rVarH, 0)) {
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                return;
                            } else {
                                pVar = new er.p() { // from class: ia.t
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                            }
                        } else {
                            dVarC = g.f90558a.c(rVarH, 6);
                            if (dVarC != null) {
                                throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                            }
                            cVarD = dVarC.d();
                            i38 = i17 & 14;
                            if (i38 == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            objE = rVarH.E();
                            if (z28) {
                                objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.u(xVar2, (ha.j) obj);
                                    }
                                });
                                rVarH.v(objE);
                            } else {
                                objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.u(xVar2, (ha.j) obj);
                                    }
                                });
                                rVarH.v(objE);
                            }
                            eVar = (e) objE;
                            boolean zG6 = rVarH.G(eVar);
                            if ((i17 & 112) == 32) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            boolean z419 = zG6 | z29;
                            if ((i17 & 896) == 256) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z4110 = z419 | z35;
                            if ((i17 & 7168) == 2048) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z4111 = z4110 | z36;
                            if ((57344 & i17) == 16384) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            boolean z517 = z4111 | z37;
                            if ((458752 & i17) == 131072) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            boolean z518 = z517 | z38;
                            if ((i17 & 3670016) == 1048576) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            boolean z519 = z39 | z518;
                            if (i38 == 4) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z519 | z45;
                            objE2 = rVarH.E();
                            if (z46) {
                                z25 = z27;
                                er.a aVar18 = new er.a() { // from class: ia.j
                                    @Override // er.a
                                    public final Object a() {
                                        return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                    }
                                };
                                xVar2 = xVar2;
                                rVarH.v(aVar18);
                                objE2 = aVar18;
                            } else {
                                z25 = z27;
                                er.a aVar19 = new er.a() { // from class: ia.j
                                    @Override // er.a
                                    public final Object a() {
                                        return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                    }
                                };
                                xVar2 = xVar2;
                                rVarH.v(aVar19);
                                objE2 = aVar19;
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                            objE3 = rVarH.E();
                            if (zG) {
                                objE3 = new er.l() { // from class: ia.k
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.w(xVar2, eVar, cVarD, (s0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.l() { // from class: ia.k
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.w(xVar2, eVar, cVarD, (s0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                        }
                        d5VarM.a(pVar);
                    }
                    rVarH.O();
                    aVar7 = aVar;
                    z25 = z17;
                    aVar8 = aVar6;
                    z26 = z18;
                    aVar9 = aVar5;
                    aVar10 = aVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        pVar = new er.p() { // from class: ia.l
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        d5VarM.a(pVar);
                    }
                }
                i17 |= 24576;
                z18 = z16;
                i29 = i16 & 32;
                if (i29 != 0) {
                    i17 |= 196608;
                    aVar6 = aVar3;
                } else {
                    aVar6 = aVar3;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(aVar6)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 64;
                if (i36 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(aVar4)) {
                        i37 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i37 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i37;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if (i18 != 0) {
                        objE7 = rVarH.E();
                        if (objE7 == p076m2.r.INSTANCE.a()) {
                            objE7 = new er.a() { // from class: ia.p
                                @Override // er.a
                                public final Object a() {
                                    return v.t();
                                }
                            };
                            rVarH.v(objE7);
                        }
                        aVar7 = (er.a) objE7;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i25 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.a() { // from class: ia.q
                                @Override // er.a
                                public final Object a() {
                                    return v.y();
                                }
                            };
                            rVarH.v(objE6);
                        }
                        aVar9 = (er.a) objE6;
                    } else {
                        aVar9 = aVar5;
                    }
                    z27 = z17;
                    if (i27 != 0) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    if (i29 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.a() { // from class: ia.r
                                @Override // er.a
                                public final Object a() {
                                    return v.z();
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar8 = (er.a) objE5;
                    } else {
                        aVar8 = aVar6;
                    }
                    if (i36 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.a() { // from class: ia.s
                                @Override // er.a
                                public final Object a() {
                                    return v.A();
                                }
                            };
                            rVarH.v(objE4);
                        }
                        aVar10 = (er.a) objE4;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    if (w.a(rVarH, 0)) {
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            return;
                        } else {
                            pVar = new er.p() { // from class: ia.t
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            };
                        }
                    } else {
                        dVarC = g.f90558a.c(rVarH, 6);
                        if (dVarC != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                        }
                        cVarD = dVarC.d();
                        i38 = i17 & 14;
                        if (i38 == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objE = rVarH.E();
                        if (z28) {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        } else {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        }
                        eVar = (e) objE;
                        boolean zG7 = rVarH.G(eVar);
                        if ((i17 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z4112 = zG7 | z29;
                        if ((i17 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z4113 = z4112 | z35;
                        if ((i17 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z4114 = z4113 | z36;
                        if ((57344 & i17) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z5110 = z4114 | z37;
                        if ((458752 & i17) == 131072) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        boolean z5111 = z5110 | z38;
                        if ((i17 & 3670016) == 1048576) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        boolean z5112 = z39 | z5111;
                        if (i38 == 4) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z5112 | z45;
                        objE2 = rVarH.E();
                        if (z46) {
                            z25 = z27;
                            er.a aVar110 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar110);
                            objE2 = aVar110;
                        } else {
                            z25 = z27;
                            er.a aVar111 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar111);
                            objE2 = aVar111;
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                        objE3 = rVarH.E();
                        if (zG) {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    }
                    d5VarM.a(pVar);
                }
                rVarH.O();
                aVar7 = aVar;
                z25 = z17;
                aVar8 = aVar6;
                z26 = z18;
                aVar9 = aVar5;
                aVar10 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    pVar = new er.p() { // from class: ia.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    d5VarM.a(pVar);
                }
            }
            i17 |= 3072;
            aVar5 = aVar2;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    z18 = z16;
                    if (rVarH.a(z18)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 32;
                if (i29 != 0) {
                    i17 |= 196608;
                    aVar6 = aVar3;
                } else {
                    aVar6 = aVar3;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(aVar6)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 64;
                if (i36 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(aVar4)) {
                        i37 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i37 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i37;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if (i18 != 0) {
                        objE7 = rVarH.E();
                        if (objE7 == p076m2.r.INSTANCE.a()) {
                            objE7 = new er.a() { // from class: ia.p
                                @Override // er.a
                                public final Object a() {
                                    return v.t();
                                }
                            };
                            rVarH.v(objE7);
                        }
                        aVar7 = (er.a) objE7;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i25 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.a() { // from class: ia.q
                                @Override // er.a
                                public final Object a() {
                                    return v.y();
                                }
                            };
                            rVarH.v(objE6);
                        }
                        aVar9 = (er.a) objE6;
                    } else {
                        aVar9 = aVar5;
                    }
                    z27 = z17;
                    if (i27 != 0) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    if (i29 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.a() { // from class: ia.r
                                @Override // er.a
                                public final Object a() {
                                    return v.z();
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar8 = (er.a) objE5;
                    } else {
                        aVar8 = aVar6;
                    }
                    if (i36 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.a() { // from class: ia.s
                                @Override // er.a
                                public final Object a() {
                                    return v.A();
                                }
                            };
                            rVarH.v(objE4);
                        }
                        aVar10 = (er.a) objE4;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    if (w.a(rVarH, 0)) {
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            return;
                        } else {
                            pVar = new er.p() { // from class: ia.t
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            };
                        }
                    } else {
                        dVarC = g.f90558a.c(rVarH, 6);
                        if (dVarC != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                        }
                        cVarD = dVarC.d();
                        i38 = i17 & 14;
                        if (i38 == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objE = rVarH.E();
                        if (z28) {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        } else {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        }
                        eVar = (e) objE;
                        boolean zG8 = rVarH.G(eVar);
                        if ((i17 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z4115 = zG8 | z29;
                        if ((i17 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z4116 = z4115 | z35;
                        if ((i17 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z4117 = z4116 | z36;
                        if ((57344 & i17) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z5113 = z4117 | z37;
                        if ((458752 & i17) == 131072) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        boolean z5114 = z5113 | z38;
                        if ((i17 & 3670016) == 1048576) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        boolean z5115 = z39 | z5114;
                        if (i38 == 4) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z5115 | z45;
                        objE2 = rVarH.E();
                        if (z46) {
                            z25 = z27;
                            er.a aVar112 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar112);
                            objE2 = aVar112;
                        } else {
                            z25 = z27;
                            er.a aVar113 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar113);
                            objE2 = aVar113;
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                        objE3 = rVarH.E();
                        if (zG) {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    }
                    d5VarM.a(pVar);
                }
                rVarH.O();
                aVar7 = aVar;
                z25 = z17;
                aVar8 = aVar6;
                z26 = z18;
                aVar9 = aVar5;
                aVar10 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    pVar = new er.p() { // from class: ia.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    d5VarM.a(pVar);
                }
            }
            i17 |= 24576;
            z18 = z16;
            i29 = i16 & 32;
            if (i29 != 0) {
                i17 |= 196608;
                aVar6 = aVar3;
            } else {
                aVar6 = aVar3;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(aVar6)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 64;
            if (i36 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.G(aVar4)) {
                    i37 = PKIFailureInfo.badCertTemplate;
                } else {
                    i37 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i37;
            }
            if ((i17 & 599187) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i39 != 0) {
                    z17 = true;
                }
                if (i18 != 0) {
                    objE7 = rVarH.E();
                    if (objE7 == p076m2.r.INSTANCE.a()) {
                        objE7 = new er.a() { // from class: ia.p
                            @Override // er.a
                            public final Object a() {
                                return v.t();
                            }
                        };
                        rVarH.v(objE7);
                    }
                    aVar7 = (er.a) objE7;
                } else {
                    aVar7 = aVar;
                }
                if (i25 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == p076m2.r.INSTANCE.a()) {
                        objE6 = new er.a() { // from class: ia.q
                            @Override // er.a
                            public final Object a() {
                                return v.y();
                            }
                        };
                        rVarH.v(objE6);
                    }
                    aVar9 = (er.a) objE6;
                } else {
                    aVar9 = aVar5;
                }
                z27 = z17;
                if (i27 != 0) {
                    z26 = true;
                } else {
                    z26 = z18;
                }
                if (i29 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.a() { // from class: ia.r
                            @Override // er.a
                            public final Object a() {
                                return v.z();
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar8 = (er.a) objE5;
                } else {
                    aVar8 = aVar6;
                }
                if (i36 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == p076m2.r.INSTANCE.a()) {
                        objE4 = new er.a() { // from class: ia.s
                            @Override // er.a
                            public final Object a() {
                                return v.A();
                            }
                        };
                        rVarH.v(objE4);
                    }
                    aVar10 = (er.a) objE4;
                } else {
                    aVar10 = aVar4;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                }
                if (w.a(rVarH, 0)) {
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        return;
                    } else {
                        pVar = new er.p() { // from class: ia.t
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        };
                    }
                } else {
                    dVarC = g.f90558a.c(rVarH, 6);
                    if (dVarC != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                    }
                    cVarD = dVarC.d();
                    i38 = i17 & 14;
                    if (i38 == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objE = rVarH.E();
                    if (z28) {
                        objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.u(xVar2, (ha.j) obj);
                            }
                        });
                        rVarH.v(objE);
                    } else {
                        objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.u(xVar2, (ha.j) obj);
                            }
                        });
                        rVarH.v(objE);
                    }
                    eVar = (e) objE;
                    boolean zG9 = rVarH.G(eVar);
                    if ((i17 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z4118 = zG9 | z29;
                    if ((i17 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z4119 = z4118 | z35;
                    if ((i17 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z41110 = z4119 | z36;
                    if ((57344 & i17) == 16384) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean z5116 = z41110 | z37;
                    if ((458752 & i17) == 131072) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    boolean z5117 = z5116 | z38;
                    if ((i17 & 3670016) == 1048576) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    boolean z5118 = z39 | z5117;
                    if (i38 == 4) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z5118 | z45;
                    objE2 = rVarH.E();
                    if (z46) {
                        z25 = z27;
                        er.a aVar114 = new er.a() { // from class: ia.j
                            @Override // er.a
                            public final Object a() {
                                return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                            }
                        };
                        xVar2 = xVar2;
                        rVarH.v(aVar114);
                        objE2 = aVar114;
                    } else {
                        z25 = z27;
                        er.a aVar115 = new er.a() { // from class: ia.j
                            @Override // er.a
                            public final Object a() {
                                return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                            }
                        };
                        xVar2 = xVar2;
                        rVarH.v(aVar115);
                        objE2 = aVar115;
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                    objE3 = rVarH.E();
                    if (zG) {
                        objE3 = new er.l() { // from class: ia.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.w(xVar2, eVar, cVarD, (s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.l() { // from class: ia.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.w(xVar2, eVar, cVarD, (s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                }
                d5VarM.a(pVar);
            }
            rVarH.O();
            aVar7 = aVar;
            z25 = z17;
            aVar8 = aVar6;
            z26 = z18;
            aVar9 = aVar5;
            aVar10 = aVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                pVar = new er.p() { // from class: ia.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                };
                d5VarM.a(pVar);
            }
        }
        i17 |= 48;
        z17 = z15;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(aVar)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    aVar5 = aVar2;
                    if (rVarH.G(aVar5)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        z18 = z16;
                        if (rVarH.a(z18)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 32;
                    if (i29 != 0) {
                        i17 |= 196608;
                        aVar6 = aVar3;
                    } else {
                        aVar6 = aVar3;
                        if ((i15 & 196608) == 0) {
                            if (rVarH.G(aVar6)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                    }
                    i36 = i16 & 64;
                    if (i36 != 0) {
                        i17 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.G(aVar4)) {
                            i37 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i37 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i37;
                    }
                    if ((i17 & 599187) != 599186) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i17 & 1)) {
                        if (i39 != 0) {
                            z17 = true;
                        }
                        if (i18 != 0) {
                            objE7 = rVarH.E();
                            if (objE7 == p076m2.r.INSTANCE.a()) {
                                objE7 = new er.a() { // from class: ia.p
                                    @Override // er.a
                                    public final Object a() {
                                        return v.t();
                                    }
                                };
                                rVarH.v(objE7);
                            }
                            aVar7 = (er.a) objE7;
                        } else {
                            aVar7 = aVar;
                        }
                        if (i25 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == p076m2.r.INSTANCE.a()) {
                                objE6 = new er.a() { // from class: ia.q
                                    @Override // er.a
                                    public final Object a() {
                                        return v.y();
                                    }
                                };
                                rVarH.v(objE6);
                            }
                            aVar9 = (er.a) objE6;
                        } else {
                            aVar9 = aVar5;
                        }
                        z27 = z17;
                        if (i27 != 0) {
                            z26 = true;
                        } else {
                            z26 = z18;
                        }
                        if (i29 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == p076m2.r.INSTANCE.a()) {
                                objE5 = new er.a() { // from class: ia.r
                                    @Override // er.a
                                    public final Object a() {
                                        return v.z();
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar8 = (er.a) objE5;
                        } else {
                            aVar8 = aVar6;
                        }
                        if (i36 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == p076m2.r.INSTANCE.a()) {
                                objE4 = new er.a() { // from class: ia.s
                                    @Override // er.a
                                    public final Object a() {
                                        return v.A();
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            aVar10 = (er.a) objE4;
                        } else {
                            aVar10 = aVar4;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                        }
                        if (w.a(rVarH, 0)) {
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                return;
                            } else {
                                pVar = new er.p() { // from class: ia.t
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                            }
                        } else {
                            dVarC = g.f90558a.c(rVarH, 6);
                            if (dVarC != null) {
                                throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                            }
                            cVarD = dVarC.d();
                            i38 = i17 & 14;
                            if (i38 == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            objE = rVarH.E();
                            if (z28) {
                                objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.u(xVar2, (ha.j) obj);
                                    }
                                });
                                rVarH.v(objE);
                            } else {
                                objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.u(xVar2, (ha.j) obj);
                                    }
                                });
                                rVarH.v(objE);
                            }
                            eVar = (e) objE;
                            boolean zG10 = rVarH.G(eVar);
                            if ((i17 & 112) == 32) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            boolean z41111 = zG10 | z29;
                            if ((i17 & 896) == 256) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z41112 = z41111 | z35;
                            if ((i17 & 7168) == 2048) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z41113 = z41112 | z36;
                            if ((57344 & i17) == 16384) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            boolean z5119 = z41113 | z37;
                            if ((458752 & i17) == 131072) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            boolean z51110 = z5119 | z38;
                            if ((i17 & 3670016) == 1048576) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            boolean z51111 = z39 | z51110;
                            if (i38 == 4) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z51111 | z45;
                            objE2 = rVarH.E();
                            if (z46) {
                                z25 = z27;
                                er.a aVar116 = new er.a() { // from class: ia.j
                                    @Override // er.a
                                    public final Object a() {
                                        return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                    }
                                };
                                xVar2 = xVar2;
                                rVarH.v(aVar116);
                                objE2 = aVar116;
                            } else {
                                z25 = z27;
                                er.a aVar117 = new er.a() { // from class: ia.j
                                    @Override // er.a
                                    public final Object a() {
                                        return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                    }
                                };
                                xVar2 = xVar2;
                                rVarH.v(aVar117);
                                objE2 = aVar117;
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                            objE3 = rVarH.E();
                            if (zG) {
                                objE3 = new er.l() { // from class: ia.k
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.w(xVar2, eVar, cVarD, (s0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.l() { // from class: ia.k
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return v.w(xVar2, eVar, cVarD, (s0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                        }
                        d5VarM.a(pVar);
                    }
                    rVarH.O();
                    aVar7 = aVar;
                    z25 = z17;
                    aVar8 = aVar6;
                    z26 = z18;
                    aVar9 = aVar5;
                    aVar10 = aVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        pVar = new er.p() { // from class: ia.l
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        d5VarM.a(pVar);
                    }
                }
                i17 |= 24576;
                z18 = z16;
                i29 = i16 & 32;
                if (i29 != 0) {
                    i17 |= 196608;
                    aVar6 = aVar3;
                } else {
                    aVar6 = aVar3;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(aVar6)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 64;
                if (i36 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(aVar4)) {
                        i37 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i37 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i37;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if (i18 != 0) {
                        objE7 = rVarH.E();
                        if (objE7 == p076m2.r.INSTANCE.a()) {
                            objE7 = new er.a() { // from class: ia.p
                                @Override // er.a
                                public final Object a() {
                                    return v.t();
                                }
                            };
                            rVarH.v(objE7);
                        }
                        aVar7 = (er.a) objE7;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i25 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.a() { // from class: ia.q
                                @Override // er.a
                                public final Object a() {
                                    return v.y();
                                }
                            };
                            rVarH.v(objE6);
                        }
                        aVar9 = (er.a) objE6;
                    } else {
                        aVar9 = aVar5;
                    }
                    z27 = z17;
                    if (i27 != 0) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    if (i29 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.a() { // from class: ia.r
                                @Override // er.a
                                public final Object a() {
                                    return v.z();
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar8 = (er.a) objE5;
                    } else {
                        aVar8 = aVar6;
                    }
                    if (i36 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.a() { // from class: ia.s
                                @Override // er.a
                                public final Object a() {
                                    return v.A();
                                }
                            };
                            rVarH.v(objE4);
                        }
                        aVar10 = (er.a) objE4;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    if (w.a(rVarH, 0)) {
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            return;
                        } else {
                            pVar = new er.p() { // from class: ia.t
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            };
                        }
                    } else {
                        dVarC = g.f90558a.c(rVarH, 6);
                        if (dVarC != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                        }
                        cVarD = dVarC.d();
                        i38 = i17 & 14;
                        if (i38 == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objE = rVarH.E();
                        if (z28) {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        } else {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        }
                        eVar = (e) objE;
                        boolean zG11 = rVarH.G(eVar);
                        if ((i17 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z41114 = zG11 | z29;
                        if ((i17 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z41115 = z41114 | z35;
                        if ((i17 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z41116 = z41115 | z36;
                        if ((57344 & i17) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z51112 = z41116 | z37;
                        if ((458752 & i17) == 131072) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        boolean z51113 = z51112 | z38;
                        if ((i17 & 3670016) == 1048576) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        boolean z51114 = z39 | z51113;
                        if (i38 == 4) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z51114 | z45;
                        objE2 = rVarH.E();
                        if (z46) {
                            z25 = z27;
                            er.a aVar118 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar118);
                            objE2 = aVar118;
                        } else {
                            z25 = z27;
                            er.a aVar119 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar119);
                            objE2 = aVar119;
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                        objE3 = rVarH.E();
                        if (zG) {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    }
                    d5VarM.a(pVar);
                }
                rVarH.O();
                aVar7 = aVar;
                z25 = z17;
                aVar8 = aVar6;
                z26 = z18;
                aVar9 = aVar5;
                aVar10 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    pVar = new er.p() { // from class: ia.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    d5VarM.a(pVar);
                }
            }
            i17 |= 3072;
            aVar5 = aVar2;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    z18 = z16;
                    if (rVarH.a(z18)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 32;
                if (i29 != 0) {
                    i17 |= 196608;
                    aVar6 = aVar3;
                } else {
                    aVar6 = aVar3;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(aVar6)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 64;
                if (i36 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(aVar4)) {
                        i37 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i37 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i37;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if (i18 != 0) {
                        objE7 = rVarH.E();
                        if (objE7 == p076m2.r.INSTANCE.a()) {
                            objE7 = new er.a() { // from class: ia.p
                                @Override // er.a
                                public final Object a() {
                                    return v.t();
                                }
                            };
                            rVarH.v(objE7);
                        }
                        aVar7 = (er.a) objE7;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i25 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.a() { // from class: ia.q
                                @Override // er.a
                                public final Object a() {
                                    return v.y();
                                }
                            };
                            rVarH.v(objE6);
                        }
                        aVar9 = (er.a) objE6;
                    } else {
                        aVar9 = aVar5;
                    }
                    z27 = z17;
                    if (i27 != 0) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    if (i29 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.a() { // from class: ia.r
                                @Override // er.a
                                public final Object a() {
                                    return v.z();
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar8 = (er.a) objE5;
                    } else {
                        aVar8 = aVar6;
                    }
                    if (i36 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.a() { // from class: ia.s
                                @Override // er.a
                                public final Object a() {
                                    return v.A();
                                }
                            };
                            rVarH.v(objE4);
                        }
                        aVar10 = (er.a) objE4;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    if (w.a(rVarH, 0)) {
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            return;
                        } else {
                            pVar = new er.p() { // from class: ia.t
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            };
                        }
                    } else {
                        dVarC = g.f90558a.c(rVarH, 6);
                        if (dVarC != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                        }
                        cVarD = dVarC.d();
                        i38 = i17 & 14;
                        if (i38 == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objE = rVarH.E();
                        if (z28) {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        } else {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        }
                        eVar = (e) objE;
                        boolean zG12 = rVarH.G(eVar);
                        if ((i17 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z41117 = zG12 | z29;
                        if ((i17 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z41118 = z41117 | z35;
                        if ((i17 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z41119 = z41118 | z36;
                        if ((57344 & i17) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z51115 = z41119 | z37;
                        if ((458752 & i17) == 131072) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        boolean z51116 = z51115 | z38;
                        if ((i17 & 3670016) == 1048576) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        boolean z51117 = z39 | z51116;
                        if (i38 == 4) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z51117 | z45;
                        objE2 = rVarH.E();
                        if (z46) {
                            z25 = z27;
                            er.a aVar1110 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar1110);
                            objE2 = aVar1110;
                        } else {
                            z25 = z27;
                            er.a aVar1111 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar1111);
                            objE2 = aVar1111;
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                        objE3 = rVarH.E();
                        if (zG) {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    }
                    d5VarM.a(pVar);
                }
                rVarH.O();
                aVar7 = aVar;
                z25 = z17;
                aVar8 = aVar6;
                z26 = z18;
                aVar9 = aVar5;
                aVar10 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    pVar = new er.p() { // from class: ia.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    d5VarM.a(pVar);
                }
            }
            i17 |= 24576;
            z18 = z16;
            i29 = i16 & 32;
            if (i29 != 0) {
                i17 |= 196608;
                aVar6 = aVar3;
            } else {
                aVar6 = aVar3;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(aVar6)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 64;
            if (i36 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.G(aVar4)) {
                    i37 = PKIFailureInfo.badCertTemplate;
                } else {
                    i37 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i37;
            }
            if ((i17 & 599187) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i39 != 0) {
                    z17 = true;
                }
                if (i18 != 0) {
                    objE7 = rVarH.E();
                    if (objE7 == p076m2.r.INSTANCE.a()) {
                        objE7 = new er.a() { // from class: ia.p
                            @Override // er.a
                            public final Object a() {
                                return v.t();
                            }
                        };
                        rVarH.v(objE7);
                    }
                    aVar7 = (er.a) objE7;
                } else {
                    aVar7 = aVar;
                }
                if (i25 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == p076m2.r.INSTANCE.a()) {
                        objE6 = new er.a() { // from class: ia.q
                            @Override // er.a
                            public final Object a() {
                                return v.y();
                            }
                        };
                        rVarH.v(objE6);
                    }
                    aVar9 = (er.a) objE6;
                } else {
                    aVar9 = aVar5;
                }
                z27 = z17;
                if (i27 != 0) {
                    z26 = true;
                } else {
                    z26 = z18;
                }
                if (i29 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.a() { // from class: ia.r
                            @Override // er.a
                            public final Object a() {
                                return v.z();
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar8 = (er.a) objE5;
                } else {
                    aVar8 = aVar6;
                }
                if (i36 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == p076m2.r.INSTANCE.a()) {
                        objE4 = new er.a() { // from class: ia.s
                            @Override // er.a
                            public final Object a() {
                                return v.A();
                            }
                        };
                        rVarH.v(objE4);
                    }
                    aVar10 = (er.a) objE4;
                } else {
                    aVar10 = aVar4;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                }
                if (w.a(rVarH, 0)) {
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        return;
                    } else {
                        pVar = new er.p() { // from class: ia.t
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        };
                    }
                } else {
                    dVarC = g.f90558a.c(rVarH, 6);
                    if (dVarC != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                    }
                    cVarD = dVarC.d();
                    i38 = i17 & 14;
                    if (i38 == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objE = rVarH.E();
                    if (z28) {
                        objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.u(xVar2, (ha.j) obj);
                            }
                        });
                        rVarH.v(objE);
                    } else {
                        objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.u(xVar2, (ha.j) obj);
                            }
                        });
                        rVarH.v(objE);
                    }
                    eVar = (e) objE;
                    boolean zG13 = rVarH.G(eVar);
                    if ((i17 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z411110 = zG13 | z29;
                    if ((i17 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z411111 = z411110 | z35;
                    if ((i17 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z411112 = z411111 | z36;
                    if ((57344 & i17) == 16384) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean z51118 = z411112 | z37;
                    if ((458752 & i17) == 131072) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    boolean z51119 = z51118 | z38;
                    if ((i17 & 3670016) == 1048576) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    boolean z511110 = z39 | z51119;
                    if (i38 == 4) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z511110 | z45;
                    objE2 = rVarH.E();
                    if (z46) {
                        z25 = z27;
                        er.a aVar1112 = new er.a() { // from class: ia.j
                            @Override // er.a
                            public final Object a() {
                                return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                            }
                        };
                        xVar2 = xVar2;
                        rVarH.v(aVar1112);
                        objE2 = aVar1112;
                    } else {
                        z25 = z27;
                        er.a aVar1113 = new er.a() { // from class: ia.j
                            @Override // er.a
                            public final Object a() {
                                return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                            }
                        };
                        xVar2 = xVar2;
                        rVarH.v(aVar1113);
                        objE2 = aVar1113;
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                    objE3 = rVarH.E();
                    if (zG) {
                        objE3 = new er.l() { // from class: ia.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.w(xVar2, eVar, cVarD, (s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.l() { // from class: ia.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.w(xVar2, eVar, cVarD, (s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                }
                d5VarM.a(pVar);
            }
            rVarH.O();
            aVar7 = aVar;
            z25 = z17;
            aVar8 = aVar6;
            z26 = z18;
            aVar9 = aVar5;
            aVar10 = aVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                pVar = new er.p() { // from class: ia.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                };
                d5VarM.a(pVar);
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                aVar5 = aVar2;
                if (rVarH.G(aVar5)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    z18 = z16;
                    if (rVarH.a(z18)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 32;
                if (i29 != 0) {
                    i17 |= 196608;
                    aVar6 = aVar3;
                } else {
                    aVar6 = aVar3;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(aVar6)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 64;
                if (i36 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.G(aVar4)) {
                        i37 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i37 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i37;
                }
                if ((i17 & 599187) != 599186) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i39 != 0) {
                        z17 = true;
                    }
                    if (i18 != 0) {
                        objE7 = rVarH.E();
                        if (objE7 == p076m2.r.INSTANCE.a()) {
                            objE7 = new er.a() { // from class: ia.p
                                @Override // er.a
                                public final Object a() {
                                    return v.t();
                                }
                            };
                            rVarH.v(objE7);
                        }
                        aVar7 = (er.a) objE7;
                    } else {
                        aVar7 = aVar;
                    }
                    if (i25 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.a() { // from class: ia.q
                                @Override // er.a
                                public final Object a() {
                                    return v.y();
                                }
                            };
                            rVarH.v(objE6);
                        }
                        aVar9 = (er.a) objE6;
                    } else {
                        aVar9 = aVar5;
                    }
                    z27 = z17;
                    if (i27 != 0) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    if (i29 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.a() { // from class: ia.r
                                @Override // er.a
                                public final Object a() {
                                    return v.z();
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar8 = (er.a) objE5;
                    } else {
                        aVar8 = aVar6;
                    }
                    if (i36 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.a() { // from class: ia.s
                                @Override // er.a
                                public final Object a() {
                                    return v.A();
                                }
                            };
                            rVarH.v(objE4);
                        }
                        aVar10 = (er.a) objE4;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                    }
                    if (w.a(rVarH, 0)) {
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            return;
                        } else {
                            pVar = new er.p() { // from class: ia.t
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            };
                        }
                    } else {
                        dVarC = g.f90558a.c(rVarH, 6);
                        if (dVarC != null) {
                            throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                        }
                        cVarD = dVarC.d();
                        i38 = i17 & 14;
                        if (i38 == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objE = rVarH.E();
                        if (z28) {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        } else {
                            objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.u(xVar2, (ha.j) obj);
                                }
                            });
                            rVarH.v(objE);
                        }
                        eVar = (e) objE;
                        boolean zG14 = rVarH.G(eVar);
                        if ((i17 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z411113 = zG14 | z29;
                        if ((i17 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z411114 = z411113 | z35;
                        if ((i17 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z411115 = z411114 | z36;
                        if ((57344 & i17) == 16384) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z511111 = z411115 | z37;
                        if ((458752 & i17) == 131072) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        boolean z511112 = z511111 | z38;
                        if ((i17 & 3670016) == 1048576) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        boolean z511113 = z39 | z511112;
                        if (i38 == 4) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z511113 | z45;
                        objE2 = rVarH.E();
                        if (z46) {
                            z25 = z27;
                            er.a aVar1114 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar1114);
                            objE2 = aVar1114;
                        } else {
                            z25 = z27;
                            er.a aVar1115 = new er.a() { // from class: ia.j
                                @Override // er.a
                                public final Object a() {
                                    return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                                }
                            };
                            xVar2 = xVar2;
                            rVarH.v(aVar1115);
                            objE2 = aVar1115;
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                        objE3 = rVarH.E();
                        if (zG) {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.l() { // from class: ia.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return v.w(xVar2, eVar, cVarD, (s0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    }
                    d5VarM.a(pVar);
                }
                rVarH.O();
                aVar7 = aVar;
                z25 = z17;
                aVar8 = aVar6;
                z26 = z18;
                aVar9 = aVar5;
                aVar10 = aVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    pVar = new er.p() { // from class: ia.l
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    d5VarM.a(pVar);
                }
            }
            i17 |= 24576;
            z18 = z16;
            i29 = i16 & 32;
            if (i29 != 0) {
                i17 |= 196608;
                aVar6 = aVar3;
            } else {
                aVar6 = aVar3;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(aVar6)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 64;
            if (i36 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.G(aVar4)) {
                    i37 = PKIFailureInfo.badCertTemplate;
                } else {
                    i37 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i37;
            }
            if ((i17 & 599187) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i39 != 0) {
                    z17 = true;
                }
                if (i18 != 0) {
                    objE7 = rVarH.E();
                    if (objE7 == p076m2.r.INSTANCE.a()) {
                        objE7 = new er.a() { // from class: ia.p
                            @Override // er.a
                            public final Object a() {
                                return v.t();
                            }
                        };
                        rVarH.v(objE7);
                    }
                    aVar7 = (er.a) objE7;
                } else {
                    aVar7 = aVar;
                }
                if (i25 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == p076m2.r.INSTANCE.a()) {
                        objE6 = new er.a() { // from class: ia.q
                            @Override // er.a
                            public final Object a() {
                                return v.y();
                            }
                        };
                        rVarH.v(objE6);
                    }
                    aVar9 = (er.a) objE6;
                } else {
                    aVar9 = aVar5;
                }
                z27 = z17;
                if (i27 != 0) {
                    z26 = true;
                } else {
                    z26 = z18;
                }
                if (i29 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.a() { // from class: ia.r
                            @Override // er.a
                            public final Object a() {
                                return v.z();
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar8 = (er.a) objE5;
                } else {
                    aVar8 = aVar6;
                }
                if (i36 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == p076m2.r.INSTANCE.a()) {
                        objE4 = new er.a() { // from class: ia.s
                            @Override // er.a
                            public final Object a() {
                                return v.A();
                            }
                        };
                        rVarH.v(objE4);
                    }
                    aVar10 = (er.a) objE4;
                } else {
                    aVar10 = aVar4;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                }
                if (w.a(rVarH, 0)) {
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        return;
                    } else {
                        pVar = new er.p() { // from class: ia.t
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        };
                    }
                } else {
                    dVarC = g.f90558a.c(rVarH, 6);
                    if (dVarC != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                    }
                    cVarD = dVarC.d();
                    i38 = i17 & 14;
                    if (i38 == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objE = rVarH.E();
                    if (z28) {
                        objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.u(xVar2, (ha.j) obj);
                            }
                        });
                        rVarH.v(objE);
                    } else {
                        objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.u(xVar2, (ha.j) obj);
                            }
                        });
                        rVarH.v(objE);
                    }
                    eVar = (e) objE;
                    boolean zG15 = rVarH.G(eVar);
                    if ((i17 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z411116 = zG15 | z29;
                    if ((i17 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z411117 = z411116 | z35;
                    if ((i17 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z411118 = z411117 | z36;
                    if ((57344 & i17) == 16384) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean z511114 = z411118 | z37;
                    if ((458752 & i17) == 131072) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    boolean z511115 = z511114 | z38;
                    if ((i17 & 3670016) == 1048576) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    boolean z511116 = z39 | z511115;
                    if (i38 == 4) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z511116 | z45;
                    objE2 = rVarH.E();
                    if (z46) {
                        z25 = z27;
                        er.a aVar1116 = new er.a() { // from class: ia.j
                            @Override // er.a
                            public final Object a() {
                                return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                            }
                        };
                        xVar2 = xVar2;
                        rVarH.v(aVar1116);
                        objE2 = aVar1116;
                    } else {
                        z25 = z27;
                        er.a aVar1117 = new er.a() { // from class: ia.j
                            @Override // er.a
                            public final Object a() {
                                return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                            }
                        };
                        xVar2 = xVar2;
                        rVarH.v(aVar1117);
                        objE2 = aVar1117;
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                    objE3 = rVarH.E();
                    if (zG) {
                        objE3 = new er.l() { // from class: ia.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.w(xVar2, eVar, cVarD, (s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.l() { // from class: ia.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.w(xVar2, eVar, cVarD, (s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                }
                d5VarM.a(pVar);
            }
            rVarH.O();
            aVar7 = aVar;
            z25 = z17;
            aVar8 = aVar6;
            z26 = z18;
            aVar9 = aVar5;
            aVar10 = aVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                pVar = new er.p() { // from class: ia.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                };
                d5VarM.a(pVar);
            }
        }
        i17 |= 3072;
        aVar5 = aVar2;
        i27 = i16 & 16;
        if (i27 != 0) {
            if ((i15 & 24576) == 0) {
                z18 = z16;
                if (rVarH.a(z18)) {
                    i28 = 16384;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            }
            i29 = i16 & 32;
            if (i29 != 0) {
                i17 |= 196608;
                aVar6 = aVar3;
            } else {
                aVar6 = aVar3;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(aVar6)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 64;
            if (i36 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.G(aVar4)) {
                    i37 = PKIFailureInfo.badCertTemplate;
                } else {
                    i37 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i37;
            }
            if ((i17 & 599187) != 599186) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i39 != 0) {
                    z17 = true;
                }
                if (i18 != 0) {
                    objE7 = rVarH.E();
                    if (objE7 == p076m2.r.INSTANCE.a()) {
                        objE7 = new er.a() { // from class: ia.p
                            @Override // er.a
                            public final Object a() {
                                return v.t();
                            }
                        };
                        rVarH.v(objE7);
                    }
                    aVar7 = (er.a) objE7;
                } else {
                    aVar7 = aVar;
                }
                if (i25 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == p076m2.r.INSTANCE.a()) {
                        objE6 = new er.a() { // from class: ia.q
                            @Override // er.a
                            public final Object a() {
                                return v.y();
                            }
                        };
                        rVarH.v(objE6);
                    }
                    aVar9 = (er.a) objE6;
                } else {
                    aVar9 = aVar5;
                }
                z27 = z17;
                if (i27 != 0) {
                    z26 = true;
                } else {
                    z26 = z18;
                }
                if (i29 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.a() { // from class: ia.r
                            @Override // er.a
                            public final Object a() {
                                return v.z();
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar8 = (er.a) objE5;
                } else {
                    aVar8 = aVar6;
                }
                if (i36 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == p076m2.r.INSTANCE.a()) {
                        objE4 = new er.a() { // from class: ia.s
                            @Override // er.a
                            public final Object a() {
                                return v.A();
                            }
                        };
                        rVarH.v(objE4);
                    }
                    aVar10 = (er.a) objE4;
                } else {
                    aVar10 = aVar4;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                }
                if (w.a(rVarH, 0)) {
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        return;
                    } else {
                        pVar = new er.p() { // from class: ia.t
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        };
                    }
                } else {
                    dVarC = g.f90558a.c(rVarH, 6);
                    if (dVarC != null) {
                        throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                    }
                    cVarD = dVarC.d();
                    i38 = i17 & 14;
                    if (i38 == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objE = rVarH.E();
                    if (z28) {
                        objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.u(xVar2, (ha.j) obj);
                            }
                        });
                        rVarH.v(objE);
                    } else {
                        objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.u(xVar2, (ha.j) obj);
                            }
                        });
                        rVarH.v(objE);
                    }
                    eVar = (e) objE;
                    boolean zG16 = rVarH.G(eVar);
                    if ((i17 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z411119 = zG16 | z29;
                    if ((i17 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z4111110 = z411119 | z35;
                    if ((i17 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z4111111 = z4111110 | z36;
                    if ((57344 & i17) == 16384) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean z511117 = z4111111 | z37;
                    if ((458752 & i17) == 131072) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    boolean z511118 = z511117 | z38;
                    if ((i17 & 3670016) == 1048576) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    boolean z511119 = z39 | z511118;
                    if (i38 == 4) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z511119 | z45;
                    objE2 = rVarH.E();
                    if (z46) {
                        z25 = z27;
                        er.a aVar1118 = new er.a() { // from class: ia.j
                            @Override // er.a
                            public final Object a() {
                                return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                            }
                        };
                        xVar2 = xVar2;
                        rVarH.v(aVar1118);
                        objE2 = aVar1118;
                    } else {
                        z25 = z27;
                        er.a aVar1119 = new er.a() { // from class: ia.j
                            @Override // er.a
                            public final Object a() {
                                return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                            }
                        };
                        xVar2 = xVar2;
                        rVarH.v(aVar1119);
                        objE2 = aVar1119;
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                    objE3 = rVarH.E();
                    if (zG) {
                        objE3 = new er.l() { // from class: ia.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.w(xVar2, eVar, cVarD, (s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.l() { // from class: ia.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return v.w(xVar2, eVar, cVarD, (s0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                }
                d5VarM.a(pVar);
            }
            rVarH.O();
            aVar7 = aVar;
            z25 = z17;
            aVar8 = aVar6;
            z26 = z18;
            aVar9 = aVar5;
            aVar10 = aVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                pVar = new er.p() { // from class: ia.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                };
                d5VarM.a(pVar);
            }
        }
        i17 |= 24576;
        z18 = z16;
        i29 = i16 & 32;
        if (i29 != 0) {
            i17 |= 196608;
            aVar6 = aVar3;
        } else {
            aVar6 = aVar3;
            if ((i15 & 196608) == 0) {
                if (rVarH.G(aVar6)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
        }
        i36 = i16 & 64;
        if (i36 != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.G(aVar4)) {
                i37 = PKIFailureInfo.badCertTemplate;
            } else {
                i37 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i37;
        }
        if ((i17 & 599187) != 599186) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (rVarH.r(z19, i17 & 1)) {
            if (i39 != 0) {
                z17 = true;
            }
            if (i18 != 0) {
                objE7 = rVarH.E();
                if (objE7 == p076m2.r.INSTANCE.a()) {
                    objE7 = new er.a() { // from class: ia.p
                        @Override // er.a
                        public final Object a() {
                            return v.t();
                        }
                    };
                    rVarH.v(objE7);
                }
                aVar7 = (er.a) objE7;
            } else {
                aVar7 = aVar;
            }
            if (i25 != 0) {
                objE6 = rVarH.E();
                if (objE6 == p076m2.r.INSTANCE.a()) {
                    objE6 = new er.a() { // from class: ia.q
                        @Override // er.a
                        public final Object a() {
                            return v.y();
                        }
                    };
                    rVarH.v(objE6);
                }
                aVar9 = (er.a) objE6;
            } else {
                aVar9 = aVar5;
            }
            z27 = z17;
            if (i27 != 0) {
                z26 = true;
            } else {
                z26 = z18;
            }
            if (i29 != 0) {
                objE5 = rVarH.E();
                if (objE5 == p076m2.r.INSTANCE.a()) {
                    objE5 = new er.a() { // from class: ia.r
                        @Override // er.a
                        public final Object a() {
                            return v.z();
                        }
                    };
                    rVarH.v(objE5);
                }
                aVar8 = (er.a) objE5;
            } else {
                aVar8 = aVar6;
            }
            if (i36 != 0) {
                objE4 = rVarH.E();
                if (objE4 == p076m2.r.INSTANCE.a()) {
                    objE4 = new er.a() { // from class: ia.s
                        @Override // er.a
                        public final Object a() {
                            return v.A();
                        }
                    };
                    rVarH.v(objE4);
                }
                aVar10 = (er.a) objE4;
            } else {
                aVar10 = aVar4;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(898330592, i17, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
            }
            if (w.a(rVarH, 0)) {
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    return;
                } else {
                    pVar = new er.p() { // from class: ia.t
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return v.B(xVar2, z27, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                dVarC = g.f90558a.c(rVarH, 6);
                if (dVarC != null) {
                    throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                }
                cVarD = dVarC.d();
                i38 = i17 & 14;
                if (i38 == 4) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objE = rVarH.E();
                if (z28) {
                    objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                        @Override // er.l
                        public final Object b(Object obj) {
                            return v.u(xVar2, (ha.j) obj);
                        }
                    });
                    rVarH.v(objE);
                } else {
                    objE = new e(xVar2.b(), new er.l() { // from class: ia.u
                        @Override // er.l
                        public final Object b(Object obj) {
                            return v.u(xVar2, (ha.j) obj);
                        }
                    });
                    rVarH.v(objE);
                }
                eVar = (e) objE;
                boolean zG17 = rVarH.G(eVar);
                if ((i17 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean z4111112 = zG17 | z29;
                if ((i17 & 896) == 256) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z4111113 = z4111112 | z35;
                if ((i17 & 7168) == 2048) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z4111114 = z4111113 | z36;
                if ((57344 & i17) == 16384) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                boolean z5111110 = z4111114 | z37;
                if ((458752 & i17) == 131072) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                boolean z5111111 = z5111110 | z38;
                if ((i17 & 3670016) == 1048576) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                boolean z5111112 = z39 | z5111111;
                if (i38 == 4) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z5111112 | z45;
                objE2 = rVarH.E();
                if (z46) {
                    z25 = z27;
                    er.a aVar11110 = new er.a() { // from class: ia.j
                        @Override // er.a
                        public final Object a() {
                            return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                        }
                    };
                    xVar2 = xVar2;
                    rVarH.v(aVar11110);
                    objE2 = aVar11110;
                } else {
                    z25 = z27;
                    er.a aVar11111 = new er.a() { // from class: ia.j
                        @Override // er.a
                        public final Object a() {
                            return v.v(eVar, z25, aVar7, aVar9, z26, aVar8, aVar10, xVar2);
                        }
                    };
                    xVar2 = xVar2;
                    rVarH.v(aVar11111);
                    objE2 = aVar11111;
                }
                Function0.g((er.a) objE2, rVarH, 0);
                zG = rVarH.G(eVar) | (i38 == 4) | rVarH.G(cVarD);
                objE3 = rVarH.E();
                if (zG) {
                    objE3 = new er.l() { // from class: ia.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return v.w(xVar2, eVar, cVarD, (s0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.l() { // from class: ia.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return v.w(xVar2, eVar, cVarD, (s0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                Function0.a(xVar2, (er.l) objE3, rVarH, i38);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
            d5VarM.a(pVar);
        }
        rVarH.O();
        aVar7 = aVar;
        z25 = z17;
        aVar8 = aVar6;
        z26 = z18;
        aVar9 = aVar5;
        aVar10 = aVar4;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            pVar = new er.p() { // from class: ia.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.x(xVar2, z25, aVar7, aVar9, z26, aVar8, aVar10, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            };
            d5VarM.a(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(x xVar, ha.j jVar) {
        xVar.j(jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(e eVar, boolean z15, er.a aVar, er.a aVar2, boolean z16, er.a aVar3, er.a aVar4, x xVar) {
        eVar.A(z15);
        eVar.M(aVar);
        eVar.N(aVar2);
        eVar.y(z16);
        eVar.K(aVar3);
        eVar.L(aVar4);
        eVar.B(xVar.b(), xVar.a(), xVar.c());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 w(x xVar, e eVar, ha.c cVar, s0 s0Var) {
        if (xVar.d() == null) {
            xVar.i(eVar);
            ha.c.b(cVar, eVar, 0, 2, null);
            return new a(eVar, xVar);
        }
        throw new IllegalArgumentException(("NavigationEventState '" + xVar + "' is already registered with a NavigationEventHandler '" + eVar + "'.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(x xVar, boolean z15, er.a aVar, er.a aVar2, boolean z16, er.a aVar3, er.a aVar4, int i15, int i16, p076m2.r rVar, int i17) {
        s(xVar, z15, aVar, aVar2, z16, aVar3, aVar4, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z() {
        return i0.f148189a;
    }
}
