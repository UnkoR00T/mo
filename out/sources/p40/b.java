package p40;

import b5.j;
import er.p;
import j70.h;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "testTag", "Lmx/a;", "helperLabel", "", "ignoreForAccessibility", "Loq/i0;", "b", "(Ljava/lang/String;Lmx/a;ZLm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, final Label label, boolean z15, r rVar, final int i15, final int i16) {
        String str2;
        int i17;
        boolean z16;
        boolean z17;
        r rVar2;
        final String str3;
        final boolean z18;
        d5 d5VarM;
        int i18;
        String str4;
        boolean z19;
        r rVarH = rVar.h(-971860285);
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
            if ((i17 & 147) != 146) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i19 != 0) {
                    str4 = null;
                    i18 = i25;
                } else {
                    i18 = i25;
                    str4 = str2;
                }
                if (i18 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(-971860285, i17, -1, "pl.gov.coi.common.ui.ds.helpertext.HelperText (HelperText.kt:13)");
                }
                int iF = j.INSTANCE.f();
                k70.a aVar = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                TextStyle textStyleF = aVar.f(rVarH, i26).f();
                long jB = aVar.a(rVarH, i26).getNeutral().b();
                j jVarH = j.h(iF);
                int i27 = i17 << 3;
                rVar2 = rVarH;
                h.g(null, str4, label, null, null, jB, 0L, null, null, null, 0L, null, jVarH, 0L, 0, false, 0, 0, null, textStyleF, null, null, false, z19, null, rVar2, i27 & 1008, 0, i27 & 7168, 24637401);
                if (t.k()) {
                    t.n();
                }
                str3 = str4;
                z18 = z19;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                str3 = str2;
                z18 = z16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: p40.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b.c(str3, label, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i17 & 147) != 146) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i19 != 0) {
                str4 = null;
                i18 = i25;
            } else {
                i18 = i25;
                str4 = str2;
            }
            if (i18 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (t.k()) {
                t.o(-971860285, i17, -1, "pl.gov.coi.common.ui.ds.helpertext.HelperText (HelperText.kt:13)");
            }
            int iF2 = j.INSTANCE.f();
            k70.a aVar2 = k70.a.f108864a;
            int i28 = k70.a.f108865b;
            TextStyle textStyleF2 = aVar2.f(rVarH, i28).f();
            long jB2 = aVar2.a(rVarH, i28).getNeutral().b();
            j jVarH2 = j.h(iF2);
            int i29 = i17 << 3;
            rVar2 = rVarH;
            h.g(null, str4, label, null, null, jB2, 0L, null, null, null, 0L, null, jVarH2, 0L, 0, false, 0, 0, null, textStyleF2, null, null, false, z19, null, rVar2, i29 & 1008, 0, i29 & 7168, 24637401);
            if (t.k()) {
                t.n();
            }
            str3 = str4;
            z18 = z19;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            str3 = str2;
            z18 = z16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: p40.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(str3, label, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(String str, Label label, boolean z15, int i15, int i16, r rVar, int i17) {
        b(str, label, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
