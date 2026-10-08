package zc3;

import mx.Label;
import n50.SingleCardLabel;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.t;
import q4.TextStyle;

/* JADX INFO: renamed from: zc3.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lzc3/b;", "Ln50/e;", "Ln50/i0;", "info", "", "testTag", "<init>", "(Ln50/i0;Ljava/lang/String;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln50/i0;", "getInfo", "()Ln50/i0;", "b", "Ljava/lang/String;", "getTestTag", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomPassportSingleCardContent implements n50.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f234259c = SingleCardLabel.f132064g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SingleCardLabel info;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    public CustomPassportSingleCardContent(SingleCardLabel singleCardLabel, String str) {
        this.info = singleCardLabel;
        this.testTag = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(CustomPassportSingleCardContent customPassportSingleCardContent, int i15, p076m2.r rVar, int i16) {
        customPassportSingleCardContent.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1148567326);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(this) : rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1148567326, i16, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.screens.passportdetails.CustomPassportSingleCardContent.Content (CustomPassportSingleCardContent.kt:13)");
            }
            String str = this.testTag;
            Label label = this.info.getLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleD = aVar.f(rVarH, i17).d();
            rVar2 = rVarH;
            j70.h.g(null, str, label, this.info.getLabel(), null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, this.info.getTextOverflow(), false, this.info.getMaxLines(), 0, null, textStyleD, null, null, false, false, null, rVar2, 0, 0, MLKEMEngine.KyberPolyBytes, 28753873);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zc3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return CustomPassportSingleCardContent.d(this.f234257a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ er.q<n50.e.CustomContainerModifierData, p076m2.r, Integer, f3.m> b() {
        return super.b();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomPassportSingleCardContent)) {
            return false;
        }
        CustomPassportSingleCardContent customPassportSingleCardContent = (CustomPassportSingleCardContent) other;
        return fr.t.c(this.info, customPassportSingleCardContent.info) && fr.t.c(this.testTag, customPassportSingleCardContent.testTag);
    }

    public int hashCode() {
        int iHashCode = this.info.hashCode() * 31;
        String str = this.testTag;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CustomPassportSingleCardContent(info=" + this.info + ", testTag=" + this.testTag + ')';
    }
}
