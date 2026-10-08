package n50;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import h30.ButtonData;
import java.io.IOException;
import mx.Label;
import n3.b2;
import n3.n1;
import n3.y2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p046f2.c2;
import p046f2.lh;
import p046f2.oh;
import p046f2.x1;
import p046f2.y1;
import p046f2.z1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;
import w0.i1;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aK\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u0007*\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001e\u001a\u00020\u0007*\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010 \u001a\u00020\u0007*\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b \u0010\u001f\u001a\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$\u001a1\u0010+\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b+\u0010,\u001a)\u00100\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010%2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b0\u00101\u001a)\u00105\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010%2\u0006\u00104\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b5\u00106\u001a1\u0010:\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u00010%2\u0006\u00109\u001a\u0002082\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00104\u001a\u000203H\u0003¢\u0006\u0004\b:\u0010;\u001a)\u0010?\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010%2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b?\u0010@\u001a1\u0010C\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u00010%2\u0006\u0010B\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\bC\u0010D\u001a1\u0010F\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u00010%2\u0006\u0010E\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\bF\u0010D\u001a\u001f\u0010I\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\bI\u0010J\u001a\u0017\u0010K\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\bK\u0010L\"\u001a\u0010Q\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0017\u0010T\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010P¨\u0006U"}, d2 = {"Ln50/k;", "singleCardData", "Ln50/j;", "singleCardConfig", "Loq/i0;", "v", "(Ln50/k;Ln50/j;Lm2/r;II)V", "Lf3/m;", "modifier", "data", "Lb1/l;", "interactionSource", "", "index", "Lc5/h;", "decreaseVerticalPaddingByValue", "Lmx/a;", "additionalContext", "M", "(Lf3/m;Ln50/k;Lb1/l;Ljava/lang/Integer;FLmx/a;Lm2/r;II)V", "Ln50/x0$d;", "", "isEnabled", "i0", "(Ln50/x0$d;Lb1/l;ZLm2/r;I)Lf3/m;", "Lcx/a;", "eventThrottler", "e0", "(Ln50/k;Lb1/l;Lcx/a;Lm2/r;I)Lf3/m;", "Ln50/g;", "c0", "(Ln50/g;Lb1/l;Lcx/a;Lm2/r;I)Lf3/m;", "g0", "Ln50/w0;", "topSection", ip.a.f96137b, "(Ln50/w0;Lm2/r;I)V", "", "controlSectionTestTag", "Ln50/d;", "controlSectionData", "Ln50/j0;", "singleCardState", "E", "(Ljava/lang/String;Ln50/d;ZLn50/j0;Lm2/r;I)V", "leadingMediaSectionTestTag", "Ln50/i;", "mediaSectionData", "G", "(Ljava/lang/String;Ln50/i;ZLm2/r;I)V", "bodySectionTestTag", "Ln50/a;", "bodySection", "y", "(Ljava/lang/String;Ln50/a;ZLm2/r;I)V", "trailingSectionTestTag", "Ln50/x0;", "trailingSection", "U", "(Ljava/lang/String;Ln50/x0;ZLn50/a;Lm2/r;I)V", "bottomSectionTestTag", "Ln50/c;", "bottomSection", "A", "(Ljava/lang/String;Ln50/c;ZLm2/r;I)V", "testTag", "isSelected", "K", "(Ljava/lang/String;ZZLn50/j0;Lm2/r;I)V", "isChecked", "C", "Landroidx/compose/ui/graphics/Color;", "defaultColor", "b0", "(JZLm2/r;I)J", "W", "(Ln50/j0;Lm2/r;I)V", "a", "F", "a0", "()F", "SINGLE_CARD_MINIMUM_HEIGHT", "b", "Z", "SINGLE_CARD_BODY_MINIMUM_HEIGHT", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f132027a = c5.h.n(80);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f132028b = c5.h.n(48);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f132029a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-275918246);
            if (p076m2.t.k()) {
                p076m2.t.o(-275918246, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardCheckbox.<anonymous>.<anonymous>.<anonymous> (SingleCard.kt:811)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().c();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jC;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f132030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f132031b;

        b(i iVar, boolean z15) {
            this.f132030a = iVar;
            this.f132031b = z15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1599897171);
            if (p076m2.t.k()) {
                p076m2.t.o(-1599897171, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardLeadingMediaSection.<anonymous> (SingleCard.kt:445)");
            }
            long jB0 = h0.b0(((i.RoundedSquareIcon) this.f132030a).d().B(rVar, 0).m20unboximpl(), this.f132031b, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB0;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f132032a;

        c(i iVar) {
            this.f132032a = iVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1046008732);
            if (p076m2.t.k()) {
                p076m2.t.o(-1046008732, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardLeadingMediaSection.<anonymous> (SingleCard.kt:466)");
            }
            long jM20unboximpl = ((i.Icon) this.f132032a).b().B(rVar, 0).m20unboximpl();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jM20unboximpl;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f132033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f132034b;

        d(x0 x0Var, boolean z15) {
            this.f132033a = x0Var;
            this.f132034b = z15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-961344385);
            if (p076m2.t.k()) {
                p076m2.t.o(-961344385, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardTrailingSection.<anonymous> (SingleCard.kt:678)");
            }
            long jB0 = h0.b0(((x0.Icon) this.f132033a).d().B(rVar, 0).m20unboximpl(), this.f132034b, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB0;
        }
    }

    private static final void A(final String str, final BottomSection bottomSection, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        String str2;
        int i17;
        z15 = z15;
        p076m2.r rVarH = rVar.h(-1346363634);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(bottomSection) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1346363634, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardBottomSection (SingleCard.kt:708)");
            }
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarB = m3.b(d1.i.f39152a.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            SingleCardLabel label = bottomSection.getLabel();
            String str3 = null;
            Label label2 = label != null ? label.getLabel() : null;
            if (label2 == null) {
                rVarH.X(2026780252);
                rVarH.R();
                i17 = i16;
            } else {
                rVarH.X(2026780253);
                if (str != null) {
                    str2 = str + "LabelText";
                } else {
                    str2 = null;
                }
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                long jB0 = b0(aVar.a(rVarH, i18).getNeutral().i(), z15, rVarH, (i16 >> 3) & 112);
                TextStyle textStyleD = aVar.f(rVarH, i18).d();
                Label contentDescription = bottomSection.getLabel().getContentDescription();
                if (contentDescription == null) {
                    contentDescription = label2;
                }
                i17 = i16;
                j70.h.g(null, str2, label2, contentDescription, null, jB0, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, null, null, false, false, null, rVarH, 0, 0, MLKEMEngine.KyberPolyBytes, 28835793);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i18).getSpacing50()), rVarH, 0);
                rVarH.R();
            }
            SingleCardLabel value = bottomSection.getValue();
            Label label3 = value != null ? value.getLabel() : null;
            if (label3 == null) {
                rVarH.X(2027337229);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(2027337230);
                if (str != null) {
                    str3 = str + "ValueText";
                }
                String str4 = str3;
                k70.a aVar2 = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                long jB1 = b0(aVar2.a(rVarH, i19).getNeutral().i(), z15, rVarH, (i17 >> 3) & 112);
                TextStyle textStyleA = aVar2.f(rVarH, i19).a();
                Label contentDescription2 = bottomSection.getValue().getContentDescription();
                rVar2 = rVarH;
                j70.h.g(null, str4, label3, contentDescription2 == null ? label3 : contentDescription2, null, jB1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, null, null, false, false, null, rVar2, 0, 0, MLKEMEngine.KyberPolyBytes, 28835793);
                rVar2.R();
            }
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.e0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.B(str, bottomSection, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(String str, BottomSection bottomSection, boolean z15, int i15, p076m2.r rVar, int i16) {
        A(str, bottomSection, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void C(final String str, final boolean z15, final boolean z16, final j0 j0Var, p076m2.r rVar, final int i15) {
        int i16;
        long jC;
        long jA;
        String str2;
        p076m2.r rVarH = rVar.h(441991272);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z16) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(j0Var) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(441991272, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardCheckbox (SingleCard.kt:777)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarT = androidx.compose.foundation.layout.d.t(companion, d40.i.f.f39709e.getDimension());
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarI = d1.r.i(companion2.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarT);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            if (!z15) {
                rVarH.X(1947542573);
                rVarH.R();
                jC = Color.INSTANCE.g();
            } else if (!z16) {
                rVarH.X(1947544715);
                jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().g();
                rVarH.R();
            } else if (j0Var instanceof j0.Error) {
                rVarH.X(1947547598);
                jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else {
                rVarH.X(1947549321);
                jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getPrimary();
                rVarH.R();
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarC = w0.i.c(companion, jC, l1.h.f(aVar.b(rVarH, i17).getSpacing50()));
            float spacing25 = aVar.b(rVarH, i17).getSpacing25();
            if (!z16) {
                rVarH.X(1947557419);
                jA = aVar.a(rVarH, i17).getNeutral().g();
                rVarH.R();
            } else if (j0Var instanceof j0.Error) {
                rVarH.X(1947560302);
                jA = aVar.a(rVarH, i17).getSupport().g();
                rVarH.R();
            } else {
                rVarH.X(1947561428);
                if (z15) {
                    rVarH.X(1947562505);
                    jA = aVar.a(rVarH, i17).getBase().getPrimary();
                } else {
                    rVarH.X(1947563691);
                    jA = aVar.a(rVarH, i17).getNeutral().a();
                }
                rVarH.R();
                rVarH.R();
            }
            f3.m mVarT2 = androidx.compose.foundation.layout.d.t(w0.o.h(mVarC, spacing25, jA, l1.h.f(aVar.b(rVarH, i17).getSpacing50())), d40.i.e.f39708e.getDimension());
            p036e4.w0 w0VarI2 = d1.r.i(companion2.e(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarT2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            if (z15) {
                rVarH.X(-689004128);
                if (str != null) {
                    str2 = str + "Icon";
                } else {
                    str2 = null;
                }
                d40.h.f(null, new d40.b.C0864b(str2, jz.a.U1, d40.i.d.f39707e, a.f132029a, Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 5);
            } else {
                rVarH.X(-717342778);
            }
            rVarH.R();
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.D(str, z15, z16, j0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(String str, boolean z15, boolean z16, j0 j0Var, int i15, p076m2.r rVar, int i16) {
        C(str, z15, z16, j0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void E(String str, final n50.d dVar, boolean z15, j0 j0Var, p076m2.r rVar, final int i15) {
        int i16;
        final j0 j0Var2;
        final boolean z16;
        p076m2.r rVarH = rVar.h(978192785);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(j0Var) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(978192785, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardLeadingControlSection (SingleCard.kt:401)");
            }
            if (dVar instanceof n50.d.CheckBox) {
                rVarH.X(-554563737);
                C(str, ((n50.d.CheckBox) dVar).getIsChecked(), z15, j0Var, rVarH, i16 & 8078);
                rVarH.R();
                z16 = z15;
                j0Var2 = j0Var;
            } else if (dVar instanceof n50.d.RadioButton) {
                rVarH.X(-554556734);
                K(str, ((n50.d.RadioButton) dVar).getIsSelected(), z15, j0Var, rVarH, i16 & 8078);
                str = str;
                z16 = z15;
                j0Var2 = j0Var;
                rVarH.R();
            } else {
                z16 = z15;
                j0Var2 = j0Var;
                if (!(dVar instanceof n50.d.IconButton)) {
                    str = str;
                    rVarH.X(-554565427);
                    rVarH.R();
                    throw new oq.p();
                }
                str = str;
                rVarH.X(-554550053);
                i30.g.f(((n50.d.IconButton) dVar).getData(), false, false, rVarH, 0, 6);
                rVarH = rVarH;
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            j0Var2 = j0Var;
            z16 = z15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final String str2 = str;
            d5VarM.a(new er.p() { // from class: n50.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.F(str2, dVar, z16, j0Var2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(String str, n50.d dVar, boolean z15, j0 j0Var, int i15, p076m2.r rVar, int i16) {
        E(str, dVar, z15, j0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.ui.graphics.painter.a] */
    private static final void G(final String str, final i iVar, final boolean z15, p076m2.r rVar, final int i15) throws XmlPullParserException, IOException {
        int i16;
        f3.m mVarL;
        f3.m mVarL2;
        Color colorM0boximpl;
        n1 n1Var;
        f3.m mVarL3;
        f3.m mVarL4;
        Float fValueOf = Float.valueOf(1.0f);
        p076m2.r rVarH = rVar.h(-850411604);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(iVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-850411604, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardLeadingMediaSection (SingleCard.kt:425)");
            }
            if (iVar instanceof i.RoundedSquareIcon) {
                rVarH.X(-1201757686);
                f3.m.Companion companion = f3.m.INSTANCE;
                i.RoundedSquareIcon roundedSquareIcon = (i.RoundedSquareIcon) iVar;
                if (roundedSquareIcon.g() != null) {
                    rVarH.X(1400287739);
                    Object objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = b1.k.a();
                        rVarH.v(objE);
                    }
                    mVarL4 = androidx.compose.foundation.b.l(companion, (b1.l) objE, null, false, null, n4.l.j(n4.l.INSTANCE.a()), roundedSquareIcon.g(), 12, null);
                    rVarH.R();
                } else {
                    rVarH.X(1400535956);
                    rVarH.R();
                    mVarL4 = companion;
                }
                d40.h.f(companion.u(mVarL4), new d40.b.a(null, roundedSquareIcon.getIconResId(), roundedSquareIcon.getIconSize(), new b(iVar, z15), roundedSquareIcon.getBackgroundSize(), roundedSquareIcon.a(), new d40.a.b(new er.p() { // from class: n50.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h0.H((p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }), roundedSquareIcon.getContentDescription(), null, 257, null), false, rVarH, 0, 4);
                rVarH.R();
            } else {
                Object objC = null;
                if (iVar instanceof i.Icon) {
                    rVarH.X(-1201724583);
                    if (str != null) {
                        objC = str + "Icon";
                    }
                    i.Icon icon = (i.Icon) iVar;
                    d40.h.f(null, new d40.b.C0864b(objC, icon.getIconResId(), icon.getIconSize(), new c(iVar), icon.getContentDescription(), icon.getIconState()), false, rVarH, 0, 5);
                    rVarH.R();
                } else {
                    if (iVar instanceof i.Image) {
                        rVarH.X(1401686583);
                        p036e4.l lVarA = p036e4.l.INSTANCE.a();
                        f3.m mVarD = f3.m.INSTANCE;
                        i.Image image = (i.Image) iVar;
                        if (image.c() != null) {
                            rVarH.X(1401800539);
                            Object objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = b1.k.a();
                                rVarH.v(objE2);
                            }
                            mVarL3 = androidx.compose.foundation.b.l(mVarD, (b1.l) objE2, null, false, null, n4.l.j(n4.l.INSTANCE.a()), image.c(), 12, null);
                            rVarH.R();
                        } else {
                            rVarH.X(1402048756);
                            rVarH.R();
                            mVarL3 = mVarD;
                        }
                        f3.m mVarU = mVarD.u(mVarL3);
                        if (image.getContentDescription() == null) {
                            rVarH.X(1402169873);
                            Object objE3 = rVarH.E();
                            if (objE3 == p076m2.r.INSTANCE.a()) {
                                objE3 = new er.l() { // from class: n50.o
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return h0.J((n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            mVarD = n4.v.d(mVarD, false, (er.l) objE3, 1, null);
                            rVarH.R();
                        } else {
                            rVarH.X(1402273940);
                            rVarH.R();
                        }
                        f3.m mVarA = k3.f.a(androidx.compose.foundation.layout.d.t(mVarU.u(mVarD), d40.i.C0865i.f39712e.getDimension()), k70.a.f108864a.e(rVarH, k70.a.f108865b).getRadius150());
                        b2 b2VarC = n3.l0.c(image.getBitmap());
                        Label contentDescription = image.getContentDescription();
                        String text = contentDescription != null ? contentDescription.getText() : null;
                        if (!z15) {
                            fValueOf = null;
                        }
                        i1.g(b2VarC, text, mVarA, null, lVarA, fValueOf != null ? fValueOf.floatValue() : 0.3f, null, 0, rVarH, 24576, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
                        rVarH.R();
                    } else {
                        if (!(iVar instanceof i.Resource)) {
                            rVarH.X(-1201756227);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1402676599);
                        i.Resource resource = (i.Resource) iVar;
                        i.Resource.a content = resource.getContent();
                        if (content instanceof i.Resource.a.DrawableResource) {
                            rVarH.X(1402724835);
                            p036e4.l lVarA2 = p036e4.l.INSTANCE.a();
                            f3.m.Companion companion2 = f3.m.INSTANCE;
                            if (resource.c() != null) {
                                rVarH.X(1402842139);
                                Object objE4 = rVarH.E();
                                if (objE4 == p076m2.r.INSTANCE.a()) {
                                    objE4 = b1.k.a();
                                    rVarH.v(objE4);
                                }
                                mVarL2 = androidx.compose.foundation.b.l(companion2, (b1.l) objE4, null, false, null, n4.l.j(n4.l.INSTANCE.a()), resource.c(), 12, null);
                                rVarH.R();
                            } else {
                                rVarH.X(1403090356);
                                rVarH.R();
                                mVarL2 = companion2;
                            }
                            f3.m mVarU2 = companion2.u(mVarL2);
                            er.p<p076m2.r, Integer, Color> pVarB = ((i.Resource.a.DrawableResource) resource.getContent()).b();
                            if (pVarB == null) {
                                rVarH.X(1403194701);
                                rVarH.R();
                                colorM0boximpl = null;
                            } else {
                                rVarH.X(-1201661644);
                                long jM20unboximpl = pVarB.B(rVarH, 0).m20unboximpl();
                                rVarH.R();
                                colorM0boximpl = Color.m0boximpl(jM20unboximpl);
                            }
                            if (colorM0boximpl == null) {
                                rVarH.X(1403207504);
                                rVarH.R();
                                n1Var = null;
                            } else {
                                rVarH.X(1403207505);
                                long jM20unboximpl2 = colorM0boximpl.m20unboximpl();
                                boolean zD = rVarH.d(jM20unboximpl2);
                                Object objE5 = rVarH.E();
                                if (zD || objE5 == p076m2.r.INSTANCE.a()) {
                                    objE5 = n1.Companion.b(n1.INSTANCE, jM20unboximpl2, 0, 2, null);
                                    rVarH.v(objE5);
                                }
                                rVarH.R();
                                n1Var = (n1) objE5;
                            }
                            t3.d dVarB = l4.g.b(t3.d.INSTANCE, ((i.Resource.a.DrawableResource) resource.getContent()).getResId(), rVarH, 6);
                            Label contentDescription2 = resource.getContentDescription();
                            String text2 = contentDescription2 != null ? contentDescription2.getText() : null;
                            if (!z15) {
                                fValueOf = null;
                            }
                            i1.d(dVarB, text2, mVarU2, null, lVarA2, fValueOf != null ? fValueOf.floatValue() : 0.3f, n1Var, rVarH, 24576, 8);
                            rVarH = rVarH;
                            rVarH.R();
                        } else if (content instanceof i.Resource.a.BitmapResource) {
                            rVarH.X(1403594292);
                            p036e4.l lVarA3 = p036e4.l.INSTANCE.a();
                            f3.m mVarT = f3.m.INSTANCE;
                            if (resource.c() != null) {
                                rVarH.X(1403711131);
                                Object objE6 = rVarH.E();
                                if (objE6 == p076m2.r.INSTANCE.a()) {
                                    objE6 = b1.k.a();
                                    rVarH.v(objE6);
                                }
                                mVarL = androidx.compose.foundation.b.l(mVarT, (b1.l) objE6, null, false, null, n4.l.j(n4.l.INSTANCE.a()), resource.c(), 12, null);
                                rVarH.R();
                            } else {
                                rVarH.X(1403959348);
                                rVarH.R();
                                mVarL = mVarT;
                            }
                            f3.m mVarU3 = mVarT.u(mVarL);
                            if (((i.Resource.a.BitmapResource) resource.getContent()).getIconSize() != null) {
                                mVarT = androidx.compose.foundation.layout.d.t(mVarT, ((i.Resource.a.BitmapResource) resource.getContent()).getIconSize().getDimension());
                            }
                            f3.m mVarU4 = mVarU3.u(mVarT);
                            b2 b2VarC2 = n3.l0.c(((i.Resource.a.BitmapResource) resource.getContent()).getBitmap());
                            Label contentDescription3 = resource.getContentDescription();
                            String text3 = contentDescription3 != null ? contentDescription3.getText() : null;
                            if (!z15) {
                                fValueOf = null;
                            }
                            i1.g(b2VarC2, text3, mVarU4, null, lVarA3, fValueOf != null ? fValueOf.floatValue() : 0.3f, null, 0, rVarH, 24576, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
                            rVarH.R();
                        } else {
                            if (!(content instanceof i.Resource.a.Url)) {
                                rVarH.X(-1201678357);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1404451442);
                            f3.m mVarT2 = androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, ((i.Resource.a.Url) resource.getContent()).getIconSize().getDimension());
                            String url = ((i.Resource.a.Url) resource.getContent()).getUrl();
                            Label contentDescription4 = resource.getContentDescription();
                            String text4 = contentDescription4 != null ? contentDescription4.getText() : null;
                            Integer placeHolder = ((i.Resource.a.Url) resource.getContent()).getPlaceHolder();
                            if (placeHolder == null) {
                                rVarH.X(1404702045);
                            } else {
                                rVarH.X(1404702046);
                                objC = l4.c.c(placeHolder.intValue(), rVarH, 0);
                            }
                            rVarH.R();
                            coil3.compose.d.b(url, text4, mVarT2, objC, null, null, null, null, null, null, null, 0.0f, null, 0, false, rVarH, androidx.compose.ui.graphics.painter.a.f9956g << 9, 0, 32752);
                            rVarH = rVarH;
                            rVarH.R();
                        }
                        rVarH.R();
                    }
                }
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.I(str, iVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y2 H(p076m2.r rVar, int i15) {
        rVar.X(1816744992);
        if (p076m2.t.k()) {
            p076m2.t.o(1816744992, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardLeadingMediaSection.<anonymous> (SingleCard.kt:452)");
        }
        y2 radius150 = k70.a.f108864a.e(rVar, k70.a.f108865b).getRadius150();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return radius150;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(String str, i iVar, boolean z15, int i15, p076m2.r rVar, int i16) throws XmlPullParserException, IOException {
        G(str, iVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    private static final void K(final String str, final boolean z15, final boolean z16, final j0 j0Var, p076m2.r rVar, final int i15) {
        int i16;
        boolean z17;
        p076m2.r rVar2;
        long jG;
        long jG2;
        p076m2.r rVarH = rVar.h(-1223040538);
        if ((i15 & 48) == 0) {
            i16 = (rVarH.a(z15) ? 32 : 16) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            z17 = z16;
            i16 |= rVarH.a(z17) ? 256 : 128;
        } else {
            z17 = z16;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(j0Var) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1169) != 1168, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1223040538, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardRadioButton (SingleCard.kt:748)");
            }
            t70.x xVar = new t70.x();
            lh lhVar = lh.f56740a;
            boolean z18 = j0Var instanceof j0.Error;
            if (z18) {
                rVarH.X(-1392683226);
                jG = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else {
                rVarH.X(-1392735058);
                jG = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getPrimary();
                rVarH.R();
            }
            if (z18) {
                rVarH.X(-1392500698);
                jG2 = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else {
                rVarH.X(-1392557335);
                jG2 = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().a();
                rVarH.R();
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            oh.c(z15, null, null, z17, lhVar.b(jG, jG2, aVar.a(rVarH, i17).getNeutral().g(), aVar.a(rVarH, i17).getNeutral().g(), rVar2, lh.f56741b << 12, 0), xVar, rVar2, ((i16 >> 3) & 14) | 48 | ((i16 << 3) & 7168), 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.L(str, z15, z16, j0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(String str, boolean z15, boolean z16, j0 j0Var, int i15, p076m2.r rVar, int i16) {
        K(str, z15, z16, j0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:123:0x0188  */
    /* JADX WARN: Code duplicated, block: B:125:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x019b  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x00bf, please report this as an issue */
    public static final void M(f3.m mVar, final k kVar, b1.l lVar, final Integer num, float f15, Label label, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        b1.l lVar2;
        float zero;
        Label label2;
        boolean z15;
        final f3.m mVar3;
        final b1.l lVar3;
        final float f16;
        final Label label3;
        d5 d5VarM;
        b1.l lVarA;
        final b1.l lVar4;
        int i18;
        final Label label4;
        Object objE;
        CustomSingleCardData customSingleCardData;
        er.q<e.CustomContainerModifierData, p076m2.r, Integer, f3.m> qVarB;
        DefaultSingleCardData defaultSingleCardData;
        x0 trailingSection;
        e customContent;
        int i19;
        p076m2.r rVarH = rVar.h(1499368099);
        int i25 = i16 & 1;
        if (i25 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                lVar2 = lVar;
                int i26 = rVarH.W(lVar2) ? 256 : 128;
                i17 |= i26;
            } else {
                lVar2 = lVar;
            }
            i17 |= i26;
        } else {
            lVar2 = lVar;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.W(num) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                zero = f15;
                if (rVarH.b(zero)) {
                    i19 = 16384;
                }
                i17 |= i19;
            } else {
                zero = f15;
            }
            i19 = PKIFailureInfo.certRevoked;
            i17 |= i19;
        } else {
            zero = f15;
        }
        int i27 = i16 & 32;
        if (i27 == 0) {
            if ((196608 & i15) == 0) {
                label2 = label;
                i17 |= rVarH.W(label2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
            }
            if ((74899 & i17) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i25 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        lVarA = b1.k.a();
                        i17 &= -897;
                    } else {
                        lVarA = lVar2;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                        zero = k70.a.f108864a.b(rVarH, k70.a.f108865b).getZero();
                    }
                    if (i27 != 0) {
                        lVar4 = lVarA;
                        i18 = i17;
                        f16 = zero;
                        label4 = null;
                    } else {
                        lVar4 = lVarA;
                        i18 = i17;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(1499368099, i18, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardSectionItems (SingleCard.kt:158)");
                    }
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = t70.s.I();
                        rVarH.v(objE);
                    }
                    final cx.a aVar = (cx.a) objE;
                    if (kVar instanceof CustomSingleCardData) {
                        customSingleCardData = (CustomSingleCardData) kVar;
                    } else {
                        customSingleCardData = null;
                    }
                    if (customSingleCardData != null || (customContent = customSingleCardData.getCustomContent()) == null) {
                        qVarB = null;
                    } else {
                        qVarB = customContent.b();
                    }
                    if (kVar instanceof DefaultSingleCardData) {
                        defaultSingleCardData = (DefaultSingleCardData) kVar;
                    } else {
                        defaultSingleCardData = null;
                    }
                    if (defaultSingleCardData != null) {
                        trailingSection = defaultSingleCardData.getTrailingSection();
                    } else {
                        trailingSection = null;
                    }
                    final x0.Switch r15 = trailingSection instanceof x0.Switch ? (x0.Switch) trailingSection : null;
                    final er.q<e.CustomContainerModifierData, p076m2.r, Integer, f3.m> qVar = qVarB;
                    d60.m.c(kVar.getFieldIndex(), y2.m.d(1256311983, true, new er.p() { // from class: n50.a0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h0.O(mVar3, kVar, num, label4, f16, qVar, aVar, lVar4, r15, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    label3 = label4;
                    lVar3 = lVar4;
                } else {
                    rVarH.O();
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                    }
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                    }
                    mVar3 = mVar2;
                    i18 = i17;
                    lVar4 = lVar2;
                }
                f16 = zero;
                label4 = label2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(1499368099, i18, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardSectionItems (SingleCard.kt:158)");
                }
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = t70.s.I();
                    rVarH.v(objE);
                }
                final cx.a aVar2 = (cx.a) objE;
                if (kVar instanceof CustomSingleCardData) {
                    customSingleCardData = (CustomSingleCardData) kVar;
                } else {
                    customSingleCardData = null;
                }
                if (customSingleCardData != null) {
                    qVarB = null;
                } else {
                    qVarB = null;
                }
                if (kVar instanceof DefaultSingleCardData) {
                    defaultSingleCardData = (DefaultSingleCardData) kVar;
                } else {
                    defaultSingleCardData = null;
                }
                if (defaultSingleCardData != null) {
                    trailingSection = defaultSingleCardData.getTrailingSection();
                } else {
                    trailingSection = null;
                }
                final x0.Switch r16 = trailingSection instanceof x0.Switch ? (x0.Switch) trailingSection : null;
                final er.q qVar2 = qVarB;
                d60.m.c(kVar.getFieldIndex(), y2.m.d(1256311983, true, new er.p() { // from class: n50.a0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h0.O(mVar3, kVar, num, label4, f16, qVar2, aVar2, lVar4, r16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                label3 = label4;
                lVar3 = lVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                lVar3 = lVar2;
                f16 = zero;
                label3 = label2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: n50.b0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h0.R(mVar3, kVar, lVar3, num, f16, label3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        label2 = label;
        if ((74899 & i17) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i25 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if ((i16 & 4) != 0) {
                    lVarA = b1.k.a();
                    i17 &= -897;
                } else {
                    lVarA = lVar2;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    zero = k70.a.f108864a.b(rVarH, k70.a.f108865b).getZero();
                }
                if (i27 != 0) {
                    lVar4 = lVarA;
                    i18 = i17;
                    f16 = zero;
                    label4 = null;
                } else {
                    lVar4 = lVarA;
                    i18 = i17;
                    f16 = zero;
                    label4 = label2;
                }
            } else {
                if (i25 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if ((i16 & 4) != 0) {
                    lVarA = b1.k.a();
                    i17 &= -897;
                } else {
                    lVarA = lVar2;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    zero = k70.a.f108864a.b(rVarH, k70.a.f108865b).getZero();
                }
                if (i27 != 0) {
                    lVar4 = lVarA;
                    i18 = i17;
                    f16 = zero;
                    label4 = null;
                } else {
                    lVar4 = lVarA;
                    i18 = i17;
                    f16 = zero;
                    label4 = label2;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(1499368099, i18, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardSectionItems (SingleCard.kt:158)");
            }
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = t70.s.I();
                rVarH.v(objE);
            }
            final cx.a aVar3 = (cx.a) objE;
            if (kVar instanceof CustomSingleCardData) {
                customSingleCardData = (CustomSingleCardData) kVar;
            } else {
                customSingleCardData = null;
            }
            if (customSingleCardData != null) {
                qVarB = null;
            } else {
                qVarB = null;
            }
            if (kVar instanceof DefaultSingleCardData) {
                defaultSingleCardData = (DefaultSingleCardData) kVar;
            } else {
                defaultSingleCardData = null;
            }
            if (defaultSingleCardData != null) {
                trailingSection = defaultSingleCardData.getTrailingSection();
            } else {
                trailingSection = null;
            }
            final x0.Switch r17 = trailingSection instanceof x0.Switch ? (x0.Switch) trailingSection : null;
            final er.q qVar3 = qVarB;
            d60.m.c(kVar.getFieldIndex(), y2.m.d(1256311983, true, new er.p() { // from class: n50.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.O(mVar3, kVar, num, label4, f16, qVar3, aVar3, lVar4, r17, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            label3 = label4;
            lVar3 = lVar4;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            lVar3 = lVar2;
            f16 = zero;
            label3 = label2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.R(mVar3, kVar, lVar3, num, f16, label3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String N(Integer num, DefaultSingleCardData defaultSingleCardData) {
        Label label;
        n50.b title = defaultSingleCardData.getBodySection().getTitle();
        if (title instanceof n50.b.StatusBadge) {
            label = ((n50.b.StatusBadge) title).getStatusBadgeData().getLabel();
        } else {
            if (!(title instanceof n50.b.Title)) {
                throw new oq.p();
            }
            label = ((n50.b.Title) title).getSingleCardLabel().getLabel();
        }
        String str = label.getTag() + "Card";
        if (num == null) {
            return str;
        }
        return str + '_' + num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0153  */
    public static final oq.i0 O(f3.m mVar, final k kVar, final Integer num, final Label label, float f15, er.q qVar, cx.a aVar, b1.l lVar, x0.Switch r27, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        Object objE;
        f3.m mVarC;
        DefaultSingleCardData defaultSingleCardData;
        n50.d controlSection;
        n50.d.RadioButton radioButton;
        LeadingSection leadingSection;
        LeadingSection leadingSection2;
        String str;
        String str2;
        String str3;
        String str4;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1256311983, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardSectionItems.<anonymous> (SingleCard.kt:175)");
            }
            boolean zG = rVar.G(kVar) | rVar.W(num) | rVar.W(label);
            Object objE2 = rVar.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: n50.c0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.P(kVar, label, num, (n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f3.m mVarK = androidx.compose.foundation.layout.d.k(n4.v.d(mVar, false, (er.l) objE2, 1, null), c5.h.n(f132027a - c5.h.n(2 * f15)), 0.0f, 2, null);
            if (kVar.c() != null && qVar != null) {
                rVar.X(430029533);
                mVarC = (f3.m) qVar.w(new e.CustomContainerModifierData(aVar, lVar, (er.a) fr.w0.g(((CustomSingleCardData) kVar).c(), 0)), rVar, 0);
                rVar.R();
            } else if (r27 != null) {
                rVar.X(430040241);
                mVarC = i0(r27, lVar, ((DefaultSingleCardData) kVar).getIsEnabled(), rVar, 0);
                rVar.R();
            } else if (kVar.c() != null) {
                DefaultSingleCardData defaultSingleCardData2 = kVar instanceof DefaultSingleCardData ? (DefaultSingleCardData) kVar : null;
                n50.d controlSection2 = (defaultSingleCardData2 == null || (leadingSection2 = defaultSingleCardData2.getLeadingSection()) == null) ? null : leadingSection2.getControlSection();
                if ((controlSection2 instanceof n50.d.CheckBox ? (n50.d.CheckBox) controlSection2 : null) != null) {
                    rVar.X(430049950);
                    mVarC = c0((DefaultSingleCardData) kVar, lVar, aVar, rVar, 0);
                    rVar.R();
                } else if (kVar.c() == null) {
                    if (kVar instanceof DefaultSingleCardData) {
                        defaultSingleCardData = (DefaultSingleCardData) kVar;
                    } else {
                        defaultSingleCardData = null;
                    }
                    if (defaultSingleCardData != null) {
                        controlSection = null;
                    } else {
                        controlSection = null;
                    }
                    if (controlSection instanceof n50.d.RadioButton) {
                        radioButton = (n50.d.RadioButton) controlSection;
                    } else {
                        radioButton = null;
                    }
                    if (radioButton != null) {
                        rVar.X(430060161);
                        mVarC = g0((DefaultSingleCardData) kVar, lVar, aVar, rVar, 0);
                        rVar.R();
                    } else if (kVar.c() != null) {
                        rVar.X(430066197);
                        mVarC = e0(kVar, lVar, aVar, rVar, 0);
                        rVar.R();
                    } else {
                        rVar.X(430071380);
                        f3.m.Companion companion = f3.m.INSTANCE;
                        objE = rVar.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.l() { // from class: n50.d0
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return h0.Q((n4.i0) obj);
                                }
                            };
                            rVar.v(objE);
                        }
                        mVarC = n4.v.c(companion, true, (er.l) objE);
                        rVar.R();
                    }
                } else if (kVar.c() != null) {
                    rVar.X(430066197);
                    mVarC = e0(kVar, lVar, aVar, rVar, 0);
                    rVar.R();
                } else {
                    rVar.X(430071380);
                    f3.m.Companion companion2 = f3.m.INSTANCE;
                    objE = rVar.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.l() { // from class: n50.d0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h0.Q((n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    mVarC = n4.v.c(companion2, true, (er.l) objE);
                    rVar.R();
                }
            } else if (kVar.c() == null) {
                if (kVar instanceof DefaultSingleCardData) {
                    defaultSingleCardData = (DefaultSingleCardData) kVar;
                } else {
                    defaultSingleCardData = null;
                }
                if (defaultSingleCardData != null || (leadingSection = defaultSingleCardData.getLeadingSection()) == null) {
                    controlSection = null;
                } else {
                    controlSection = leadingSection.getControlSection();
                }
                if (controlSection instanceof n50.d.RadioButton) {
                    radioButton = (n50.d.RadioButton) controlSection;
                } else {
                    radioButton = null;
                }
                if (radioButton != null) {
                    rVar.X(430060161);
                    mVarC = g0((DefaultSingleCardData) kVar, lVar, aVar, rVar, 0);
                    rVar.R();
                } else if (kVar.c() != null) {
                    rVar.X(430066197);
                    mVarC = e0(kVar, lVar, aVar, rVar, 0);
                    rVar.R();
                } else {
                    rVar.X(430071380);
                    f3.m.Companion companion3 = f3.m.INSTANCE;
                    objE = rVar.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.l() { // from class: n50.d0
                            @Override // er.l
                            public final Object b(Object obj) {
                                return h0.Q((n4.i0) obj);
                            }
                        };
                        rVar.v(objE);
                    }
                    mVarC = n4.v.c(companion3, true, (er.l) objE);
                    rVar.R();
                }
            } else if (kVar.c() != null) {
                rVar.X(430066197);
                mVarC = e0(kVar, lVar, aVar, rVar, 0);
                rVar.R();
            } else {
                rVar.X(430071380);
                f3.m.Companion companion4 = f3.m.INSTANCE;
                objE = rVar.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: n50.d0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h0.Q((n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                mVarC = n4.v.c(companion4, true, (er.l) objE);
                rVar.R();
            }
            f3.m mVarU = mVarK.u(mVarC);
            k70.a aVar2 = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarO = a3.o(androidx.compose.foundation.layout.d.h(w0.i.d(mVarU, aVar2.a(rVar, i16).getSurface().a(), null, 2, null), 0.0f, 1, null), aVar2.b(rVar, i16).getSpacing200(), c5.h.n(aVar2.b(rVar, i16).getSpacing200() - f15));
            d1.i iVar = d1.i.f39152a;
            d1.i.e eVarJ = iVar.j();
            f3.c.Companion companion5 = f3.c.INSTANCE;
            p036e4.w0 w0VarB = m3.b(eVarJ, companion5.l(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarO);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion6.b();
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
            n6.i(rVarC, w0VarB, companion6.d());
            n6.i(rVarC, e0VarT, companion6.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion6.c());
            n6.g(rVarC, companion6.a());
            n6.i(rVarC, mVarE, companion6.e());
            q3 q3Var = q3.f39261a;
            if (kVar instanceof CustomSingleCardData) {
                rVar.X(182927324);
                ((CustomSingleCardData) kVar).getCustomContent().a(rVar, 0);
                rVar.R();
            } else {
                if (!(kVar instanceof DefaultSingleCardData)) {
                    rVar.X(182928301);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(182932137);
                f3.c.InterfaceC1317c interfaceC1317cI = companion5.i();
                f3.m.Companion companion7 = f3.m.INSTANCE;
                p036e4.w0 w0VarB2 = m3.b(iVar.j(), interfaceC1317cI, rVar, 48);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, companion7);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion6.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarB2, companion6.d());
                n6.i(rVarC2, e0VarT2, companion6.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion6.c());
                n6.g(rVarC2, companion6.a());
                n6.i(rVarC2, mVarE2, companion6.e());
                DefaultSingleCardData defaultSingleCardData3 = (DefaultSingleCardData) kVar;
                LeadingSection leadingSection3 = defaultSingleCardData3.getLeadingSection();
                if (leadingSection3 == null) {
                    rVar.X(-1118008302);
                } else {
                    rVar.X(-1118008301);
                    f3.c.InterfaceC1317c interfaceC1317cL = leadingSection3.getAlignSectionsToTop() ? companion5.l() : companion5.i();
                    f3.m mVarB = q3Var.b(companion7, interfaceC1317cL);
                    p036e4.w0 w0VarB3 = m3.b(iVar.j(), interfaceC1317cL, rVar, 0);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
                    p076m2.e0 e0VarT3 = rVar.t();
                    f3.m mVarE3 = f3.j.e(rVar, mVarB);
                    er.a<androidx.compose.ui.node.c> aVarB3 = companion6.b();
                    if (rVar.l() == null) {
                        p076m2.m.d();
                    }
                    rVar.K();
                    if (rVar.getInserting()) {
                        rVar.H(aVarB3);
                    } else {
                        rVar.u();
                    }
                    p076m2.r rVarC3 = n6.c(rVar);
                    n6.i(rVarC3, w0VarB3, companion6.d());
                    n6.i(rVarC3, e0VarT3, companion6.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion6.c());
                    n6.g(rVarC3, companion6.a());
                    n6.i(rVarC3, mVarE3, companion6.e());
                    n50.d controlSection3 = leadingSection3.getControlSection();
                    if (controlSection3 == null) {
                        rVar.X(-556364373);
                    } else {
                        rVar.X(-556364372);
                        String testTag = defaultSingleCardData3.getTestTag();
                        if (testTag != null) {
                            str = testTag + "ControlSection";
                        } else {
                            str = null;
                        }
                        E(str, controlSection3, defaultSingleCardData3.getIsEnabled(), defaultSingleCardData3.getSingleCardState(), rVar, 0);
                        r3.a(androidx.compose.foundation.layout.d.y(companion7, aVar2.b(rVar, i16).getSpacing200()), rVar, 0);
                        oq.i0 i0Var = oq.i0.f148189a;
                    }
                    rVar.R();
                    i mediaSection = leadingSection3.getMediaSection();
                    if (mediaSection == null) {
                        rVar.X(-555857275);
                    } else {
                        rVar.X(-555857274);
                        String testTag2 = defaultSingleCardData3.getTestTag();
                        if (testTag2 != null) {
                            str2 = testTag2 + "LeadingMediaSection";
                        } else {
                            str2 = null;
                        }
                        G(str2, mediaSection, defaultSingleCardData3.getIsEnabled(), rVar, 0);
                        r3.a(androidx.compose.foundation.layout.d.y(companion7, aVar2.b(rVar, i16).getSpacing200()), rVar, 0);
                        oq.i0 i0Var2 = oq.i0.f148189a;
                    }
                    rVar.R();
                    rVar.x();
                    oq.i0 i0Var3 = oq.i0.f148189a;
                }
                rVar.R();
                String str5 = null;
                f3.m mVarC2 = p3.c(q3Var, androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.b(companion7, 0.0f, f132028b, 1, null), 0.0f, 1, null), 1.0f, false, 2, null);
                p036e4.w0 w0VarA = d1.e0.a(iVar.t(aVar2.b(rVar, i16).getSpacing200(), companion5.i()), companion5.k(), rVar, 0);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT4 = rVar.t();
                f3.m mVarE4 = f3.j.e(rVar, mVarC2);
                er.a<androidx.compose.ui.node.c> aVarB4 = companion6.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB4);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC4 = n6.c(rVar);
                n6.i(rVarC4, w0VarA, companion6.d());
                n6.i(rVarC4, e0VarT4, companion6.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion6.c());
                n6.g(rVarC4, companion6.a());
                n6.i(rVarC4, mVarE4, companion6.e());
                d1.i0 i0Var4 = d1.i0.f39176a;
                w0 topSection = defaultSingleCardData3.getTopSection();
                if (topSection == null) {
                    rVar.X(-2045189678);
                } else {
                    rVar.X(-2045189677);
                    S(topSection, rVar, 0);
                    oq.i0 i0Var5 = oq.i0.f148189a;
                }
                rVar.R();
                String testTag3 = defaultSingleCardData3.getTestTag();
                if (testTag3 != null) {
                    str3 = testTag3 + "BodySection";
                } else {
                    str3 = null;
                }
                y(str3, defaultSingleCardData3.getBodySection(), defaultSingleCardData3.getIsEnabled(), rVar, 0);
                BottomSection bottomSection = defaultSingleCardData3.getBottomSection();
                if (bottomSection == null) {
                    rVar.X(-2044822762);
                } else {
                    rVar.X(-2044822761);
                    String testTag4 = defaultSingleCardData3.getTestTag();
                    if (testTag4 != null) {
                        str4 = testTag4 + "BottomSection";
                    } else {
                        str4 = null;
                    }
                    A(str4, bottomSection, defaultSingleCardData3.getIsEnabled(), rVar, 0);
                    oq.i0 i0Var6 = oq.i0.f148189a;
                }
                rVar.R();
                rVar.x();
                x0 trailingSection = defaultSingleCardData3.getTrailingSection();
                if (trailingSection == null) {
                    rVar.X(-1115564820);
                } else {
                    rVar.X(-1115564819);
                    r3.a(androidx.compose.foundation.layout.d.y(companion7, aVar2.b(rVar, i16).getSpacing100()), rVar, 0);
                    String testTag5 = defaultSingleCardData3.getTestTag();
                    if (testTag5 != null) {
                        str5 = testTag5 + "TrailingSection";
                    }
                    U(str5, trailingSection, defaultSingleCardData3.getIsEnabled(), defaultSingleCardData3.getBodySection(), rVar, 0);
                    oq.i0 i0Var7 = oq.i0.f148189a;
                }
                rVar.R();
                rVar.x();
                rVar.R();
            }
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
    public static final oq.i0 P(k kVar, Label label, Integer num, n4.i0 i0Var) {
        String strN;
        String text;
        n4.g0.a(i0Var, true);
        if (kVar instanceof CustomSingleCardData) {
            strN = ((CustomSingleCardData) kVar).getTestTag();
        } else {
            if (!(kVar instanceof DefaultSingleCardData)) {
                throw new oq.p();
            }
            DefaultSingleCardData defaultSingleCardData = (DefaultSingleCardData) kVar;
            String testTag = defaultSingleCardData.getTestTag();
            strN = testTag == null ? N(num, defaultSingleCardData) : testTag;
        }
        n4.f0.y0(i0Var, strN);
        n4.f0.e0(i0Var, kVar.b());
        if (label != null && (text = label.getText()) != null && text.length() <= 20) {
            n4.f0.c0(i0Var, text);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(n4.i0 i0Var) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(f3.m mVar, k kVar, b1.l lVar, Integer num, float f15, Label label, int i15, int i16, p076m2.r rVar, int i17) {
        M(mVar, kVar, lVar, num, f15, label, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void S(final w0 w0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1414778395);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(w0Var) : rVarH.G(w0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1414778395, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardTopSection (SingleCard.kt:381)");
            }
            if (w0Var instanceof w0.StatusBadge) {
                rVarH.X(-1902591730);
                r50.e.f(((w0.StatusBadge) w0Var).getStatusBadgeData(), true, Float.valueOf(2.0f), false, rVarH, 432, 8);
                rVarH.R();
            } else {
                if (!(w0Var instanceof w0.StatusLabel)) {
                    rVarH.X(-1902593194);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1902586905);
                w0.StatusLabel statusLabel = (w0.StatusLabel) w0Var;
                j70.h.g(null, null, statusLabel.getLabel(), null, null, statusLabel.b().B(rVarH, 0).m20unboximpl(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVarH, k70.a.f108865b).c(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
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
            d5VarM.a(new er.p() { // from class: n50.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.T(w0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(w0 w0Var, int i15, p076m2.r rVar, int i16) {
        S(w0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void U(final String str, final x0 x0Var, final boolean z15, final BodySection bodySection, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1913185225);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(x0Var) : rVarH.G(x0Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(bodySection) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1913185225, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardTrailingSection (SingleCard.kt:644)");
            }
            String str2 = null;
            if (x0Var instanceof x0.Button) {
                rVarH.X(-324991007);
                x0.Button button = (x0.Button) x0Var;
                ButtonData buttonData = button.getButtonData();
                k30.b buttonState = k30.b.C2562b.f107767a;
                if (z15) {
                    buttonState = null;
                }
                if (buttonState == null) {
                    buttonState = button.getButtonData().getButtonState();
                }
                ButtonData buttonDataB = ButtonData.b(buttonData, null, null, null, null, null, buttonState, null, 95, null);
                k30.c buttonType = buttonDataB.getButtonType();
                SingleCardLabel info = bodySection.getInfo();
                Label label = info != null ? info.getLabel() : null;
                if (fr.t.c(buttonDataB.getButtonType().getContentDescription(), Label.INSTANCE.c()) && label != null && (buttonType instanceof k30.c.WithText)) {
                    buttonDataB = ButtonData.b(buttonDataB, null, null, null, k30.c.WithText.b((k30.c.WithText) buttonType, null, mx.b.b(((k30.c.WithText) buttonDataB.getButtonType()).getLabel().getText() + " - " + label.getText(), label.getTag()), 1, null), null, null, null, 119, null);
                }
                h30.q.p(buttonDataB, false, null, rVarH, 0, 6);
                rVarH.R();
            } else if (x0Var instanceof x0.Icon) {
                rVarH.X(-324966319);
                if (str != null) {
                    str2 = str + "Icon";
                }
                x0.Icon icon = (x0.Icon) x0Var;
                d40.h.f(null, new d40.b.C0864b(str2, icon.getIconResId(), d40.i.f.f39709e, new d(x0Var, z15), icon.getContentDescription(), null, 32, null), false, rVarH, 0, 5);
                rVarH.R();
            } else if (x0Var instanceof x0.Switch) {
                rVarH.X(-324950977);
                if (str != null) {
                    str2 = str + "Switch";
                }
                x0.Switch r15 = (x0.Switch) x0Var;
                s50.d.b(new s50.a.C4550a(str2, r15.getSwitchData().getChecked(), r15.getSwitchData().getEnabled() && z15, null, r15.getSwitchData().getContentDescription(), null, r15.getSwitchData().getTestIndexTag(), true, 32, null), rVarH, 0);
                rVarH.R();
            } else {
                if (!(x0Var instanceof x0.IconButton)) {
                    rVarH.X(-324991695);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-324935618);
                i30.g.f(((x0.IconButton) x0Var).getData(), false, false, rVarH, 0, 6);
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
            d5VarM.a(new er.p() { // from class: n50.g0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.V(str, x0Var, z15, bodySection, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(String str, x0 x0Var, boolean z15, BodySection bodySection, int i15, p076m2.r rVar, int i16) {
        U(str, x0Var, z15, bodySection, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void W(final j0 j0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(847736270);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(j0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(847736270, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.ValidationSection (SingleCard.kt:833)");
            }
            if (j0Var instanceof j0.Helper) {
                rVarH.X(-1369226915);
                p40.b.b(null, ((j0.Helper) j0Var).getLabel(), false, rVarH, 0, 5);
                rVarH.R();
            } else if (j0Var instanceof j0.Error) {
                rVarH.X(-1369224352);
                j0.Error error = (j0.Error) j0Var;
                if (error.getLabel().m()) {
                    rVarH.X(-1369222854);
                    l40.d.d(null, error.getLabel(), false, rVarH, 0, 5);
                    rVarH.R();
                } else {
                    rVarH.X(-1369221070);
                    rVarH.R();
                }
                rVarH.R();
            } else {
                if (!fr.t.c(j0Var, j0.a.f132074a)) {
                    rVarH.X(-1369228469);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1369219822);
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
            d5VarM.a(new er.p() { // from class: n50.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.X(j0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(j0 j0Var, int i15, p076m2.r rVar, int i16) {
        W(j0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final float Z() {
        return f132028b;
    }

    public static final float a0() {
        return f132027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b0(long j15, boolean z15, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1161847292, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.setElementColor (SingleCard.kt:825)");
        }
        if (z15) {
            rVar.X(-156244376);
            rVar.R();
        } else {
            rVar.X(-156245083);
            j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return j15;
    }

    private static final f3.m c0(final DefaultSingleCardData defaultSingleCardData, b1.l lVar, final cx.a aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(604519395, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.singleCardCheckboxToggleable (SingleCard.kt:352)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        LeadingSection leadingSection = defaultSingleCardData.getLeadingSection();
        n50.d controlSection = leadingSection != null ? leadingSection.getControlSection() : null;
        n50.d.CheckBox checkBox = controlSection instanceof n50.d.CheckBox ? (n50.d.CheckBox) controlSection : null;
        boolean isChecked = checkBox != null ? checkBox.getIsChecked() : false;
        r1 r1VarE = t70.s.E(0.0f, rVar, 0, 1);
        boolean isEnabled = defaultSingleCardData.getIsEnabled();
        n4.l lVarJ = n4.l.j(n4.l.INSTANCE.c());
        boolean zG = rVar.G(aVar) | ((((i15 & 14) ^ 6) > 4 && rVar.W(defaultSingleCardData)) || (i15 & 6) == 4);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: n50.u
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.d0(defaultSingleCardData, aVar, ((Boolean) obj).booleanValue());
                }
            };
            rVar.v(objE);
        }
        f3.m mVarA = k1.g.a(companion, isChecked, lVar, r1VarE, isEnabled, lVarJ, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(DefaultSingleCardData defaultSingleCardData, cx.a aVar, boolean z15) {
        er.a<oq.i0> aVarC = defaultSingleCardData.c();
        if (aVarC != null) {
            cx.a.a(aVar, 0L, aVarC, 1, null);
        }
        return oq.i0.f148189a;
    }

    private static final f3.m e0(final k kVar, b1.l lVar, final cx.a aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1632377191, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.singleCardClickable (SingleCard.kt:338)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        r1 r1VarE = t70.s.E(0.0f, rVar, 0, 1);
        boolean isEnabled = kVar.getIsEnabled();
        n4.l lVarJ = n4.l.j(n4.l.INSTANCE.a());
        boolean zG = rVar.G(aVar) | ((((i15 & 14) ^ 6) > 4 && rVar.G(kVar)) || (i15 & 6) == 4);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: n50.f0
                @Override // er.a
                public final Object a() {
                    return h0.f0(kVar, aVar);
                }
            };
            rVar.v(objE);
        }
        f3.m mVarL = androidx.compose.foundation.b.l(companion, lVar, r1VarE, isEnabled, null, lVarJ, (er.a) objE, 8, null);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(k kVar, cx.a aVar) {
        er.a<oq.i0> aVarC = kVar.c();
        if (aVarC != null) {
            cx.a.a(aVar, 0L, aVarC, 1, null);
        }
        return oq.i0.f148189a;
    }

    private static final f3.m g0(final DefaultSingleCardData defaultSingleCardData, b1.l lVar, final cx.a aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1879600909, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.singleCardRadioButtonSelectable (SingleCard.kt:367)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        LeadingSection leadingSection = defaultSingleCardData.getLeadingSection();
        n50.d controlSection = leadingSection != null ? leadingSection.getControlSection() : null;
        n50.d.RadioButton radioButton = controlSection instanceof n50.d.RadioButton ? (n50.d.RadioButton) controlSection : null;
        boolean isSelected = radioButton != null ? radioButton.getIsSelected() : false;
        r1 r1VarE = t70.s.E(0.0f, rVar, 0, 1);
        boolean isEnabled = defaultSingleCardData.getIsEnabled();
        n4.l lVarJ = n4.l.j(n4.l.INSTANCE.f());
        boolean zG = rVar.G(aVar) | ((((i15 & 14) ^ 6) > 4 && rVar.W(defaultSingleCardData)) || (i15 & 6) == 4);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: n50.s
                @Override // er.a
                public final Object a() {
                    return h0.h0(defaultSingleCardData, aVar);
                }
            };
            rVar.v(objE);
        }
        f3.m mVarA = k1.d.a(companion, isSelected, lVar, r1VarE, isEnabled, lVarJ, (er.a) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(DefaultSingleCardData defaultSingleCardData, cx.a aVar) {
        er.a<oq.i0> aVarC = defaultSingleCardData.c();
        if (aVarC != null) {
            cx.a.a(aVar, 0L, aVarC, 1, null);
        }
        return oq.i0.f148189a;
    }

    private static final f3.m i0(final x0.Switch r15, b1.l lVar, boolean z15, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-436532937, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.singleCardToggleable (SingleCard.kt:320)");
        }
        f3.m mVarQ = t70.i.Q(f3.m.INSTANCE, r15.getSwitchData().getChecked(), r15.getSwitchData().getAdditionalStateDescription(), rVar, 6);
        boolean checked = r15.getSwitchData().getChecked();
        r1 r1VarE = t70.s.E(0.0f, rVar, 0, 1);
        n4.l lVarJ = n4.l.j(n4.l.INSTANCE.g());
        boolean z16 = (((i15 & 14) ^ 6) > 4 && rVar.W(r15)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z16 || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: n50.v
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.j0(r15, ((Boolean) obj).booleanValue());
                }
            };
            rVar.v(objE);
        }
        f3.m mVarA = k1.g.a(mVarQ, checked, lVar, r1VarE, z15, lVarJ, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(x0.Switch r15, boolean z15) {
        er.l<Boolean, oq.i0> lVarF = r15.getSwitchData().f();
        if (lVarF != null) {
            lVarF.b(Boolean.valueOf(z15));
        }
        return oq.i0.f148189a;
    }

    public static final void v(k kVar, SingleCardConfig singleCardConfig, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        SingleCardConfig singleCardConfig2;
        final k kVar2;
        p076m2.r rVar2;
        final SingleCardConfig singleCardConfig3;
        f3.m mVar;
        y2 y2Var;
        f3.m mVarB;
        f3.m mVarA;
        p076m2.r rVarH = rVar.h(496515035);
        if ((i15 & 6) == 0) {
            i17 = i15 | ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                singleCardConfig2 = singleCardConfig;
                int i18 = rVarH.W(singleCardConfig2) ? 32 : 16;
                i17 |= i18;
            } else {
                singleCardConfig2 = singleCardConfig;
            }
            i17 |= i18;
        } else {
            singleCardConfig2 = singleCardConfig;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i16 & 2) != 0) {
                singleCardConfig2 = new SingleCardConfig(null, false, 3, null);
                i17 &= -113;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(496515035, i17, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCard (SingleCard.kt:89)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = b1.k.a();
                rVarH.v(objE);
            }
            final b1.l lVar = (b1.l) objE;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            y2 radius200 = aVar.e(rVarH, i19).getRadius200();
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            SingleCardConfig singleCardConfig4 = singleCardConfig2;
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (singleCardConfig4.getIsOuterFocusEnabled()) {
                rVarH.X(829281004);
                y2Var = radius200;
                mVarB = t70.s.w(companion, f6VarA, aVar.b(rVarH, i19).getSpacing200(), 0.0f, 4, null);
                mVar = companion;
                rVarH.R();
            } else {
                mVar = companion;
                y2Var = radius200;
                rVarH.X(829449675);
                mVarB = t70.s.B(mVar, f6VarA, y2Var, rVarH, 6);
                rVarH.R();
            }
            f3.m mVarU = mVar.u(mVarB);
            if (kVar.getContainerBorderEnabled()) {
                rVarH.X(829665497);
                mVarA = k3.f.a(w0.o.h(mVar, aVar.b(rVarH, i19).getSpacing25(), aVar.a(rVarH, i19).getBase().getPrimary(), y2Var), y2Var);
                rVarH.R();
            } else {
                rVarH.X(829910831);
                rVarH.R();
                mVarA = mVar;
            }
            f3.m mVarC = androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(mVarU.u(mVarA), 0.0f, 1, null), null, false, 3, null);
            y1 y1Var = y1.f58315a;
            long jA = aVar.a(rVarH, i19).getSurface().a();
            int i25 = y1.f58316b;
            f3.m mVar2 = mVar;
            singleCardConfig3 = singleCardConfig4;
            x1 x1VarB = y1Var.b(jA, 0L, 0L, 0L, rVarH, i25 << 12, 14);
            z1 z1VarC = y1Var.c(aVar.c(rVarH, i19).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i25 << 18, 62);
            rVar2 = rVarH;
            kVar2 = kVar;
            c2.c(mVarC, y2Var, x1VarB, z1VarC, null, y2.m.d(1846451139, true, new er.q() { // from class: n50.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h0.w(singleCardConfig3, kVar2, lVar, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, 196608, 16);
            if (kVar2.getSingleCardState() instanceof j0.a) {
                rVar2.X(824743441);
            } else {
                rVar2.X(830516509);
                r3.a(androidx.compose.foundation.layout.d.i(mVar2, aVar.b(rVar2, i19).getSpacing100()), rVar2, 0);
                W(kVar2.getSingleCardState(), rVar2, 0);
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            kVar2 = kVar;
            rVar2 = rVarH;
            rVar2.O();
            singleCardConfig3 = singleCardConfig2;
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.x(kVar2, singleCardConfig3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(SingleCardConfig singleCardConfig, k kVar, b1.l lVar, d1.h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1846451139, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCard.<anonymous>.<anonymous> (SingleCard.kt:132)");
            }
            M(singleCardConfig.getModifier(), kVar, lVar, null, 0.0f, null, rVar, 3456, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(k kVar, SingleCardConfig singleCardConfig, int i15, int i16, p076m2.r rVar, int i17) {
        v(kVar, singleCardConfig, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void y(final String str, final BodySection bodySection, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        String str2;
        Color colorM0boximpl;
        long jM20unboximpl;
        int i17;
        k70.a aVar;
        int i18;
        String str3;
        Color colorM0boximpl2;
        long jM20unboximpl2;
        String str4;
        Color colorM0boximpl3;
        long jM20unboximpl3;
        p076m2.r rVarH = rVar.h(-2005915154);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(bodySection) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2005915154, i16, -1, "pl.gov.coi.common.ui.ds.singlecard.SingleCardBodySection (SingleCard.kt:568)");
            }
            d1.i iVar = d1.i.f39152a;
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar2.b(rVarH, i19).getSpacing50());
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(fVarR, f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            SingleCardLabel info = bodySection.getInfo();
            if (info == null) {
                rVarH.X(-2008904693);
                rVarH.R();
                i17 = i16;
                aVar = aVar2;
                i18 = i19;
            } else {
                rVarH.X(-2008904692);
                if (str != null) {
                    str2 = str + "InfoText";
                } else {
                    str2 = null;
                }
                Label label = info.getLabel();
                TextStyle textStyleD = aVar2.f(rVarH, i19).d();
                er.p<p076m2.r, Integer, Color> pVarD = info.d();
                if (pVarD == null) {
                    rVarH.X(437197982);
                    rVarH.R();
                    colorM0boximpl = null;
                } else {
                    rVarH.X(-1787012157);
                    long jM20unboximpl4 = pVarD.B(rVarH, 0).m20unboximpl();
                    rVarH.R();
                    colorM0boximpl = Color.m0boximpl(jM20unboximpl4);
                }
                if (colorM0boximpl == null) {
                    rVarH.X(-1787010619);
                    jM20unboximpl = aVar2.a(rVarH, i19).getNeutral().b();
                    rVarH.R();
                } else {
                    rVarH.X(-1787012634);
                    rVarH.R();
                    jM20unboximpl = colorM0boximpl.m20unboximpl();
                }
                long jB0 = b0(jM20unboximpl, z15, rVarH, (i16 >> 3) & 112);
                String str5 = str2;
                Label contentDescription = info.getContentDescription();
                int maxLines = info.getMaxLines();
                int textOverflow = info.getTextOverflow();
                j70.a accessibilityReadMode = info.getAccessibilityReadMode();
                i17 = i16;
                aVar = aVar2;
                i18 = i19;
                j70.h.g(null, str5, label, contentDescription, null, jB0, 0L, null, null, null, 0L, null, null, 0L, textOverflow, false, maxLines, 0, null, textStyleD, null, null, false, false, accessibilityReadMode, rVarH, 0, 0, MLKEMEngine.KyberPolyBytes, 11976657);
                rVarH = rVarH;
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVarH.R();
            }
            n50.b title = bodySection.getTitle();
            if (title instanceof n50.b.StatusBadge) {
                rVarH.X(-896065767);
                r50.e.f(((n50.b.StatusBadge) title).getStatusBadgeData(), true, Float.valueOf(2.0f), info == null, rVarH, 432, 0);
                rVarH.R();
            } else {
                if (!(title instanceof n50.b.Title)) {
                    rVarH.X(-896067739);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2007994563);
                if (str != null) {
                    str3 = str + "TitleText";
                } else {
                    str3 = null;
                }
                n50.b.Title title2 = (n50.b.Title) title;
                Label label2 = title2.getSingleCardLabel().getLabel();
                TextStyle textStyleA = aVar.f(rVarH, i18).a();
                er.p<p076m2.r, Integer, Color> pVarD2 = title2.getSingleCardLabel().d();
                if (pVarD2 == null) {
                    rVarH.X(-2007734443);
                    rVarH.R();
                    colorM0boximpl2 = null;
                } else {
                    rVarH.X(-896049620);
                    long jM20unboximpl5 = pVarD2.B(rVarH, 0).m20unboximpl();
                    rVarH.R();
                    colorM0boximpl2 = Color.m0boximpl(jM20unboximpl5);
                }
                if (colorM0boximpl2 == null) {
                    rVarH.X(-896048018);
                    jM20unboximpl2 = aVar.a(rVarH, i18).getNeutral().i();
                    rVarH.R();
                } else {
                    rVarH.X(-896050622);
                    rVarH.R();
                    jM20unboximpl2 = colorM0boximpl2.m20unboximpl();
                }
                p076m2.r rVar2 = rVarH;
                j70.h.g(null, str3, label2, title2.getSingleCardLabel().getContentDescription(), null, b0(jM20unboximpl2, z15, rVarH, (i17 >> 3) & 112), 0L, null, null, null, 0L, null, null, 0L, title2.getSingleCardLabel().getTextOverflow(), false, title2.getSingleCardLabel().getMaxLines(), 0, null, textStyleA, null, null, false, false, title2.getSingleCardLabel().getAccessibilityReadMode(), rVar2, 0, 0, MLKEMEngine.KyberPolyBytes, 11976657);
                rVarH = rVar2;
                rVarH.R();
            }
            SingleCardLabel description = bodySection.getDescription();
            if (description == null) {
                rVarH.X(-2007259957);
            } else {
                rVarH.X(-2007259956);
                int textOverflow2 = description.getTextOverflow();
                int maxLines2 = description.getMaxLines();
                if (str != null) {
                    str4 = str + "DescriptionText";
                } else {
                    str4 = null;
                }
                Label label3 = description.getLabel();
                TextStyle textStyleD2 = aVar.f(rVarH, i18).d();
                er.p<p076m2.r, Integer, Color> pVarD3 = description.d();
                if (pVarD3 == null) {
                    rVarH.X(-1865542490);
                    rVarH.R();
                    colorM0boximpl3 = null;
                } else {
                    rVarH.X(1048199867);
                    long jM20unboximpl6 = pVarD3.B(rVarH, 0).m20unboximpl();
                    rVarH.R();
                    colorM0boximpl3 = Color.m0boximpl(jM20unboximpl6);
                }
                if (colorM0boximpl3 == null) {
                    rVarH.X(1048201405);
                    jM20unboximpl3 = aVar.a(rVarH, i18).getNeutral().b();
                    rVarH.R();
                } else {
                    rVarH.X(1048199173);
                    rVarH.R();
                    jM20unboximpl3 = colorM0boximpl3.m20unboximpl();
                }
                p076m2.r rVar3 = rVarH;
                j70.h.g(null, str4, label3, description.getContentDescription(), null, b0(jM20unboximpl3, z15, rVarH, (i17 >> 3) & 112), 0L, null, null, null, 0L, null, null, 0L, textOverflow2, false, maxLines2, 0, null, textStyleD2, null, null, false, false, description.getAccessibilityReadMode(), rVar3, 0, 0, MLKEMEngine.KyberPolyBytes, 11976657);
                rVarH = rVar3;
                oq.i0 i0Var3 = oq.i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n50.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.z(str, bodySection, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(String str, BodySection bodySection, boolean z15, int i15, p076m2.r rVar, int i16) {
        y(str, bodySection, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
