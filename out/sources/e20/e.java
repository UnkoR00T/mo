package e20;

import er.p;
import f3.m;
import java.util.List;
import ju.p0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import w0.i1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"", "", "resourcesIds", "", "isRunning", "maxFramesPerSecond", "Lf3/m;", "modifier", "Loq/i0;", "b", "(Ljava/util/List;ZILf3/m;Lm2/r;II)V", "currentIndex", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f46926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f46927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Integer> f46928h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a3<Integer> f46929j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, long j15, List<Integer> list, a3<Integer> a3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f46926f = z15;
            this.f46927g = j15;
            this.f46928h = list;
            this.f46929j = a3Var;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001e  */
        /* JADX WARN: Code duplicated, block: B:13:0x0028 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0038  */
        /* JADX WARN: Code duplicated, block: B:17:0x0049  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:14:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x001e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f46925e
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oq.u.b(r6)
                goto L29
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oq.u.b(r6)
            L1a:
                boolean r6 = r5.f46926f
                if (r6 == 0) goto L50
                long r3 = r5.f46927g
                r5.f46925e = r2
                java.lang.Object r6 = ju.z0.b(r3, r5)
                if (r6 != r0) goto L29
                return r0
            L29:
                m2.a3<java.lang.Integer> r6 = r5.f46929j
                int r6 = e20.e.f(r6)
                java.util.List<java.lang.Integer> r1 = r5.f46928h
                int r1 = r1.size()
                int r1 = r1 - r2
                if (r6 >= r1) goto L49
                m2.a3<java.lang.Integer> r6 = r5.f46929j
                int r6 = e20.e.f(r6)
                m2.a3<java.lang.Integer> r1 = r5.f46929j
                int r3 = r6 + 1
                e20.e.g(r1, r3)
                vq.b.e(r6)
                goto L1a
            L49:
                m2.a3<java.lang.Integer> r6 = r5.f46929j
                r1 = 0
                e20.e.g(r6, r1)
                goto L1a
            L50:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e20.e.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f46926f, this.f46927g, this.f46928h, this.f46929j, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0135  */
    /* JADX WARN: Code duplicated, block: B:79:0x013c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void b(final List<Integer> list, boolean z15, int i15, m mVar, r rVar, final int i16, final int i17) {
        int i18;
        boolean z16;
        int i19;
        int i25;
        int i26;
        int i27;
        m mVar2;
        int i28;
        int i29;
        boolean z17;
        final boolean z18;
        final int i35;
        final m mVar3;
        d5 d5VarM;
        int i36;
        m mVar4;
        Object objE;
        r.Companion companion;
        a3 a3Var;
        long jN;
        boolean zD;
        Object objE2;
        boolean z19;
        r rVarH = rVar.h(-624833162);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.G(list) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i37 = i17 & 2;
        if (i37 == 0) {
            if ((i16 & 48) == 0) {
                z16 = z15;
                i18 |= rVarH.a(z16) ? 32 : 16;
            }
            i19 = i17 & 4;
            if (i19 != 0) {
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i25 = i15;
                    if (rVarH.c(i25)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i18 |= i26;
                }
                i27 = i17 & 8;
                if (i27 != 0) {
                    if ((i16 & 3072) == 0) {
                        mVar2 = mVar;
                        if (rVarH.W(mVar2)) {
                            i28 = 2048;
                        } else {
                            i28 = 1024;
                        }
                        i18 |= i28;
                    }
                    i29 = i18;
                    if ((i29 & 1171) != 1170) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i29 & 1)) {
                        if (i37 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            i36 = 15;
                        } else {
                            i36 = i25;
                        }
                        if (i27 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (t.k()) {
                            t.o(-624833162, i29, -1, "pl.gov.coi.common.ui.animation.AnimatedPng (AnimatedPng.kt:19)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(0, null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (a3) objE;
                        int iIntValue = list.get(c(a3Var)).intValue();
                        jN = 1000 / lr.m.n(i36, 1, 60);
                        Boolean boolValueOf = Boolean.valueOf(z16);
                        zD = rVarH.d(jN) | ((i29 & 112) == 32) | rVarH.G(list);
                        objE2 = rVarH.E();
                        if (!zD || objE2 == companion.a()) {
                            z19 = z16;
                            a aVar = new a(z19, jN, list, a3Var, null);
                            rVarH.v(aVar);
                            objE2 = aVar;
                        } else {
                            z19 = z16;
                        }
                        int i38 = i29 >> 3;
                        Function0.d(boolValueOf, (p) objE2, rVarH, i38 & 14);
                        int i39 = i36;
                        i1.c(l4.c.c(iIntValue, rVarH, 0), null, mVar4, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | (i38 & 896), 120);
                        if (t.k()) {
                            t.n();
                        }
                        i35 = i39;
                        mVar3 = mVar4;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        z18 = z16;
                        i35 = i25;
                        mVar3 = mVar2;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: e20.d
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return e.e(list, z18, i35, mVar3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 3072;
                mVar2 = mVar;
                i29 = i18;
                if ((i29 & 1171) != 1170) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i29 & 1)) {
                    if (i37 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        i36 = 15;
                    } else {
                        i36 = i25;
                    }
                    if (i27 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (t.k()) {
                        t.o(-624833162, i29, -1, "pl.gov.coi.common.ui.animation.AnimatedPng (AnimatedPng.kt:19)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(0, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    int iIntValue2 = list.get(c(a3Var)).intValue();
                    jN = 1000 / lr.m.n(i36, 1, 60);
                    Boolean boolValueOf2 = Boolean.valueOf(z16);
                    zD = rVarH.d(jN) | ((i29 & 112) == 32) | rVarH.G(list);
                    objE2 = rVarH.E();
                    if (zD) {
                        z19 = z16;
                        a aVar2 = new a(z19, jN, list, a3Var, null);
                        rVarH.v(aVar2);
                        objE2 = aVar2;
                    } else {
                        z19 = z16;
                        a aVar3 = new a(z19, jN, list, a3Var, null);
                        rVarH.v(aVar3);
                        objE2 = aVar3;
                    }
                    int i310 = i29 >> 3;
                    Function0.d(boolValueOf2, (p) objE2, rVarH, i310 & 14);
                    int i311 = i36;
                    i1.c(l4.c.c(iIntValue2, rVarH, 0), null, mVar4, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | (i310 & 896), 120);
                    if (t.k()) {
                        t.n();
                    }
                    i35 = i311;
                    mVar3 = mVar4;
                    z18 = z19;
                } else {
                    rVarH.O();
                    z18 = z16;
                    i35 = i25;
                    mVar3 = mVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: e20.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.e(list, z18, i35, mVar3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= MLKEMEngine.KyberPolyBytes;
            i25 = i15;
            i27 = i17 & 8;
            if (i27 != 0) {
                if ((i16 & 3072) == 0) {
                    mVar2 = mVar;
                    if (rVarH.W(mVar2)) {
                        i28 = 2048;
                    } else {
                        i28 = 1024;
                    }
                    i18 |= i28;
                }
                i29 = i18;
                if ((i29 & 1171) != 1170) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i29 & 1)) {
                    if (i37 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        i36 = 15;
                    } else {
                        i36 = i25;
                    }
                    if (i27 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (t.k()) {
                        t.o(-624833162, i29, -1, "pl.gov.coi.common.ui.animation.AnimatedPng (AnimatedPng.kt:19)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(0, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    int iIntValue3 = list.get(c(a3Var)).intValue();
                    jN = 1000 / lr.m.n(i36, 1, 60);
                    Boolean boolValueOf3 = Boolean.valueOf(z16);
                    zD = rVarH.d(jN) | ((i29 & 112) == 32) | rVarH.G(list);
                    objE2 = rVarH.E();
                    if (zD) {
                        z19 = z16;
                        a aVar4 = new a(z19, jN, list, a3Var, null);
                        rVarH.v(aVar4);
                        objE2 = aVar4;
                    } else {
                        z19 = z16;
                        a aVar5 = new a(z19, jN, list, a3Var, null);
                        rVarH.v(aVar5);
                        objE2 = aVar5;
                    }
                    int i312 = i29 >> 3;
                    Function0.d(boolValueOf3, (p) objE2, rVarH, i312 & 14);
                    int i313 = i36;
                    i1.c(l4.c.c(iIntValue3, rVarH, 0), null, mVar4, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | (i312 & 896), 120);
                    if (t.k()) {
                        t.n();
                    }
                    i35 = i313;
                    mVar3 = mVar4;
                    z18 = z19;
                } else {
                    rVarH.O();
                    z18 = z16;
                    i35 = i25;
                    mVar3 = mVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: e20.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.e(list, z18, i35, mVar3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            mVar2 = mVar;
            i29 = i18;
            if ((i29 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i29 & 1)) {
                if (i37 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    i36 = 15;
                } else {
                    i36 = i25;
                }
                if (i27 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (t.k()) {
                    t.o(-624833162, i29, -1, "pl.gov.coi.common.ui.animation.AnimatedPng (AnimatedPng.kt:19)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(0, null, 2, null);
                    rVarH.v(objE);
                }
                a3Var = (a3) objE;
                int iIntValue4 = list.get(c(a3Var)).intValue();
                jN = 1000 / lr.m.n(i36, 1, 60);
                Boolean boolValueOf4 = Boolean.valueOf(z16);
                zD = rVarH.d(jN) | ((i29 & 112) == 32) | rVarH.G(list);
                objE2 = rVarH.E();
                if (zD) {
                    z19 = z16;
                    a aVar6 = new a(z19, jN, list, a3Var, null);
                    rVarH.v(aVar6);
                    objE2 = aVar6;
                } else {
                    z19 = z16;
                    a aVar7 = new a(z19, jN, list, a3Var, null);
                    rVarH.v(aVar7);
                    objE2 = aVar7;
                }
                int i314 = i29 >> 3;
                Function0.d(boolValueOf4, (p) objE2, rVarH, i314 & 14);
                int i315 = i36;
                i1.c(l4.c.c(iIntValue4, rVarH, 0), null, mVar4, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | (i314 & 896), 120);
                if (t.k()) {
                    t.n();
                }
                i35 = i315;
                mVar3 = mVar4;
                z18 = z19;
            } else {
                rVarH.O();
                z18 = z16;
                i35 = i25;
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: e20.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.e(list, z18, i35, mVar3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        z16 = z15;
        i19 = i17 & 4;
        if (i19 != 0) {
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                i25 = i15;
                if (rVarH.c(i25)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i18 |= i26;
            }
            i27 = i17 & 8;
            if (i27 != 0) {
                if ((i16 & 3072) == 0) {
                    mVar2 = mVar;
                    if (rVarH.W(mVar2)) {
                        i28 = 2048;
                    } else {
                        i28 = 1024;
                    }
                    i18 |= i28;
                }
                i29 = i18;
                if ((i29 & 1171) != 1170) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i29 & 1)) {
                    if (i37 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        i36 = 15;
                    } else {
                        i36 = i25;
                    }
                    if (i27 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (t.k()) {
                        t.o(-624833162, i29, -1, "pl.gov.coi.common.ui.animation.AnimatedPng (AnimatedPng.kt:19)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(0, null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (a3) objE;
                    int iIntValue5 = list.get(c(a3Var)).intValue();
                    jN = 1000 / lr.m.n(i36, 1, 60);
                    Boolean boolValueOf5 = Boolean.valueOf(z16);
                    zD = rVarH.d(jN) | ((i29 & 112) == 32) | rVarH.G(list);
                    objE2 = rVarH.E();
                    if (zD) {
                        z19 = z16;
                        a aVar8 = new a(z19, jN, list, a3Var, null);
                        rVarH.v(aVar8);
                        objE2 = aVar8;
                    } else {
                        z19 = z16;
                        a aVar9 = new a(z19, jN, list, a3Var, null);
                        rVarH.v(aVar9);
                        objE2 = aVar9;
                    }
                    int i316 = i29 >> 3;
                    Function0.d(boolValueOf5, (p) objE2, rVarH, i316 & 14);
                    int i317 = i36;
                    i1.c(l4.c.c(iIntValue5, rVarH, 0), null, mVar4, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | (i316 & 896), 120);
                    if (t.k()) {
                        t.n();
                    }
                    i35 = i317;
                    mVar3 = mVar4;
                    z18 = z19;
                } else {
                    rVarH.O();
                    z18 = z16;
                    i35 = i25;
                    mVar3 = mVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: e20.d
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return e.e(list, z18, i35, mVar3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            mVar2 = mVar;
            i29 = i18;
            if ((i29 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i29 & 1)) {
                if (i37 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    i36 = 15;
                } else {
                    i36 = i25;
                }
                if (i27 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (t.k()) {
                    t.o(-624833162, i29, -1, "pl.gov.coi.common.ui.animation.AnimatedPng (AnimatedPng.kt:19)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(0, null, 2, null);
                    rVarH.v(objE);
                }
                a3Var = (a3) objE;
                int iIntValue6 = list.get(c(a3Var)).intValue();
                jN = 1000 / lr.m.n(i36, 1, 60);
                Boolean boolValueOf6 = Boolean.valueOf(z16);
                zD = rVarH.d(jN) | ((i29 & 112) == 32) | rVarH.G(list);
                objE2 = rVarH.E();
                if (zD) {
                    z19 = z16;
                    a aVar10 = new a(z19, jN, list, a3Var, null);
                    rVarH.v(aVar10);
                    objE2 = aVar10;
                } else {
                    z19 = z16;
                    a aVar11 = new a(z19, jN, list, a3Var, null);
                    rVarH.v(aVar11);
                    objE2 = aVar11;
                }
                int i318 = i29 >> 3;
                Function0.d(boolValueOf6, (p) objE2, rVarH, i318 & 14);
                int i319 = i36;
                i1.c(l4.c.c(iIntValue6, rVarH, 0), null, mVar4, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | (i318 & 896), 120);
                if (t.k()) {
                    t.n();
                }
                i35 = i319;
                mVar3 = mVar4;
                z18 = z19;
            } else {
                rVarH.O();
                z18 = z16;
                i35 = i25;
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: e20.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.e(list, z18, i35, mVar3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= MLKEMEngine.KyberPolyBytes;
        i25 = i15;
        i27 = i17 & 8;
        if (i27 != 0) {
            if ((i16 & 3072) == 0) {
                mVar2 = mVar;
                if (rVarH.W(mVar2)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i18 |= i28;
            }
            i29 = i18;
            if ((i29 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i29 & 1)) {
                if (i37 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    i36 = 15;
                } else {
                    i36 = i25;
                }
                if (i27 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (t.k()) {
                    t.o(-624833162, i29, -1, "pl.gov.coi.common.ui.animation.AnimatedPng (AnimatedPng.kt:19)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(0, null, 2, null);
                    rVarH.v(objE);
                }
                a3Var = (a3) objE;
                int iIntValue7 = list.get(c(a3Var)).intValue();
                jN = 1000 / lr.m.n(i36, 1, 60);
                Boolean boolValueOf7 = Boolean.valueOf(z16);
                zD = rVarH.d(jN) | ((i29 & 112) == 32) | rVarH.G(list);
                objE2 = rVarH.E();
                if (zD) {
                    z19 = z16;
                    a aVar12 = new a(z19, jN, list, a3Var, null);
                    rVarH.v(aVar12);
                    objE2 = aVar12;
                } else {
                    z19 = z16;
                    a aVar13 = new a(z19, jN, list, a3Var, null);
                    rVarH.v(aVar13);
                    objE2 = aVar13;
                }
                int i3110 = i29 >> 3;
                Function0.d(boolValueOf7, (p) objE2, rVarH, i3110 & 14);
                int i3111 = i36;
                i1.c(l4.c.c(iIntValue7, rVarH, 0), null, mVar4, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | (i3110 & 896), 120);
                if (t.k()) {
                    t.n();
                }
                i35 = i3111;
                mVar3 = mVar4;
                z18 = z19;
            } else {
                rVarH.O();
                z18 = z16;
                i35 = i25;
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: e20.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.e(list, z18, i35, mVar3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        mVar2 = mVar;
        i29 = i18;
        if ((i29 & 1171) != 1170) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i29 & 1)) {
            if (i37 != 0) {
                z16 = true;
            }
            if (i19 != 0) {
                i36 = 15;
            } else {
                i36 = i25;
            }
            if (i27 != 0) {
                mVar4 = m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (t.k()) {
                t.o(-624833162, i29, -1, "pl.gov.coi.common.ui.animation.AnimatedPng (AnimatedPng.kt:19)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(0, null, 2, null);
                rVarH.v(objE);
            }
            a3Var = (a3) objE;
            int iIntValue8 = list.get(c(a3Var)).intValue();
            jN = 1000 / lr.m.n(i36, 1, 60);
            Boolean boolValueOf8 = Boolean.valueOf(z16);
            zD = rVarH.d(jN) | ((i29 & 112) == 32) | rVarH.G(list);
            objE2 = rVarH.E();
            if (zD) {
                z19 = z16;
                a aVar14 = new a(z19, jN, list, a3Var, null);
                rVarH.v(aVar14);
                objE2 = aVar14;
            } else {
                z19 = z16;
                a aVar15 = new a(z19, jN, list, a3Var, null);
                rVarH.v(aVar15);
                objE2 = aVar15;
            }
            int i3112 = i29 >> 3;
            Function0.d(boolValueOf8, (p) objE2, rVarH, i3112 & 14);
            int i3113 = i36;
            i1.c(l4.c.c(iIntValue8, rVarH, 0), null, mVar4, null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48 | (i3112 & 896), 120);
            if (t.k()) {
                t.n();
            }
            i35 = i3113;
            mVar3 = mVar4;
            z18 = z19;
        } else {
            rVarH.O();
            z18 = z16;
            i35 = i25;
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e20.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.e(list, z18, i35, mVar3, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(a3<Integer> a3Var) {
        return a3Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a3<Integer> a3Var, int i15) {
        a3Var.setValue(Integer.valueOf(i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(List list, boolean z15, int i15, m mVar, int i16, int i17, r rVar, int i18) {
        b(list, z15, i15, mVar, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }
}
