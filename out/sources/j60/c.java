package j60;

import androidx.compose.foundation.layout.d;
import b5.TextIndent;
import c5.w;
import er.p;
import f3.m;
import j70.h;
import java.util.List;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import q4.ParagraphStyle;
import q4.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lmx/a;", "items", "Lj60/a;", "itemsStyle", "Lf3/m;", "modifier", "Loq/i0;", "b", "(Ljava/util/List;Lj60/a;Lf3/m;Lm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void b(final List<Label> list, BulletItemStyle bulletItemStyle, m mVar, r rVar, final int i15, final int i16) {
        BulletItemStyle bulletItemStyle2;
        m mVar2;
        int i17;
        int i18;
        boolean z15;
        r rVar2;
        final BulletItemStyle bulletItemStyle3;
        final m mVar3;
        d5 d5VarM;
        BulletItemStyle bulletItemStyle4;
        m mVar4;
        BulletItemStyle bulletItemStyle5;
        e.b bVar;
        int iN;
        r rVarH = rVar.h(-389381114);
        int i19 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                bulletItemStyle2 = bulletItemStyle;
                int i25 = rVarH.W(bulletItemStyle2) ? 32 : 16;
                i19 |= i25;
            } else {
                bulletItemStyle2 = bulletItemStyle;
            }
            i19 |= i25;
        } else {
            bulletItemStyle2 = bulletItemStyle;
        }
        int i26 = i16 & 4;
        if (i26 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i19 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i17 = 0;
            i18 = 1;
            if ((i19 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i19 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if ((i16 & 2) != 0) {
                        bulletItemStyle4 = new BulletItemStyle(null, 0L, 3, null);
                        i19 &= -113;
                    } else {
                        bulletItemStyle4 = bulletItemStyle2;
                    }
                    if (i26 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    bulletItemStyle5 = bulletItemStyle4;
                } else {
                    rVarH.O();
                    if ((i16 & 2) != 0) {
                        i19 &= -113;
                    }
                    i19 = i19;
                    bulletItemStyle5 = bulletItemStyle2;
                    mVar4 = mVar2;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-389381114, i19, -1, "pl.gov.coi.common.ui.item.BulletList (BulletList.kt:21)");
                }
                for (Label label : list) {
                    m mVarH = d.h(mVar4, 0.0f, i18, null);
                    bVar = new e.b(i17, i18, null);
                    iN = bVar.n(new ParagraphStyle(0, 0, 0L, new TextIndent(0L, w.g(14), 1, null), null, null, 0, 0, null, 503, null));
                    try {
                        bVar.f("•\t\t");
                        bVar.f(label.getText());
                        i0 i0Var = i0.f148189a;
                        bVar.l(iN);
                        r rVar3 = rVarH;
                        h.g(mVarH, null, null, null, bVar.p(), bulletItemStyle5.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bulletItemStyle5.getTextStyle(), null, null, false, false, null, rVar3, 0, 0, 0, 33030094);
                        i17 = i17;
                        rVarH = rVar3;
                        i18 = i18;
                        mVar4 = mVar4;
                    } catch (Throwable th4) {
                        bVar.l(iN);
                        throw th4;
                    }
                }
                rVar2 = rVarH;
                m mVar5 = mVar4;
                if (t.k()) {
                    t.n();
                }
                bulletItemStyle3 = bulletItemStyle5;
                mVar3 = mVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                bulletItemStyle3 = bulletItemStyle2;
                mVar3 = mVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: j60.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return c.c(list, bulletItemStyle3, mVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i17 = 0;
        i18 = 1;
        if ((i19 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i19 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if ((i16 & 2) != 0) {
                    bulletItemStyle4 = new BulletItemStyle(null, 0L, 3, null);
                    i19 &= -113;
                } else {
                    bulletItemStyle4 = bulletItemStyle2;
                }
                if (i26 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                bulletItemStyle5 = bulletItemStyle4;
            } else {
                if ((i16 & 2) != 0) {
                    bulletItemStyle4 = new BulletItemStyle(null, 0L, 3, null);
                    i19 &= -113;
                } else {
                    bulletItemStyle4 = bulletItemStyle2;
                }
                if (i26 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                bulletItemStyle5 = bulletItemStyle4;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-389381114, i19, -1, "pl.gov.coi.common.ui.item.BulletList (BulletList.kt:21)");
            }
            while (r0.hasNext()) {
                m mVarH2 = d.h(mVar4, 0.0f, i18, null);
                bVar = new e.b(i17, i18, null);
                iN = bVar.n(new ParagraphStyle(0, 0, 0L, new TextIndent(0L, w.g(14), 1, null), null, null, 0, 0, null, 503, null));
                bVar.f("•\t\t");
                bVar.f(label.getText());
                i0 i0Var2 = i0.f148189a;
                bVar.l(iN);
                r rVar4 = rVarH;
                h.g(mVarH2, null, null, null, bVar.p(), bulletItemStyle5.getTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bulletItemStyle5.getTextStyle(), null, null, false, false, null, rVar4, 0, 0, 0, 33030094);
                i17 = i17;
                rVarH = rVar4;
                i18 = i18;
                mVar4 = mVar4;
            }
            rVar2 = rVarH;
            m mVar6 = mVar4;
            if (t.k()) {
                t.n();
            }
            bulletItemStyle3 = bulletItemStyle5;
            mVar3 = mVar6;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            bulletItemStyle3 = bulletItemStyle2;
            mVar3 = mVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: j60.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.c(list, bulletItemStyle3, mVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(List list, BulletItemStyle bulletItemStyle, m mVar, int i15, int i16, r rVar, int i17) {
        b(list, bulletItemStyle, mVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
