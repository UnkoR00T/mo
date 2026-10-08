package ka3;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ae\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b\"\u0010#¨\u0006&²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002"}, d2 = {"Lka3/p;", "viewModel", "Loq/i0;", "s", "(Lka3/p;Lm2/r;I)V", "Lka3/p$a$c;", "data", "v", "(Lka3/p$a$c;Lm2/r;I)V", "Lka3/p$a$b;", "p", "(Lka3/p$a$b;Lm2/r;I)V", "Lf3/m;", "modifier", "Lmx/a;", "title", "description", "Ln50/k;", "mainCard", "", "Lka3/p$a$d;", "sections", "Lka3/a;", "statementWithBringIntoView", "buttonSection", "j", "(Lf3/m;Lmx/a;Lmx/a;Ln50/k;Ljava/util/List;Lka3/a;Ljava/util/List;Lm2/r;II)V", "section", "l", "(Lka3/p$a$d;Lm2/r;I)V", "Lka3/p$a$c$a;", "statement", "Lj1/a;", "bringIntoViewRequester", "n", "(Lka3/p$a$c$a;Lj1/a;Lm2/r;I)V", "Lka3/p$a;", "state", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p.a.InitializedSummary f109646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f109647g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p.a.InitializedSummary initializedSummary, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f109646f = initializedSummary;
            this.f109647g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f109645e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f109646f.getStatement().getScrollTo()) {
                    j1.a aVar = this.f109647g;
                    this.f109645e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f109646f.getStatement().b().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f109646f, this.f109647g, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017e  */
    /* JADX WARN: Code duplicated, block: B:103:0x018c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0227  */
    /* JADX WARN: Code duplicated, block: B:106:0x0232  */
    /* JADX WARN: Code duplicated, block: B:109:0x02cd A[LOOP:0: B:108:0x02cb->B:109:0x02cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:116:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031d  */
    /* JADX WARN: Code duplicated, block: B:121:0x034c A[LOOP:1: B:119:0x0346->B:121:0x034c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x037a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0385  */
    /* JADX WARN: Code duplicated, block: B:130:0x0394  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0148  */
    /* JADX WARN: Code duplicated, block: B:99:0x014c  */
    private static final void j(f3.m mVar, Label label, Label label2, final n50.k kVar, final List<p.a.Section> list, StatementWithBringIntoView statementWithBringIntoView, List<? extends n50.k> list2, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        Label label3;
        int i18;
        Label label4;
        int i19;
        int i25;
        StatementWithBringIntoView statementWithBringIntoView2;
        int i26;
        int i27;
        List<? extends n50.k> list3;
        int i28;
        boolean z15;
        p076m2.r rVar2;
        final List<? extends n50.k> list4;
        final f3.m mVar3;
        final Label label5;
        final Label label6;
        final StatementWithBringIntoView statementWithBringIntoView3;
        d5 d5VarM;
        Label label7;
        Label label8;
        StatementWithBringIntoView statementWithBringIntoView4;
        er.a<androidx.compose.ui.node.c> aVarB;
        Label label9;
        int i29;
        int size;
        int i35;
        Iterator<T> it;
        int i36;
        int i37;
        p076m2.r rVarH = rVar.h(-1210444734);
        int i38 = i16 & 1;
        if (i38 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        int i39 = i16 & 2;
        if (i39 == 0) {
            if ((i15 & 48) == 0) {
                label3 = label;
                i17 |= rVarH.W(label3) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    label4 = label2;
                    if (rVarH.W(label4)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if (rVarH.G(kVar)) {
                        i37 = 2048;
                    } else {
                        i37 = 1024;
                    }
                    i17 |= i37;
                }
                if ((i15 & 24576) == 0) {
                    if (rVarH.G(list)) {
                        i36 = 16384;
                    } else {
                        i36 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i36;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    if ((196608 & i15) == 0) {
                        statementWithBringIntoView2 = statementWithBringIntoView;
                        if (rVarH.G(statementWithBringIntoView2)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 64;
                    if (i27 != 0) {
                        i17 |= 1572864;
                        list3 = list2;
                    } else {
                        list3 = list2;
                        if ((i15 & 1572864) == 0) {
                            if (rVarH.G(list3)) {
                                i28 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i28 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i28;
                        }
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i38 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i39 != 0) {
                            label7 = null;
                        } else {
                            label7 = label3;
                        }
                        if (i18 != 0) {
                            label8 = null;
                        } else {
                            label8 = label4;
                        }
                        if (i25 != 0) {
                            statementWithBringIntoView4 = null;
                        } else {
                            statementWithBringIntoView4 = statementWithBringIntoView2;
                        }
                        if (i27 != 0) {
                            list3 = null;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(-1210444734, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Content (TripOverviewScreen.kt:112)");
                        }
                        f3.m mVarC = w0.q0.c(t70.s.n(t70.i.S(mVar2, null, rVarH, i17 & 14, 1), rVarH, 0), true, null, 2, null);
                        p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT = rVarH.t();
                        f3.m mVarE = f3.j.e(rVarH, mVarC);
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
                        n6.i(rVarC, w0VarA, companion.d());
                        n6.i(rVarC, e0VarT, companion.f());
                        n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                        n6.g(rVarC, companion.a());
                        n6.i(rVarC, mVarE, companion.e());
                        d1.i0 i0Var = d1.i0.f39176a;
                        if (label7 == null) {
                            rVarH.X(1008958142);
                            rVarH.R();
                            rVar2 = rVarH;
                        } else {
                            rVarH.X(1008958143);
                            k70.a aVar = k70.a.f108864a;
                            int i45 = k70.a.f108865b;
                            j70.h.g(null, null, label7, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i45).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                            rVar2 = rVarH;
                            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i45).getSpacing100()), rVar2, 0);
                            rVar2.R();
                        }
                        if (label8 == null) {
                            rVar2.X(1009179451);
                            rVar2.R();
                            label9 = label8;
                        } else {
                            rVar2.X(1009179452);
                            k70.a aVar2 = k70.a.f108864a;
                            int i46 = k70.a.f108865b;
                            p076m2.r rVar3 = rVar2;
                            label9 = label8;
                            j70.h.g(null, null, label9, null, null, aVar2.a(rVar2, i46).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i46).d(), null, null, false, false, null, rVar3, 0, 0, 0, 33030107);
                            rVar2 = rVar3;
                            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar2.b(rVar2, i46).getSpacing200()), rVar2, 0);
                            rVar2.R();
                        }
                        n50.h0.v(kVar, null, rVar2, (i17 >> 9) & 14, 2);
                        i29 = 0;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                        rVar2.X(-1907095607);
                        size = list.size();
                        i35 = 0;
                        while (i35 < size) {
                            l(list.get(i35), rVar2, i29);
                            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i29);
                            i35++;
                            i29 = 0;
                        }
                        rVar2.R();
                        if (statementWithBringIntoView4 == null) {
                            rVar2.X(1009756857);
                        } else {
                            rVar2.X(1009756858);
                            n(statementWithBringIntoView4.getStatement(), statementWithBringIntoView4.getBringIntoViewRequester(), rVar2, 0);
                        }
                        rVar2.R();
                        if (list3 == null) {
                            rVar2.X(1009986319);
                        } else {
                            rVar2.X(1009986320);
                            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                            rVar2.X(-1907078577);
                            it = list3.iterator();
                            while (it.hasNext()) {
                                n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                            }
                            rVar2.R();
                        }
                        rVar2.R();
                        rVar2.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        list4 = list3;
                        mVar3 = mVar2;
                        label6 = label9;
                        statementWithBringIntoView3 = statementWithBringIntoView4;
                        label5 = label7;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        list4 = list3;
                        mVar3 = mVar2;
                        label5 = label3;
                        label6 = label4;
                        statementWithBringIntoView3 = statementWithBringIntoView2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: ka3.w
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return z.k(mVar3, label5, label6, kVar, list, statementWithBringIntoView3, list4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                statementWithBringIntoView2 = statementWithBringIntoView;
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                    list3 = list2;
                } else {
                    list3 = list2;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(list3)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i38 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i39 != 0) {
                        label7 = null;
                    } else {
                        label7 = label3;
                    }
                    if (i18 != 0) {
                        label8 = null;
                    } else {
                        label8 = label4;
                    }
                    if (i25 != 0) {
                        statementWithBringIntoView4 = null;
                    } else {
                        statementWithBringIntoView4 = statementWithBringIntoView2;
                    }
                    if (i27 != 0) {
                        list3 = null;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1210444734, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Content (TripOverviewScreen.kt:112)");
                    }
                    f3.m mVarC2 = w0.q0.c(t70.s.n(t70.i.S(mVar2, null, rVarH, i17 & 14, 1), rVarH, 0), true, null, 2, null);
                    p036e4.w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    f3.m mVarE2 = f3.j.e(rVarH, mVarC2);
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
                    n6.i(rVarC2, w0VarA2, companion2.d());
                    n6.i(rVarC2, e0VarT2, companion2.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                    n6.g(rVarC2, companion2.a());
                    n6.i(rVarC2, mVarE2, companion2.e());
                    d1.i0 i0Var2 = d1.i0.f39176a;
                    if (label7 == null) {
                        rVarH.X(1008958142);
                        rVarH.R();
                        rVar2 = rVarH;
                    } else {
                        rVarH.X(1008958143);
                        k70.a aVar3 = k70.a.f108864a;
                        int i47 = k70.a.f108865b;
                        j70.h.g(null, null, label7, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i47).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                        rVar2 = rVarH;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar3.b(rVar2, i47).getSpacing100()), rVar2, 0);
                        rVar2.R();
                    }
                    if (label8 == null) {
                        rVar2.X(1009179451);
                        rVar2.R();
                        label9 = label8;
                    } else {
                        rVar2.X(1009179452);
                        k70.a aVar4 = k70.a.f108864a;
                        int i48 = k70.a.f108865b;
                        p076m2.r rVar4 = rVar2;
                        label9 = label8;
                        j70.h.g(null, null, label9, null, null, aVar4.a(rVar2, i48).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar2, i48).d(), null, null, false, false, null, rVar4, 0, 0, 0, 33030107);
                        rVar2 = rVar4;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar4.b(rVar2, i48).getSpacing200()), rVar2, 0);
                        rVar2.R();
                    }
                    n50.h0.v(kVar, null, rVar2, (i17 >> 9) & 14, 2);
                    i29 = 0;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    rVar2.X(-1907095607);
                    size = list.size();
                    i35 = 0;
                    while (i35 < size) {
                        l(list.get(i35), rVar2, i29);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i29);
                        i35++;
                        i29 = 0;
                    }
                    rVar2.R();
                    if (statementWithBringIntoView4 == null) {
                        rVar2.X(1009756857);
                    } else {
                        rVar2.X(1009756858);
                        n(statementWithBringIntoView4.getStatement(), statementWithBringIntoView4.getBringIntoViewRequester(), rVar2, 0);
                    }
                    rVar2.R();
                    if (list3 == null) {
                        rVar2.X(1009986319);
                    } else {
                        rVar2.X(1009986320);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                        rVar2.X(-1907078577);
                        it = list3.iterator();
                        while (it.hasNext()) {
                            n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                        }
                        rVar2.R();
                    }
                    rVar2.R();
                    rVar2.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    list4 = list3;
                    mVar3 = mVar2;
                    label6 = label9;
                    statementWithBringIntoView3 = statementWithBringIntoView4;
                    label5 = label7;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    list4 = list3;
                    mVar3 = mVar2;
                    label5 = label3;
                    label6 = label4;
                    statementWithBringIntoView3 = statementWithBringIntoView2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: ka3.w
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return z.k(mVar3, label5, label6, kVar, list, statementWithBringIntoView3, list4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            label4 = label2;
            if ((i15 & 3072) == 0) {
                if (rVarH.G(kVar)) {
                    i37 = 2048;
                } else {
                    i37 = 1024;
                }
                i17 |= i37;
            }
            if ((i15 & 24576) == 0) {
                if (rVarH.G(list)) {
                    i36 = 16384;
                } else {
                    i36 = PKIFailureInfo.certRevoked;
                }
                i17 |= i36;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    statementWithBringIntoView2 = statementWithBringIntoView;
                    if (rVarH.G(statementWithBringIntoView2)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                    list3 = list2;
                } else {
                    list3 = list2;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(list3)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i38 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i39 != 0) {
                        label7 = null;
                    } else {
                        label7 = label3;
                    }
                    if (i18 != 0) {
                        label8 = null;
                    } else {
                        label8 = label4;
                    }
                    if (i25 != 0) {
                        statementWithBringIntoView4 = null;
                    } else {
                        statementWithBringIntoView4 = statementWithBringIntoView2;
                    }
                    if (i27 != 0) {
                        list3 = null;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1210444734, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Content (TripOverviewScreen.kt:112)");
                    }
                    f3.m mVarC3 = w0.q0.c(t70.s.n(t70.i.S(mVar2, null, rVarH, i17 & 14, 1), rVarH, 0), true, null, 2, null);
                    p036e4.w0 w0VarA3 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT3 = rVarH.t();
                    f3.m mVarE3 = f3.j.e(rVarH, mVarC3);
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
                    n6.i(rVarC3, w0VarA3, companion3.d());
                    n6.i(rVarC3, e0VarT3, companion3.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                    n6.g(rVarC3, companion3.a());
                    n6.i(rVarC3, mVarE3, companion3.e());
                    d1.i0 i0Var3 = d1.i0.f39176a;
                    if (label7 == null) {
                        rVarH.X(1008958142);
                        rVarH.R();
                        rVar2 = rVarH;
                    } else {
                        rVarH.X(1008958143);
                        k70.a aVar5 = k70.a.f108864a;
                        int i49 = k70.a.f108865b;
                        j70.h.g(null, null, label7, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar5.f(rVarH, i49).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                        rVar2 = rVarH;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar5.b(rVar2, i49).getSpacing100()), rVar2, 0);
                        rVar2.R();
                    }
                    if (label8 == null) {
                        rVar2.X(1009179451);
                        rVar2.R();
                        label9 = label8;
                    } else {
                        rVar2.X(1009179452);
                        k70.a aVar6 = k70.a.f108864a;
                        int i410 = k70.a.f108865b;
                        p076m2.r rVar5 = rVar2;
                        label9 = label8;
                        j70.h.g(null, null, label9, null, null, aVar6.a(rVar2, i410).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar6.f(rVar2, i410).d(), null, null, false, false, null, rVar5, 0, 0, 0, 33030107);
                        rVar2 = rVar5;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar6.b(rVar2, i410).getSpacing200()), rVar2, 0);
                        rVar2.R();
                    }
                    n50.h0.v(kVar, null, rVar2, (i17 >> 9) & 14, 2);
                    i29 = 0;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    rVar2.X(-1907095607);
                    size = list.size();
                    i35 = 0;
                    while (i35 < size) {
                        l(list.get(i35), rVar2, i29);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i29);
                        i35++;
                        i29 = 0;
                    }
                    rVar2.R();
                    if (statementWithBringIntoView4 == null) {
                        rVar2.X(1009756857);
                    } else {
                        rVar2.X(1009756858);
                        n(statementWithBringIntoView4.getStatement(), statementWithBringIntoView4.getBringIntoViewRequester(), rVar2, 0);
                    }
                    rVar2.R();
                    if (list3 == null) {
                        rVar2.X(1009986319);
                    } else {
                        rVar2.X(1009986320);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                        rVar2.X(-1907078577);
                        it = list3.iterator();
                        while (it.hasNext()) {
                            n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                        }
                        rVar2.R();
                    }
                    rVar2.R();
                    rVar2.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    list4 = list3;
                    mVar3 = mVar2;
                    label6 = label9;
                    statementWithBringIntoView3 = statementWithBringIntoView4;
                    label5 = label7;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    list4 = list3;
                    mVar3 = mVar2;
                    label5 = label3;
                    label6 = label4;
                    statementWithBringIntoView3 = statementWithBringIntoView2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: ka3.w
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return z.k(mVar3, label5, label6, kVar, list, statementWithBringIntoView3, list4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            statementWithBringIntoView2 = statementWithBringIntoView;
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
                list3 = list2;
            } else {
                list3 = list2;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(list3)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i38 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i39 != 0) {
                    label7 = null;
                } else {
                    label7 = label3;
                }
                if (i18 != 0) {
                    label8 = null;
                } else {
                    label8 = label4;
                }
                if (i25 != 0) {
                    statementWithBringIntoView4 = null;
                } else {
                    statementWithBringIntoView4 = statementWithBringIntoView2;
                }
                if (i27 != 0) {
                    list3 = null;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1210444734, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Content (TripOverviewScreen.kt:112)");
                }
                f3.m mVarC4 = w0.q0.c(t70.s.n(t70.i.S(mVar2, null, rVarH, i17 & 14, 1), rVarH, 0), true, null, 2, null);
                p036e4.w0 w0VarA4 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT4 = rVarH.t();
                f3.m mVarE4 = f3.j.e(rVarH, mVarC4);
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
                n6.i(rVarC4, w0VarA4, companion4.d());
                n6.i(rVarC4, e0VarT4, companion4.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
                n6.g(rVarC4, companion4.a());
                n6.i(rVarC4, mVarE4, companion4.e());
                d1.i0 i0Var4 = d1.i0.f39176a;
                if (label7 == null) {
                    rVarH.X(1008958142);
                    rVarH.R();
                    rVar2 = rVarH;
                } else {
                    rVarH.X(1008958143);
                    k70.a aVar7 = k70.a.f108864a;
                    int i411 = k70.a.f108865b;
                    j70.h.g(null, null, label7, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar7.f(rVarH, i411).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                    rVar2 = rVarH;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar7.b(rVar2, i411).getSpacing100()), rVar2, 0);
                    rVar2.R();
                }
                if (label8 == null) {
                    rVar2.X(1009179451);
                    rVar2.R();
                    label9 = label8;
                } else {
                    rVar2.X(1009179452);
                    k70.a aVar8 = k70.a.f108864a;
                    int i412 = k70.a.f108865b;
                    p076m2.r rVar6 = rVar2;
                    label9 = label8;
                    j70.h.g(null, null, label9, null, null, aVar8.a(rVar2, i412).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar8.f(rVar2, i412).d(), null, null, false, false, null, rVar6, 0, 0, 0, 33030107);
                    rVar2 = rVar6;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar8.b(rVar2, i412).getSpacing200()), rVar2, 0);
                    rVar2.R();
                }
                n50.h0.v(kVar, null, rVar2, (i17 >> 9) & 14, 2);
                i29 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                rVar2.X(-1907095607);
                size = list.size();
                i35 = 0;
                while (i35 < size) {
                    l(list.get(i35), rVar2, i29);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i29);
                    i35++;
                    i29 = 0;
                }
                rVar2.R();
                if (statementWithBringIntoView4 == null) {
                    rVar2.X(1009756857);
                } else {
                    rVar2.X(1009756858);
                    n(statementWithBringIntoView4.getStatement(), statementWithBringIntoView4.getBringIntoViewRequester(), rVar2, 0);
                }
                rVar2.R();
                if (list3 == null) {
                    rVar2.X(1009986319);
                } else {
                    rVar2.X(1009986320);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    rVar2.X(-1907078577);
                    it = list3.iterator();
                    while (it.hasNext()) {
                        n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                    }
                    rVar2.R();
                }
                rVar2.R();
                rVar2.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                list4 = list3;
                mVar3 = mVar2;
                label6 = label9;
                statementWithBringIntoView3 = statementWithBringIntoView4;
                label5 = label7;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                list4 = list3;
                mVar3 = mVar2;
                label5 = label3;
                label6 = label4;
                statementWithBringIntoView3 = statementWithBringIntoView2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ka3.w
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return z.k(mVar3, label5, label6, kVar, list, statementWithBringIntoView3, list4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        label3 = label;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                label4 = label2;
                if (rVarH.W(label4)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.G(kVar)) {
                    i37 = 2048;
                } else {
                    i37 = 1024;
                }
                i17 |= i37;
            }
            if ((i15 & 24576) == 0) {
                if (rVarH.G(list)) {
                    i36 = 16384;
                } else {
                    i36 = PKIFailureInfo.certRevoked;
                }
                i17 |= i36;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    statementWithBringIntoView2 = statementWithBringIntoView;
                    if (rVarH.G(statementWithBringIntoView2)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                    list3 = list2;
                } else {
                    list3 = list2;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(list3)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i38 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i39 != 0) {
                        label7 = null;
                    } else {
                        label7 = label3;
                    }
                    if (i18 != 0) {
                        label8 = null;
                    } else {
                        label8 = label4;
                    }
                    if (i25 != 0) {
                        statementWithBringIntoView4 = null;
                    } else {
                        statementWithBringIntoView4 = statementWithBringIntoView2;
                    }
                    if (i27 != 0) {
                        list3 = null;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1210444734, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Content (TripOverviewScreen.kt:112)");
                    }
                    f3.m mVarC5 = w0.q0.c(t70.s.n(t70.i.S(mVar2, null, rVarH, i17 & 14, 1), rVarH, 0), true, null, 2, null);
                    p036e4.w0 w0VarA5 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                    int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT5 = rVarH.t();
                    f3.m mVarE5 = f3.j.e(rVarH, mVarC5);
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
                    n6.i(rVarC5, w0VarA5, companion5.d());
                    n6.i(rVarC5, e0VarT5, companion5.f());
                    n6.i(rVarC5, Integer.valueOf(iHashCode5), companion5.c());
                    n6.g(rVarC5, companion5.a());
                    n6.i(rVarC5, mVarE5, companion5.e());
                    d1.i0 i0Var5 = d1.i0.f39176a;
                    if (label7 == null) {
                        rVarH.X(1008958142);
                        rVarH.R();
                        rVar2 = rVarH;
                    } else {
                        rVarH.X(1008958143);
                        k70.a aVar9 = k70.a.f108864a;
                        int i413 = k70.a.f108865b;
                        j70.h.g(null, null, label7, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar9.f(rVarH, i413).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                        rVar2 = rVarH;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar9.b(rVar2, i413).getSpacing100()), rVar2, 0);
                        rVar2.R();
                    }
                    if (label8 == null) {
                        rVar2.X(1009179451);
                        rVar2.R();
                        label9 = label8;
                    } else {
                        rVar2.X(1009179452);
                        k70.a aVar10 = k70.a.f108864a;
                        int i414 = k70.a.f108865b;
                        p076m2.r rVar7 = rVar2;
                        label9 = label8;
                        j70.h.g(null, null, label9, null, null, aVar10.a(rVar2, i414).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar10.f(rVar2, i414).d(), null, null, false, false, null, rVar7, 0, 0, 0, 33030107);
                        rVar2 = rVar7;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar10.b(rVar2, i414).getSpacing200()), rVar2, 0);
                        rVar2.R();
                    }
                    n50.h0.v(kVar, null, rVar2, (i17 >> 9) & 14, 2);
                    i29 = 0;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    rVar2.X(-1907095607);
                    size = list.size();
                    i35 = 0;
                    while (i35 < size) {
                        l(list.get(i35), rVar2, i29);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i29);
                        i35++;
                        i29 = 0;
                    }
                    rVar2.R();
                    if (statementWithBringIntoView4 == null) {
                        rVar2.X(1009756857);
                    } else {
                        rVar2.X(1009756858);
                        n(statementWithBringIntoView4.getStatement(), statementWithBringIntoView4.getBringIntoViewRequester(), rVar2, 0);
                    }
                    rVar2.R();
                    if (list3 == null) {
                        rVar2.X(1009986319);
                    } else {
                        rVar2.X(1009986320);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                        rVar2.X(-1907078577);
                        it = list3.iterator();
                        while (it.hasNext()) {
                            n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                        }
                        rVar2.R();
                    }
                    rVar2.R();
                    rVar2.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    list4 = list3;
                    mVar3 = mVar2;
                    label6 = label9;
                    statementWithBringIntoView3 = statementWithBringIntoView4;
                    label5 = label7;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    list4 = list3;
                    mVar3 = mVar2;
                    label5 = label3;
                    label6 = label4;
                    statementWithBringIntoView3 = statementWithBringIntoView2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: ka3.w
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return z.k(mVar3, label5, label6, kVar, list, statementWithBringIntoView3, list4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            statementWithBringIntoView2 = statementWithBringIntoView;
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
                list3 = list2;
            } else {
                list3 = list2;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(list3)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i38 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i39 != 0) {
                    label7 = null;
                } else {
                    label7 = label3;
                }
                if (i18 != 0) {
                    label8 = null;
                } else {
                    label8 = label4;
                }
                if (i25 != 0) {
                    statementWithBringIntoView4 = null;
                } else {
                    statementWithBringIntoView4 = statementWithBringIntoView2;
                }
                if (i27 != 0) {
                    list3 = null;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1210444734, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Content (TripOverviewScreen.kt:112)");
                }
                f3.m mVarC6 = w0.q0.c(t70.s.n(t70.i.S(mVar2, null, rVarH, i17 & 14, 1), rVarH, 0), true, null, 2, null);
                p036e4.w0 w0VarA6 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT6 = rVarH.t();
                f3.m mVarE6 = f3.j.e(rVarH, mVarC6);
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
                n6.i(rVarC6, w0VarA6, companion6.d());
                n6.i(rVarC6, e0VarT6, companion6.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion6.c());
                n6.g(rVarC6, companion6.a());
                n6.i(rVarC6, mVarE6, companion6.e());
                d1.i0 i0Var6 = d1.i0.f39176a;
                if (label7 == null) {
                    rVarH.X(1008958142);
                    rVarH.R();
                    rVar2 = rVarH;
                } else {
                    rVarH.X(1008958143);
                    k70.a aVar11 = k70.a.f108864a;
                    int i415 = k70.a.f108865b;
                    j70.h.g(null, null, label7, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar11.f(rVarH, i415).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                    rVar2 = rVarH;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar11.b(rVar2, i415).getSpacing100()), rVar2, 0);
                    rVar2.R();
                }
                if (label8 == null) {
                    rVar2.X(1009179451);
                    rVar2.R();
                    label9 = label8;
                } else {
                    rVar2.X(1009179452);
                    k70.a aVar12 = k70.a.f108864a;
                    int i416 = k70.a.f108865b;
                    p076m2.r rVar8 = rVar2;
                    label9 = label8;
                    j70.h.g(null, null, label9, null, null, aVar12.a(rVar2, i416).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar12.f(rVar2, i416).d(), null, null, false, false, null, rVar8, 0, 0, 0, 33030107);
                    rVar2 = rVar8;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar12.b(rVar2, i416).getSpacing200()), rVar2, 0);
                    rVar2.R();
                }
                n50.h0.v(kVar, null, rVar2, (i17 >> 9) & 14, 2);
                i29 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                rVar2.X(-1907095607);
                size = list.size();
                i35 = 0;
                while (i35 < size) {
                    l(list.get(i35), rVar2, i29);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i29);
                    i35++;
                    i29 = 0;
                }
                rVar2.R();
                if (statementWithBringIntoView4 == null) {
                    rVar2.X(1009756857);
                } else {
                    rVar2.X(1009756858);
                    n(statementWithBringIntoView4.getStatement(), statementWithBringIntoView4.getBringIntoViewRequester(), rVar2, 0);
                }
                rVar2.R();
                if (list3 == null) {
                    rVar2.X(1009986319);
                } else {
                    rVar2.X(1009986320);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    rVar2.X(-1907078577);
                    it = list3.iterator();
                    while (it.hasNext()) {
                        n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                    }
                    rVar2.R();
                }
                rVar2.R();
                rVar2.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                list4 = list3;
                mVar3 = mVar2;
                label6 = label9;
                statementWithBringIntoView3 = statementWithBringIntoView4;
                label5 = label7;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                list4 = list3;
                mVar3 = mVar2;
                label5 = label3;
                label6 = label4;
                statementWithBringIntoView3 = statementWithBringIntoView2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ka3.w
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return z.k(mVar3, label5, label6, kVar, list, statementWithBringIntoView3, list4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        label4 = label2;
        if ((i15 & 3072) == 0) {
            if (rVarH.G(kVar)) {
                i37 = 2048;
            } else {
                i37 = 1024;
            }
            i17 |= i37;
        }
        if ((i15 & 24576) == 0) {
            if (rVarH.G(list)) {
                i36 = 16384;
            } else {
                i36 = PKIFailureInfo.certRevoked;
            }
            i17 |= i36;
        }
        i25 = i16 & 32;
        if (i25 != 0) {
            if ((196608 & i15) == 0) {
                statementWithBringIntoView2 = statementWithBringIntoView;
                if (rVarH.G(statementWithBringIntoView2)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
                list3 = list2;
            } else {
                list3 = list2;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(list3)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i38 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i39 != 0) {
                    label7 = null;
                } else {
                    label7 = label3;
                }
                if (i18 != 0) {
                    label8 = null;
                } else {
                    label8 = label4;
                }
                if (i25 != 0) {
                    statementWithBringIntoView4 = null;
                } else {
                    statementWithBringIntoView4 = statementWithBringIntoView2;
                }
                if (i27 != 0) {
                    list3 = null;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1210444734, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Content (TripOverviewScreen.kt:112)");
                }
                f3.m mVarC7 = w0.q0.c(t70.s.n(t70.i.S(mVar2, null, rVarH, i17 & 14, 1), rVarH, 0), true, null, 2, null);
                p036e4.w0 w0VarA7 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT7 = rVarH.t();
                f3.m mVarE7 = f3.j.e(rVarH, mVarC7);
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
                n6.i(rVarC7, w0VarA7, companion7.d());
                n6.i(rVarC7, e0VarT7, companion7.f());
                n6.i(rVarC7, Integer.valueOf(iHashCode7), companion7.c());
                n6.g(rVarC7, companion7.a());
                n6.i(rVarC7, mVarE7, companion7.e());
                d1.i0 i0Var7 = d1.i0.f39176a;
                if (label7 == null) {
                    rVarH.X(1008958142);
                    rVarH.R();
                    rVar2 = rVarH;
                } else {
                    rVarH.X(1008958143);
                    k70.a aVar13 = k70.a.f108864a;
                    int i417 = k70.a.f108865b;
                    j70.h.g(null, null, label7, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar13.f(rVarH, i417).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                    rVar2 = rVarH;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar13.b(rVar2, i417).getSpacing100()), rVar2, 0);
                    rVar2.R();
                }
                if (label8 == null) {
                    rVar2.X(1009179451);
                    rVar2.R();
                    label9 = label8;
                } else {
                    rVar2.X(1009179452);
                    k70.a aVar14 = k70.a.f108864a;
                    int i418 = k70.a.f108865b;
                    p076m2.r rVar9 = rVar2;
                    label9 = label8;
                    j70.h.g(null, null, label9, null, null, aVar14.a(rVar2, i418).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar14.f(rVar2, i418).d(), null, null, false, false, null, rVar9, 0, 0, 0, 33030107);
                    rVar2 = rVar9;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar14.b(rVar2, i418).getSpacing200()), rVar2, 0);
                    rVar2.R();
                }
                n50.h0.v(kVar, null, rVar2, (i17 >> 9) & 14, 2);
                i29 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                rVar2.X(-1907095607);
                size = list.size();
                i35 = 0;
                while (i35 < size) {
                    l(list.get(i35), rVar2, i29);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i29);
                    i35++;
                    i29 = 0;
                }
                rVar2.R();
                if (statementWithBringIntoView4 == null) {
                    rVar2.X(1009756857);
                } else {
                    rVar2.X(1009756858);
                    n(statementWithBringIntoView4.getStatement(), statementWithBringIntoView4.getBringIntoViewRequester(), rVar2, 0);
                }
                rVar2.R();
                if (list3 == null) {
                    rVar2.X(1009986319);
                } else {
                    rVar2.X(1009986320);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    rVar2.X(-1907078577);
                    it = list3.iterator();
                    while (it.hasNext()) {
                        n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                    }
                    rVar2.R();
                }
                rVar2.R();
                rVar2.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                list4 = list3;
                mVar3 = mVar2;
                label6 = label9;
                statementWithBringIntoView3 = statementWithBringIntoView4;
                label5 = label7;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                list4 = list3;
                mVar3 = mVar2;
                label5 = label3;
                label6 = label4;
                statementWithBringIntoView3 = statementWithBringIntoView2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ka3.w
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return z.k(mVar3, label5, label6, kVar, list, statementWithBringIntoView3, list4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        statementWithBringIntoView2 = statementWithBringIntoView;
        i27 = i16 & 64;
        if (i27 != 0) {
            i17 |= 1572864;
            list3 = list2;
        } else {
            list3 = list2;
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(list3)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
        }
        if ((i17 & 599187) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i38 != 0) {
                mVar2 = f3.m.INSTANCE;
            }
            if (i39 != 0) {
                label7 = null;
            } else {
                label7 = label3;
            }
            if (i18 != 0) {
                label8 = null;
            } else {
                label8 = label4;
            }
            if (i25 != 0) {
                statementWithBringIntoView4 = null;
            } else {
                statementWithBringIntoView4 = statementWithBringIntoView2;
            }
            if (i27 != 0) {
                list3 = null;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1210444734, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Content (TripOverviewScreen.kt:112)");
            }
            f3.m mVarC8 = w0.q0.c(t70.s.n(t70.i.S(mVar2, null, rVarH, i17 & 14, 1), rVarH, 0), true, null, 2, null);
            p036e4.w0 w0VarA8 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT8 = rVarH.t();
            f3.m mVarE8 = f3.j.e(rVarH, mVarC8);
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
            n6.i(rVarC8, w0VarA8, companion8.d());
            n6.i(rVarC8, e0VarT8, companion8.f());
            n6.i(rVarC8, Integer.valueOf(iHashCode8), companion8.c());
            n6.g(rVarC8, companion8.a());
            n6.i(rVarC8, mVarE8, companion8.e());
            d1.i0 i0Var8 = d1.i0.f39176a;
            if (label7 == null) {
                rVarH.X(1008958142);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(1008958143);
                k70.a aVar15 = k70.a.f108864a;
                int i419 = k70.a.f108865b;
                j70.h.g(null, null, label7, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar15.f(rVarH, i419).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                rVar2 = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar15.b(rVar2, i419).getSpacing100()), rVar2, 0);
                rVar2.R();
            }
            if (label8 == null) {
                rVar2.X(1009179451);
                rVar2.R();
                label9 = label8;
            } else {
                rVar2.X(1009179452);
                k70.a aVar16 = k70.a.f108864a;
                int i4110 = k70.a.f108865b;
                p076m2.r rVar10 = rVar2;
                label9 = label8;
                j70.h.g(null, null, label9, null, null, aVar16.a(rVar2, i4110).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar16.f(rVar2, i4110).d(), null, null, false, false, null, rVar10, 0, 0, 0, 33030107);
                rVar2 = rVar10;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar16.b(rVar2, i4110).getSpacing200()), rVar2, 0);
                rVar2.R();
            }
            n50.h0.v(kVar, null, rVar2, (i17 >> 9) & 14, 2);
            i29 = 0;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
            rVar2.X(-1907095607);
            size = list.size();
            i35 = 0;
            while (i35 < size) {
                l(list.get(i35), rVar2, i29);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i29);
                i35++;
                i29 = 0;
            }
            rVar2.R();
            if (statementWithBringIntoView4 == null) {
                rVar2.X(1009756857);
            } else {
                rVar2.X(1009756858);
                n(statementWithBringIntoView4.getStatement(), statementWithBringIntoView4.getBringIntoViewRequester(), rVar2, 0);
            }
            rVar2.R();
            if (list3 == null) {
                rVar2.X(1009986319);
            } else {
                rVar2.X(1009986320);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                rVar2.X(-1907078577);
                it = list3.iterator();
                while (it.hasNext()) {
                    n50.h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                }
                rVar2.R();
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            list4 = list3;
            mVar3 = mVar2;
            label6 = label9;
            statementWithBringIntoView3 = statementWithBringIntoView4;
            label5 = label7;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            list4 = list3;
            mVar3 = mVar2;
            label5 = label3;
            label6 = label4;
            statementWithBringIntoView3 = statementWithBringIntoView2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ka3.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.k(mVar3, label5, label6, kVar, list, statementWithBringIntoView3, list4, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(f3.m mVar, Label label, Label label2, n50.k kVar, List list, StatementWithBringIntoView statementWithBringIntoView, List list2, int i15, int i16, p076m2.r rVar, int i17) {
        j(mVar, label, label2, kVar, list, statementWithBringIntoView, list2, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void l(final p.a.Section section, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-115503766);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(section) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-115503766, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Section (TripOverviewScreen.kt:159)");
            }
            Label title = section.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            m30.i.d(section.getData(), null, null, rVar2, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ka3.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.m(section, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(p.a.Section section, int i15, p076m2.r rVar, int i16) {
        l(section, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final p.a.InitializedSummary.Statement statement, final j1.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(464263701);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(statement) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(464263701, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.Statement (TripOverviewScreen.kt:172)");
            }
            Label title = statement.getTitle();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).p(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            f3.m mVarB = j1.e.b(companion, aVar);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            v30.d.f(statement.getData(), rVarH, CheckBoxSingleData.f210090f);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ka3.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.o(statement, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(p.a.InitializedSummary.Statement statement, j1.a aVar, int i15, p076m2.r rVar, int i16) {
        n(statement, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final p.a.InitializedDetails initializedDetails, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-745880270);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(initializedDetails) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-745880270, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.TripDetailsContent (TripOverviewScreen.kt:87)");
            }
            cb4.i dialogVMSAdapter = initializedDetails.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(1641769351);
            } else {
                rVarH.X(468602298);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            i50.s.r(initializedDetails.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1352731611, true, new er.q() { // from class: ka3.u
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.q(initializedDetails, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, initializedDetails.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ka3.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.r(initializedDetails, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(p.a.InitializedDetails initializedDetails, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1352731611, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.TripDetailsContent.<anonymous> (TripOverviewScreen.kt:92)");
            }
            j(a3.l(f3.m.INSTANCE, d3Var), null, null, initializedDetails.getMainCard(), initializedDetails.f(), null, initializedDetails.a(), rVar, 0, 38);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(p.a.InitializedDetails initializedDetails, int i15, p076m2.r rVar, int i16) {
        p(initializedDetails, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(337834058);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(337834058, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.TripOverviewScreen (TripOverviewScreen.kt:42)");
            }
            p.a aVarT = t(m7.b.c(pVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarT instanceof p.a.Error) {
                rVarH.X(-1758977902);
                ((p.a.Error) aVarT).getVmsAdapter().b(rVarH, 0);
                rVarH.R();
            } else if (aVarT instanceof p.a.InitializedSummary) {
                rVarH.X(-1758975767);
                v((p.a.InitializedSummary) aVarT, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarT instanceof p.a.InitializedDetails)) {
                    rVarH.X(-1758980386);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1758972919);
                p((p.a.InitializedDetails) aVarT, rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ka3.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.u(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.a t(f6<? extends p.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(p pVar, int i15, p076m2.r rVar, int i16) {
        s(pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(final p.a.InitializedSummary initializedSummary, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-352681366);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(initializedSummary) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-352681366, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.TripSummaryContent (TripOverviewScreen.kt:54)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            final j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(initializedSummary.getStatement().getScrollTo());
            boolean zG = ((i16 & 14) == 4) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(initializedSummary, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            rVar2 = rVarH;
            i50.s.r(initializedSummary.getScaffoldData(), y2.m.d(-2050536363, true, new er.p() { // from class: ka3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.w(initializedSummary, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-959532707, true, new er.q() { // from class: ka3.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.x(initializedSummary, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ka3.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.y(initializedSummary, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(p.a.InitializedSummary initializedSummary, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2050536363, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.TripSummaryContent.<anonymous> (TripOverviewScreen.kt:66)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(initializedSummary.getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(p.a.InitializedSummary initializedSummary, j1.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-959532707, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.TripSummaryContent.<anonymous> (TripOverviewScreen.kt:71)");
            }
            j(a3.l(f3.m.INSTANCE, d3Var), initializedSummary.getTitle(), initializedSummary.getDescription(), initializedSummary.getMainCard(), initializedSummary.e(), new StatementWithBringIntoView(initializedSummary.getStatement(), aVar), null, rVar, 0, 64);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(p.a.InitializedSummary initializedSummary, int i15, p076m2.r rVar, int i16) {
        v(initializedSummary, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
