package u50;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import java.util.Locale;
import mx.Label;
import n3.y2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.c2;
import p046f2.x1;
import p046f2.y1;
import p046f2.z1;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p079n1.KeyboardOptions;
import p079n1.l3;
import q4.TextStyle;
import v4.e1;
import w0.BorderStroke;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aK\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001a\u0010\u0010\u001a\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010 \u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\u0011H\u0003¢\u0006\u0004\b \u0010!\u001aY\u0010*\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00112\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b*\u0010+\u001ac\u00101\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010.\u001a\u00020&2\u0006\u00100\u001a\u00020/2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b1\u00102\u001a\u001f\u00107\u001a\u0002062\u0006\u00103\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108¨\u00069²\u0006\u000e\u0010\u0016\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"Lv50/c;", "data", "Ld60/c;", "focusHost", "Ll3/o;", "focusManager", "Lkotlin/Function1;", "Ll3/l0;", "Loq/i0;", "onFocusChanged", "X", "(Lv50/c;Ld60/c;Ll3/o;Ler/l;Lm2/r;II)V", "", "n0", "(Lv50/c;)Ljava/lang/String;", ip.a.f96138c, "(Lv50/c;Lm2/r;I)V", "", "isRemoveVisible", "isInputFocused", "T", "(Lv50/c;ZZLd60/c;Lm2/r;I)V", "isPasswordVisible", "changePasswordVisibility", "Q", "(Lv50/c;ZZZLd60/c;Ler/l;Lm2/r;I)V", "B", "Lv50/c$a;", "I", "(Lv50/c$a;Lm2/r;I)V", "iconTestTag", "enabled", "V", "(Ljava/lang/String;ZLm2/r;I)V", "iconButtonTestTag", "Landroid/content/Context;", "context", "onValueChanged", "Lmx/a;", "contentDescription", "", "indexTag", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/lang/String;Landroid/content/Context;ZLer/l;Lmx/a;Ljava/lang/Integer;Ld60/c;Lm2/r;II)V", "Lkotlin/Function0;", "onClicked", "iconContentDescriptionContext", "Lv50/c$c$a;", "iconContentDescription", "F", "(Ljava/lang/String;ZZLandroid/content/Context;Ler/a;Lmx/a;Lv50/c$c$a;Ljava/lang/Integer;Ld60/c;Lm2/r;II)V", "text", "Lj70/a;", "accessibilityReadMode", "Lq4/e;", "o0", "(Ljava/lang/String;Lj70/a;)Lq4/e;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f195367a;

        a(boolean z15) {
            this.f195367a = z15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            long jK;
            rVar.X(-364274211);
            if (p076m2.t.k()) {
                p076m2.t.o(-364274211, i15, -1, "pl.gov.coi.common.ui.ds.textinput.PasswordIconButton.<anonymous> (TextField.kt:513)");
            }
            if (this.f195367a) {
                rVar.X(2119803719);
                jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVar.R();
            } else {
                rVar.X(2119805414);
                jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jK;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f195368a;

        b(boolean z15) {
            this.f195368a = z15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            long jK;
            rVar.X(-57349869);
            if (p076m2.t.k()) {
                p076m2.t.o(-57349869, i15, -1, "pl.gov.coi.common.ui.ds.textinput.RemoveIconButton.<anonymous> (TextField.kt:446)");
            }
            if (this.f195368a) {
                rVar.X(721352957);
                jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVar.R();
            } else {
                rVar.X(721354652);
                jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jK;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f195369a;

        c(boolean z15) {
            this.f195369a = z15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            long jK;
            rVar.X(-1368914512);
            if (p076m2.t.k()) {
                p076m2.t.o(-1368914512, i15, -1, "pl.gov.coi.common.ui.ds.textinput.SearchIcon.<anonymous>.<anonymous> (TextField.kt:394)");
            }
            if (this.f195369a) {
                rVar.X(-1266851110);
                jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVar.R();
            } else {
                rVar.X(-1266849351);
                jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().k();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jK;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b1.l f195371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d60.c f195372g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d60.c f195373a;

            a(d60.c cVar) {
                this.f195373a = cVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(b1.i iVar, tq.e<? super oq.i0> eVar) {
                Object objE;
                return ((iVar instanceof b1.n.c) && (objE = this.f195373a.e(true, eVar)) == uq.b.e()) ? objE : oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b1.l lVar, d60.c cVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f195371f = lVar;
            this.f195372g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f195370e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g<b1.i> gVarC = this.f195371f.c();
                a aVar = new a(this.f195372g);
                this.f195370e = 1;
                if (gVarC.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f195371f, this.f195372g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195374a;

        static {
            int[] iArr = new int[j70.a.values().length];
            try {
                iArr[j70.a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j70.a.LOWER_CASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j70.a.LETTER_BY_LETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f195374a = iArr;
        }
    }

    private static final void B(final v50.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        String str;
        p076m2.r rVarH = rVar.h(-592322003);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-592322003, i16, -1, "pl.gov.coi.common.ui.ds.textinput.Hint (TextField.kt:346)");
            }
            if (cVar.getValue().getText().length() == 0 && cVar.getEnabled() && cVar.getHint() != null) {
                rVarH.X(-1499724872);
                String testTag = cVar.getTestTag();
                if (testTag != null) {
                    str = testTag + "HintText";
                } else {
                    str = null;
                }
                String str2 = str;
                Label hint = cVar.getHint();
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                j70.h.g(null, str2, hint, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, MLKEMEngine.KyberPolyBytes, 28835801);
                rVar2 = rVarH;
            } else {
                rVar2 = rVarH;
                rVar2.X(-1512477528);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.C(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(v50.c cVar, int i15, p076m2.r rVar, int i16) {
        B(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void D(final v50.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        String str;
        p076m2.r rVarH = rVar.h(-350154508);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-350154508, i16, -1, "pl.gov.coi.common.ui.ds.textinput.LeftIcon (TextField.kt:268)");
            }
            if (cVar instanceof v50.c.Search) {
                rVarH.X(-1491030328);
                v50.c.Search search = (v50.c.Search) cVar;
                String testTag = search.getTestTag();
                if (testTag != null) {
                    str = testTag + "SearchIcon";
                } else {
                    str = null;
                }
                V(str, search.getEnabled(), rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(-1491026280);
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
            d5VarM.a(new er.p() { // from class: u50.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.E(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(v50.c cVar, int i15, p076m2.r rVar, int i16) {
        D(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void F(final String str, final boolean z15, boolean z16, final Context context, final er.a<oq.i0> aVar, final Label label, final v50.c.Password.IconContentDescription iconContentDescription, Integer num, final d60.c cVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        v50.c.Password.IconContentDescription iconContentDescription2;
        final Integer num2;
        final boolean z17;
        p076m2.r rVar2;
        Label whenPasswordHidden;
        Object obj;
        String str2;
        f6<Boolean> f6Var;
        int i18;
        String str3;
        final String str4 = str;
        p076m2.r rVarH = rVar.h(-1314372234);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(str4) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.a(z16) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(context) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.G(aVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.W(label) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            iconContentDescription2 = iconContentDescription;
            i17 |= rVarH.W(iconContentDescription2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            iconContentDescription2 = iconContentDescription;
        }
        int i19 = i16 & 128;
        if (i19 != 0) {
            i17 |= 12582912;
            num2 = num;
        } else {
            num2 = num;
            if ((i15 & 12582912) == 0) {
                i17 |= rVarH.W(num2) ? 8388608 : 4194304;
            }
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.W(cVar) ? 67108864 : 33554432;
        }
        if (rVarH.r((i17 & 38347923) != 38347922, i17 & 1)) {
            if (i19 != 0) {
                num2 = null;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1314372234, i17, -1, "pl.gov.coi.common.ui.ds.textinput.PasswordIconButton (TextField.kt:468)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = b1.k.a();
                rVarH.v(objE);
            }
            b1.l lVar = (b1.l) objE;
            final f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            final int i25 = z15 ? jz.a.f106832o : jz.a.f106825n;
            Label labelO = label.o(Label.INSTANCE.d());
            if (z15) {
                whenPasswordHidden = iconContentDescription2.getWhenPasswordVisible();
            } else {
                if (z15) {
                    throw new oq.p();
                }
                whenPasswordHidden = iconContentDescription2.getWhenPasswordHidden();
            }
            Label labelO2 = labelO.o(whenPasswordHidden);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            int i26 = i17;
            r3.a(androidx.compose.foundation.layout.d.y(companion2, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
            f3.m mVarC = w0.q0.c(d60.c.INSTANCE.b(companion2, cVar), z16, null, 2, null);
            boolean zW = rVarH.W(f6VarA) | ((i26 & 14) == 4) | rVarH.c(i25) | rVarH.G(context) | ((i26 & 29360128) == 8388608);
            Object objE2 = rVarH.E();
            if (zW || objE2 == companion.a()) {
                str2 = null;
                obj = new er.l() { // from class: u50.h
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.G(f6VarA, str, i25, context, num2, (n4.i0) obj2);
                    }
                };
                f6Var = f6VarA;
                str4 = str;
                i18 = i25;
                rVarH.v(obj);
            } else {
                i18 = i25;
                obj = objE2;
                str2 = null;
                str4 = str;
                f6Var = f6VarA;
            }
            f3.m mVarD = n4.v.d(mVarC, false, (er.l) obj, 1, str2);
            d40.i.b bVar = d40.i.b.f39705e;
            rVar2 = rVarH;
            String str5 = str2;
            f3.m mVarL = androidx.compose.foundation.b.l(t70.s.o(mVarD, f6Var, c5.h.j(bVar.getDimension())), lVar, t70.s.E(bVar.getDimension(), rVarH, 0, 0), z16, null, n4.l.j(n4.l.INSTANCE.a()), aVar, 8, null);
            z17 = z16;
            if (str4 != null) {
                str3 = str4 + "Icon";
            } else {
                str3 = str5;
            }
            d40.h.f(mVarL, new d40.b.C0864b(str3, i18, d40.i.f.f39709e, new a(z17), labelO2, null, 32, null), false, rVar2, 0, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            z17 = z16;
            rVar2 = rVarH;
            rVar2.O();
        }
        final Integer num3 = num2;
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.i
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return b0.H(str4, z15, z17, context, aVar, label, iconContentDescription, num3, cVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    public static final oq.i0 G(f6 f6Var, String str, int i15, Context context, Integer num, n4.i0 i0Var) {
        String str2;
        if (((Boolean) f6Var.getValue()).booleanValue()) {
            n4.g0.a(i0Var, true);
            if (str == null) {
                String strA = t70.y.a(Integer.valueOf(i15), context);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(strA);
                if (num != null) {
                    str2 = "_$" + num.intValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    str2 = "";
                }
                sb5.append(str2);
                str = sb5.toString();
            }
            n4.f0.y0(i0Var, str);
        } else {
            t70.i.A(i0Var);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(String str, boolean z15, boolean z16, Context context, er.a aVar, Label label, v50.c.Password.IconContentDescription iconContentDescription, Integer num, d60.c cVar, int i15, int i16, p076m2.r rVar, int i17) {
        F(str, z15, z16, context, aVar, label, iconContentDescription, num, cVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void I(final v50.c.Masked masked, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        String str;
        p076m2.r rVarH = rVar.h(1088985427);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(masked) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1088985427, i16, -1, "pl.gov.coi.common.ui.ds.textinput.Placeholder (TextField.kt:361)");
            }
            if (masked.getValue().getText().length() == 0) {
                rVarH.X(1163368220);
                f3.m.Companion companion = f3.m.INSTANCE;
                boolean zG = rVarH.G(masked);
                Object objE = rVarH.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: u50.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return b0.J(masked, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
                String testTag = masked.getTestTag();
                if (testTag != null) {
                    str = testTag + "PlaceholderText";
                } else {
                    str = null;
                }
                Label labelN = masked.getMaskType().n();
                Label hint = labelN.l() ? labelN : null;
                if (hint == null) {
                    hint = masked.getHint();
                }
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                j70.h.g(mVarD, str, hint, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, MLKEMEngine.KyberPolyBytes, 28835800);
                rVar2 = rVarH;
            } else {
                rVar2 = rVarH;
                rVar2.X(1150236930);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.K(masked, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(v50.c.Masked masked, n4.i0 i0Var) {
        if (masked.getMaskType() == w50.a.POST_CODE) {
            t70.i.A(i0Var);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(v50.c.Masked masked, int i15, p076m2.r rVar, int i16) {
        I(masked, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0105  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x015a  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:0x016b  */
    /* JADX WARN: Code duplicated, block: B:99:0x018c  */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x018c, please report this as an issue */
    private static final void L(final String str, final Context context, boolean z15, final er.l<? super String, oq.i0> lVar, final Label label, Integer num, final d60.c cVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        Integer num2;
        boolean z16;
        final boolean z17;
        p076m2.r rVar2;
        final Integer num3;
        d5 d5VarM;
        final Integer num4;
        Object objE;
        p076m2.r.Companion companion;
        Object objE2;
        boolean z18;
        boolean z19;
        boolean z25;
        Object objE3;
        boolean z26;
        Object objE4;
        String str2;
        int i18;
        p076m2.r rVarH = rVar.h(155534938);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(context) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(lVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.W(label) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i19 = i16 & 32;
        if (i19 == 0) {
            if ((196608 & i15) == 0) {
                num2 = num;
                i17 |= rVarH.W(num2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
            }
            if ((i15 & 1572864) == 0) {
                if (rVarH.W(cVar)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i18;
            }
            if ((i17 & 599187) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i19 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(155534938, i17, -1, "pl.gov.coi.common.ui.ds.textinput.RemoveIconButton (TextField.kt:416)");
                }
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = b1.k.a();
                    rVarH.v(objE);
                }
                b1.l lVar2 = (b1.l) objE;
                f6<Boolean> f6VarA = b1.f.a(lVar2, rVarH, 6);
                f3.m mVarB = d60.c.INSTANCE.b(w0.q0.c(f3.m.INSTANCE, z15, null, 2, null), cVar);
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new er.l() { // from class: u50.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return b0.M((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                f3.m mVarD = n4.v.d(mVarB, false, (er.l) objE2, 1, null);
                if ((i17 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zG = rVarH.G(context) | z18;
                if ((458752 & i17) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z25 = zG | z19;
                objE3 = rVarH.E();
                if (z25 || objE3 == companion.a()) {
                    objE3 = new er.l() { // from class: u50.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return b0.N(str, context, num4, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                f3.m mVarD2 = n4.v.d(mVarD, false, (er.l) objE3, 1, null);
                d40.i.b bVar = d40.i.b.f39705e;
                f3.m mVarO = t70.s.o(mVarD2, f6VarA, c5.h.j(bVar.getDimension()));
                r1 r1VarE = t70.s.E(bVar.getDimension(), rVarH, 0, 0);
                n4.l lVarJ = n4.l.j(n4.l.INSTANCE.a());
                if ((i17 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objE4 = rVarH.E();
                if (z26 || objE4 == companion.a()) {
                    objE4 = new er.a() { // from class: u50.m
                        @Override // er.a
                        public final Object a() {
                            return b0.O(lVar);
                        }
                    };
                    rVarH.v(objE4);
                }
                Integer num5 = num4;
                str2 = null;
                f3.m mVarL = androidx.compose.foundation.b.l(mVarO, lVar2, r1VarE, z15, null, lVarJ, (er.a) objE4, 8, null);
                z17 = z15;
                if (str != null) {
                    str2 = str + "Icon";
                }
                rVar2 = rVarH;
                d40.h.f(mVarL, new d40.b.C0864b(str2, jz.a.f106804k, d40.i.f.f39709e, new b(z17), label, null, 32, null), false, rVar2, 0, 4);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                num3 = num5;
            } else {
                z17 = z15;
                rVar2 = rVarH;
                rVar2.O();
                num3 = num2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: u50.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b0.P(str, context, z17, lVar, label, num3, cVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        num2 = num;
        if ((i15 & 1572864) == 0) {
            if (rVarH.W(cVar)) {
                i18 = PKIFailureInfo.badCertTemplate;
            } else {
                i18 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i18;
        }
        if ((i17 & 599187) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            if (i19 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(155534938, i17, -1, "pl.gov.coi.common.ui.ds.textinput.RemoveIconButton (TextField.kt:416)");
            }
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = b1.k.a();
                rVarH.v(objE);
            }
            b1.l lVar3 = (b1.l) objE;
            f6<Boolean> f6VarA2 = b1.f.a(lVar3, rVarH, 6);
            f3.m mVarB2 = d60.c.INSTANCE.b(w0.q0.c(f3.m.INSTANCE, z15, null, 2, null), cVar);
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.l() { // from class: u50.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.M((n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarD3 = n4.v.d(mVarB2, false, (er.l) objE2, 1, null);
            if ((i17 & 14) == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean zG2 = rVarH.G(context) | z18;
            if ((458752 & i17) == 131072) {
                z19 = true;
            } else {
                z19 = false;
            }
            z25 = zG2 | z19;
            objE3 = rVarH.E();
            if (z25) {
                objE3 = new er.l() { // from class: u50.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.N(str, context, num4, (n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.l() { // from class: u50.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.N(str, context, num4, (n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            f3.m mVarD4 = n4.v.d(mVarD3, false, (er.l) objE3, 1, null);
            d40.i.b bVar2 = d40.i.b.f39705e;
            f3.m mVarO2 = t70.s.o(mVarD4, f6VarA2, c5.h.j(bVar2.getDimension()));
            r1 r1VarE2 = t70.s.E(bVar2.getDimension(), rVarH, 0, 0);
            n4.l lVarJ2 = n4.l.j(n4.l.INSTANCE.a());
            if ((i17 & 7168) == 2048) {
                z26 = true;
            } else {
                z26 = false;
            }
            objE4 = rVarH.E();
            if (z26) {
                objE4 = new er.a() { // from class: u50.m
                    @Override // er.a
                    public final Object a() {
                        return b0.O(lVar);
                    }
                };
                rVarH.v(objE4);
            } else {
                objE4 = new er.a() { // from class: u50.m
                    @Override // er.a
                    public final Object a() {
                        return b0.O(lVar);
                    }
                };
                rVarH.v(objE4);
            }
            Integer num6 = num4;
            str2 = null;
            f3.m mVarL2 = androidx.compose.foundation.b.l(mVarO2, lVar3, r1VarE2, z15, null, lVarJ2, (er.a) objE4, 8, null);
            z17 = z15;
            if (str != null) {
                str2 = str + "Icon";
            }
            rVar2 = rVarH;
            d40.h.f(mVarL2, new d40.b.C0864b(str2, jz.a.f106804k, d40.i.f.f39709e, new b(z17), label, null, 32, null), false, rVar2, 0, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            num3 = num6;
        } else {
            z17 = z15;
            rVar2 = rVarH;
            rVar2.O();
            num3 = num2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.P(str, context, z17, lVar, label, num3, cVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(n4.i0 i0Var) {
        n4.g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    public static final oq.i0 N(String str, Context context, Integer num, n4.i0 i0Var) {
        String string;
        if (str == null) {
            String strA = t70.y.a(Integer.valueOf(jz.a.f106804k), context);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(strA);
            if (num != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append('_');
                sb6.append(num.intValue());
                string = sb6.toString();
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
            sb5.append(string);
            str = sb5.toString();
        }
        n4.f0.y0(i0Var, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(er.l lVar) {
        lVar.b("");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(String str, Context context, boolean z15, er.l lVar, Label label, Integer num, d60.c cVar, int i15, int i16, p076m2.r rVar, int i17) {
        L(str, context, z15, lVar, label, num, cVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void Q(final v50.c cVar, final boolean z15, final boolean z16, final boolean z17, final d60.c cVar2, final er.l<? super Boolean, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        String str;
        String str2;
        p076m2.r rVarH = rVar.h(-209463290);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(cVar) ? 4 : 2) | i15;
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
            i16 |= rVarH.a(z17) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.W(cVar2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(lVar) ? 131072 : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-209463290, i16, -1, "pl.gov.coi.common.ui.ds.textinput.RightIcon (TextField.kt:302)");
            }
            Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            final yw.b bVarU = t70.i.u(context);
            if (z16 && (z15 || cVar2.j())) {
                rVarH.X(467014490);
                String testTag = cVar.getTestTag();
                if (testTag != null) {
                    str2 = testTag + "RemoveIconButton";
                } else {
                    str2 = null;
                }
                boolean enabled = cVar.getEnabled();
                er.l<String, oq.i0> lVarN = cVar.n();
                Integer indexTag = cVar.getIndexTag();
                Label labelC = c70.a.f23835a.a().C();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(labelC.getText());
                sb5.append(' ');
                Label label = cVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String();
                String text = label != null ? label.getText() : null;
                if (text == null) {
                    text = "";
                }
                sb5.append(text);
                L(str2, context, enabled, lVarN, mx.b.b(fu.r.u1(sb5.toString()).toString(), labelC.getTag()), indexTag, cVar2, rVarH, (i16 << 6) & 3670016, 0);
                rVarH = rVarH;
                rVarH.R();
            } else {
                if (cVar instanceof v50.c.Password) {
                    rVarH.X(569270441);
                    v50.c.Password password = (v50.c.Password) cVar;
                    String testTag2 = password.getTestTag();
                    if (testTag2 != null) {
                        str = testTag2 + "PasswordIconButton";
                    } else {
                        str = null;
                    }
                    boolean enabled2 = password.getEnabled();
                    boolean zG = ((i16 & 7168) == 2048) | rVarH.G(cVar) | rVarH.G(bVarU) | ((458752 & i16) == 131072);
                    Object objE = rVarH.E();
                    if (zG || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: u50.a0
                            @Override // er.a
                            public final Object a() {
                                return b0.R(z17, cVar, bVarU, lVar);
                            }
                        };
                        rVarH.v(objE);
                    }
                    er.a aVar = (er.a) objE;
                    Label labelC2 = password.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String();
                    if (labelC2 == null) {
                        labelC2 = Label.INSTANCE.c();
                    }
                    v50.c.Password.IconContentDescription iconContentDescription = password.getIconContentDescription();
                    int i17 = i16;
                    F(str, z17, enabled2, context, aVar, labelC2, iconContentDescription, cVar.getIndexTag(), cVar2, rVarH, ((i17 << 12) & 234881024) | ((i17 >> 6) & 112), 0);
                } else {
                    rVarH.X(455772092);
                }
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
            d5VarM.a(new er.p() { // from class: u50.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.S(cVar, z15, z16, z17, cVar2, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(boolean z15, v50.c cVar, yw.b bVar, er.l lVar) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(z15 ? c70.a.f23835a.a().P0().getText() : c70.a.f23835a.a().E().getText());
        sb5.append(Label.INSTANCE.d().getText());
        v50.c.Password password = (v50.c.Password) cVar;
        sb5.append(t70.s.O(password.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String()));
        bVar.a(sb5.toString());
        lVar.b(Boolean.valueOf(!z15));
        password.B().b(Boolean.valueOf(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(v50.c cVar, boolean z15, boolean z16, boolean z17, d60.c cVar2, er.l lVar, int i15, p076m2.r rVar, int i16) {
        Q(cVar, z15, z16, z17, cVar2, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void T(final v50.c cVar, final boolean z15, final boolean z16, final d60.c cVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1395558121);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(cVar) ? 4 : 2) | i15;
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
            i16 |= rVarH.W(cVar2) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1395558121, i16, -1, "pl.gov.coi.common.ui.ds.textinput.RightIconSpace (TextField.kt:285)");
            }
            if ((cVar instanceof v50.c.Password) || (z15 && (z16 || cVar2.j()))) {
                rVarH.X(211680341);
                f3.m.Companion companion = f3.m.INSTANCE;
                r3.a(androidx.compose.foundation.layout.d.y(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                d1.r.b(androidx.compose.foundation.layout.d.t(companion, d40.i.f.f39709e.getDimension()), rVarH, 0);
            } else {
                rVarH.X(201015659);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.U(cVar, z15, z16, cVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(v50.c cVar, boolean z15, boolean z16, d60.c cVar2, int i15, p076m2.r rVar, int i16) {
        T(cVar, z15, z16, cVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void V(final String str, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-460379877);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-460379877, i16, -1, "pl.gov.coi.common.ui.ds.textinput.SearchIcon (TextField.kt:386)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, 0);
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
            rVar2 = rVarH;
            d40.h.f(null, new d40.b.C0864b(str, jz.a.S, d40.i.f.f39709e, new c(z15), Label.INSTANCE.c(), null, 32, null), false, rVar2, 0, 5);
            r3.a(androidx.compose.foundation.layout.d.y(companion, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
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
            d5VarM.a(new er.p() { // from class: u50.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.W(str, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(String str, boolean z15, int i15, p076m2.r rVar, int i16) {
        V(str, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0288  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0104  */
    /* JADX WARN: Code duplicated, block: B:78:0x0116  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0141  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157  */
    /* JADX WARN: Code duplicated, block: B:88:0x0174  */
    /* JADX WARN: Code duplicated, block: B:89:0x018e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0194  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x0277  */
    public static final void X(final v50.c cVar, final d60.c cVar2, final l3.o oVar, er.l<? super l3.l0, oq.i0> lVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final l3.o oVar2;
        er.l<? super l3.l0, oq.i0> lVar2;
        boolean z15;
        p076m2.r rVar2;
        final er.l<? super l3.l0, oq.i0> lVar3;
        d5 d5VarM;
        er.l<? super l3.l0, oq.i0> lVar4;
        Object objE;
        p076m2.r.Companion companion;
        Object objE2;
        final b1.l lVar5;
        final boolean z16;
        Object objE3;
        float strokeWidth;
        long jA;
        boolean z17;
        Object objE4;
        Object objE5;
        p076m2.r rVarH = rVar.h(-1543859771);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(cVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            oVar2 = oVar;
            i17 |= rVarH.G(oVar2) ? 256 : 128;
        } else {
            oVar2 = oVar;
        }
        int i18 = i16 & 8;
        if (i18 == 0) {
            if ((i15 & 3072) == 0) {
                lVar2 = lVar;
                i17 |= rVarH.G(lVar2) ? 2048 : 1024;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.l() { // from class: u50.p
                            @Override // er.l
                            public final Object b(Object obj) {
                                return b0.Y((l3.l0) obj);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    lVar4 = (er.l) objE5;
                } else {
                    lVar4 = lVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1543859771, i17, -1, "pl.gov.coi.common.ui.ds.textinput.TextField (TextField.kt:83)");
                }
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(Boolean.FALSE, null, 2, null);
                    rVarH.v(objE);
                }
                final a3 a3Var = (a3) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = b1.k.a();
                    rVarH.v(objE2);
                }
                lVar5 = (b1.l) objE2;
                final d60.c cVarB = d60.e.b(false, null, rVarH, 0, 3);
                if (cVar.getValue().getText().length() > 0 || (cVar instanceof v50.c.Password) || !cVar.getRemovableIconVisible()) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (cVar2.j()) {
                    rVarH.X(1678812684);
                    if ((i17 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE4 = rVarH.E();
                    if (z17 || objE4 == companion.a()) {
                        objE4 = new d(lVar5, cVar2, null);
                        rVarH.v(objE4);
                    }
                    Function0.d(lVar5, (er.p) objE4, rVarH, 6);
                } else {
                    rVarH.X(1674450333);
                }
                rVarH.R();
                f3.m mVarC = w0.q0.c(f3.m.INSTANCE, false, null, 2, null);
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new er.l() { // from class: u50.q
                        @Override // er.l
                        public final Object b(Object obj) {
                            return b0.b0((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                f3.m mVarD = n4.v.d(mVarC, false, (er.l) objE3, 1, null);
                if (cVar2.j()) {
                    rVarH.X(-1885492562);
                    strokeWidth = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing25();
                    rVarH.R();
                } else {
                    rVarH.X(-1885491088);
                    strokeWidth = k70.a.f108864a.b(rVarH, k70.a.f108865b).getStrokeWidth();
                    rVarH.R();
                }
                if (cVar.getValidationState() instanceof hz.b.Invalid) {
                    rVarH.X(-1885487087);
                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                    rVarH.R();
                } else if (cVar2.j()) {
                    rVarH.X(-1885485012);
                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getPrimary();
                    rVarH.R();
                } else if (cVar.getEnabled()) {
                    rVarH.X(-1885481586);
                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a();
                    rVarH.R();
                } else {
                    rVarH.X(-1885483186);
                    jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g();
                    rVarH.R();
                }
                BorderStroke borderStrokeA = w0.x.a(strokeWidth, jA);
                k70.a aVar = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                y2 radius150 = aVar.e(rVarH, i19).getRadius150();
                y1 y1Var = y1.f58315a;
                long jA2 = aVar.a(rVarH, i19).getSurface().a();
                int i25 = y1.f58316b;
                x1 x1VarB = y1Var.b(jA2, 0L, 0L, 0L, rVarH, i25 << 12, 14);
                z1 z1VarC = y1Var.c(aVar.c(rVarH, i19).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i25 << 18, 62);
                final er.l<? super l3.l0, oq.i0> lVar6 = lVar4;
                rVar2 = rVarH;
                c2.c(mVarD, radius150, x1VarB, z1VarC, borderStrokeA, y2.m.d(1022663991, true, new er.q() { // from class: u50.r
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return b0.c0(z16, cVar, cVarB, cVar2, lVar6, oVar2, lVar5, a3Var, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, 196608, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                lVar3 = lVar6;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                lVar3 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: u50.s
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b0.m0(cVar, cVar2, oVar, lVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        lVar2 = lVar;
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                objE5 = rVarH.E();
                if (objE5 == p076m2.r.INSTANCE.a()) {
                    objE5 = new er.l() { // from class: u50.p
                        @Override // er.l
                        public final Object b(Object obj) {
                            return b0.Y((l3.l0) obj);
                        }
                    };
                    rVarH.v(objE5);
                }
                lVar4 = (er.l) objE5;
            } else {
                lVar4 = lVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1543859771, i17, -1, "pl.gov.coi.common.ui.ds.textinput.TextField (TextField.kt:83)");
            }
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE);
            }
            final a3 a3Var2 = (a3) objE;
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = b1.k.a();
                rVarH.v(objE2);
            }
            lVar5 = (b1.l) objE2;
            final d60.c cVarB2 = d60.e.b(false, null, rVarH, 0, 3);
            if (cVar.getValue().getText().length() > 0) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (cVar2.j()) {
                rVarH.X(1678812684);
                if ((i17 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE4 = rVarH.E();
                if (z17) {
                    objE4 = new d(lVar5, cVar2, null);
                    rVarH.v(objE4);
                } else {
                    objE4 = new d(lVar5, cVar2, null);
                    rVarH.v(objE4);
                }
                Function0.d(lVar5, (er.p) objE4, rVarH, 6);
            } else {
                rVarH.X(1674450333);
            }
            rVarH.R();
            f3.m mVarC2 = w0.q0.c(f3.m.INSTANCE, false, null, 2, null);
            objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new er.l() { // from class: u50.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.b0((n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            f3.m mVarD2 = n4.v.d(mVarC2, false, (er.l) objE3, 1, null);
            if (cVar2.j()) {
                rVarH.X(-1885492562);
                strokeWidth = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing25();
                rVarH.R();
            } else {
                rVarH.X(-1885491088);
                strokeWidth = k70.a.f108864a.b(rVarH, k70.a.f108865b).getStrokeWidth();
                rVarH.R();
            }
            if (cVar.getValidationState() instanceof hz.b.Invalid) {
                rVarH.X(-1885487087);
                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else if (cVar2.j()) {
                rVarH.X(-1885485012);
                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getPrimary();
                rVarH.R();
            } else if (cVar.getEnabled()) {
                rVarH.X(-1885483186);
                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g();
                rVarH.R();
            } else {
                rVarH.X(-1885481586);
                jA = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a();
                rVarH.R();
            }
            BorderStroke borderStrokeA2 = w0.x.a(strokeWidth, jA);
            k70.a aVar2 = k70.a.f108864a;
            int i110 = k70.a.f108865b;
            y2 radius151 = aVar2.e(rVarH, i110).getRadius150();
            y1 y1Var2 = y1.f58315a;
            long jA3 = aVar2.a(rVarH, i110).getSurface().a();
            int i26 = y1.f58316b;
            x1 x1VarB2 = y1Var2.b(jA3, 0L, 0L, 0L, rVarH, i26 << 12, 14);
            z1 z1VarC2 = y1Var2.c(aVar2.c(rVarH, i110).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i26 << 18, 62);
            final er.l lVar7 = lVar4;
            rVar2 = rVarH;
            c2.c(mVarD2, radius151, x1VarB2, z1VarC2, borderStrokeA2, y2.m.d(1022663991, true, new er.q() { // from class: u50.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return b0.c0(z16, cVar, cVarB2, cVar2, lVar7, oVar2, lVar5, a3Var2, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, 196608, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            lVar3 = lVar7;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            lVar3 = lVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.m0(cVar, cVar2, oVar, lVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(l3.l0 l0Var) {
        return oq.i0.f148189a;
    }

    private static final boolean Z(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void a0(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final boolean z15, final v50.c cVar, final d60.c cVar2, final d60.c cVar3, final er.l lVar, l3.o oVar, b1.l lVar2, final a3 a3Var, d1.h0 h0Var, p076m2.r rVar, int i15) {
        e1 e1VarC;
        long jD;
        Label message;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1022663991, i15, -1, "pl.gov.coi.common.ui.ds.textinput.TextField.<anonymous> (TextField.kt:127)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarC = w0.q0.c(companion, false, null, 2, null);
            Object objE = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: u50.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.d0((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarC, false, (er.l) objE, 1, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.x xVar = d1.x.f39368a;
            d60.c.Companion companion5 = d60.c.INSTANCE;
            f3.m mVarF = t70.i.F(companion, l3.g.INSTANCE.h(), rVar, 6);
            boolean zA = rVar.a(z15) | rVar.G(cVar) | rVar.W(cVar2);
            Object objE2 = rVar.E();
            if (zA || objE2 == companion2.a()) {
                objE2 = new er.a() { // from class: u50.l
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(b0.e0(z15, cVar, cVar2));
                    }
                };
                rVar.v(objE2);
            }
            f3.m mVarZ = t70.i.z(companion5.b(t70.i.D(mVarF, (er.a) objE2, rVar, 0), cVar3), cVar, rVar, 0);
            boolean zG = rVar.G(cVar);
            Object objE3 = rVar.E();
            if (zG || objE3 == companion2.a()) {
                objE3 = new er.l() { // from class: u50.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.f0(cVar, (n4.i0) obj);
                    }
                };
                rVar.v(objE3);
            }
            f3.m mVarD2 = n4.v.d(mVarZ, false, (er.l) objE3, 1, null);
            boolean zG2 = rVar.G(cVar);
            Object objE4 = rVar.E();
            if (zG2 || objE4 == companion2.a()) {
                objE4 = new er.l() { // from class: u50.u
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.g0(cVar, (n4.i0) obj);
                    }
                };
                rVar.v(objE4);
            }
            f3.m mVarD3 = n4.v.d(mVarD2, false, (er.l) objE4, 1, null);
            hz.b validationState = cVar.getValidationState();
            hz.b.Invalid invalid = validationState instanceof hz.b.Invalid ? (hz.b.Invalid) validationState : null;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(t70.i.G(mVarD3, (invalid == null || (message = invalid.getMessage()) == null) ? null : t70.s.O(message), rVar, 0), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarK = androidx.compose.foundation.layout.d.k(mVarH, aVar.b(rVar, i16).getSpacing700(), 0.0f, 2, null);
            boolean zW = rVar.W(lVar);
            Object objE5 = rVar.E();
            if (zW || objE5 == companion2.a()) {
                objE5 = new er.l() { // from class: u50.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.h0(lVar, (l3.l0) obj);
                    }
                };
                rVar.v(objE5);
            }
            f3.m mVarA = l3.e.a(mVarK, (er.l) objE5);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, cVar.getKeyboardType(), cVar.getImeAction(), null, null, null, 115, null);
            l3 l3VarB = cVar.i().b(oVar);
            String text = cVar.getValue().getText();
            if (cVar instanceof v50.c.Masked) {
                e1VarC = new w50.b(((v50.c.Masked) cVar).getMaskType());
            } else {
                e1VarC = (!(cVar instanceof v50.c.Password) || Z(a3Var)) ? e1.INSTANCE.c() : new v4.k0((char) 0, 1, null);
            }
            e1 e1Var = e1VarC;
            boolean enabled = cVar.getEnabled();
            TextStyle textStyleB = aVar.f(rVar, i16).b();
            if (cVar.getEnabled()) {
                rVar.X(-1176906487);
                jD = aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                rVar.R();
            } else {
                rVar.X(-1176841015);
                jD = aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                rVar.R();
            }
            long j15 = jD;
            b5.j textAlign = cVar.getTextAlign();
            TextStyle textStyleE = TextStyle.e(textStyleB, j15, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, textAlign != null ? textAlign.getValue() : b5.j.INSTANCE.f(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            boolean singleLine = cVar.getSingleLine();
            SolidColor solidColor = new SolidColor(aVar.a(rVar, i16).getBase().getPrimary(), null);
            boolean zG3 = rVar.G(cVar);
            Object objE6 = rVar.E();
            if (zG3 || objE6 == companion2.a()) {
                objE6 = new er.l() { // from class: u50.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.i0(cVar, (String) obj);
                    }
                };
                rVar.v(objE6);
            }
            p079n1.u.h(text, (er.l) objE6, mVarA, enabled, false, textStyleE, keyboardOptions, l3VarB, singleLine, 0, 0, e1Var, null, lVar2, solidColor, y2.m.d(-1904503238, true, new er.q() { // from class: u50.x
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return b0.j0(cVar, cVar3, z15, cVar2, (er.p) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 0, 199680, 5648);
            Object objE7 = rVar.E();
            if (objE7 == companion2.a()) {
                objE7 = new er.l() { // from class: u50.y
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.k0((n4.i0) obj);
                    }
                };
                rVar.v(objE7);
            }
            f3.m mVarN = d1.a3.n(androidx.compose.foundation.layout.d.h(n4.v.d(companion, false, (er.l) objE7, 1, null), 0.0f, 1, null), aVar.b(rVar, i16).getSpacing200());
            w0 w0VarI2 = d1.r.i(companion3.f(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarI2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            boolean zJ = cVar3.j();
            boolean Z = Z(a3Var);
            Object objE8 = rVar.E();
            if (objE8 == companion2.a()) {
                objE8 = new er.l() { // from class: u50.z
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.l0(a3Var, ((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE8);
            }
            Q(cVar, zJ, z15, Z, cVar2, (er.l) objE8, rVar, 196608);
            rVar.x();
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
    public static final oq.i0 d0(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e0(boolean z15, v50.c cVar, d60.c cVar2) {
        if (!z15 && !(cVar instanceof v50.c.Password)) {
            return false;
        }
        cVar2.l();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    public static final oq.i0 f0(v50.c cVar, n4.i0 i0Var) {
        String string;
        n4.g0.a(i0Var, true);
        String testTag = cVar.getTestTag();
        if (testTag == null) {
            Label label = cVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String();
            String str = (label != null ? label.getTag() : null) + "EditText";
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            if (cVar.getIndexTag() != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append('_');
                sb6.append(cVar.getIndexTag());
                string = sb6.toString();
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
            sb5.append(string);
            testTag = sb5.toString();
        }
        n4.f0.y0(i0Var, testTag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(v50.c cVar, n4.i0 i0Var) {
        n4.f0.c0(i0Var, n0(cVar));
        n4.f0.g0(i0Var, o0(cVar.getValue().getText(), cVar.getAccessibilityReadMode()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(er.l lVar, l3.l0 l0Var) {
        lVar.b(l0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(v50.c cVar, String str) {
        if (!(cVar instanceof v50.c.Masked) || ((v50.c.Masked) cVar).getMaskType().j(str)) {
            cVar.n().b(str);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(v50.c cVar, d60.c cVar2, boolean z15, d60.c cVar3, er.p pVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.G(pVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1904503238, i16, -1, "pl.gov.coi.common.ui.ds.textinput.TextField.<anonymous>.<anonymous>.<anonymous> (TextField.kt:209)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(d1.a3.n(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.j(), !cVar.getSingleLine() ? f3.c.INSTANCE.l() : f3.c.INSTANCE.i(), rVar, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            D(cVar, rVar, 0);
            if (cVar instanceof v50.c.Masked) {
                rVar.X(-2059744125);
                f3.m mVarC = p3.c(q3Var, companion, 1.0f, false, 2, null);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarC);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
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
                n6.i(rVarC2, w0VarI, companion2.d());
                n6.i(rVarC2, e0VarT2, companion2.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                n6.g(rVarC2, companion2.a());
                n6.i(rVarC2, mVarE2, companion2.e());
                d1.x xVar = d1.x.f39368a;
                I((v50.c.Masked) cVar, rVar, 0);
                pVar.B(rVar, Integer.valueOf(i16 & 14));
                rVar.x();
                rVar.R();
            } else {
                rVar.X(-2059738596);
                f3.m mVarC2 = p3.c(q3Var, companion, 1.0f, false, 2, null);
                w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT3 = rVar.t();
                f3.m mVarE3 = f3.j.e(rVar, mVarC2);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion2.b();
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
                n6.i(rVarC3, w0VarI2, companion2.d());
                n6.i(rVarC3, e0VarT3, companion2.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion2.c());
                n6.g(rVarC3, companion2.a());
                n6.i(rVarC3, mVarE3, companion2.e());
                d1.x xVar2 = d1.x.f39368a;
                B(cVar, rVar, 0);
                pVar.B(rVar, Integer.valueOf(i16 & 14));
                rVar.x();
                rVar.R();
            }
            T(cVar, z15, cVar2.j(), cVar3, rVar, 0);
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
    public static final oq.i0 k0(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(a3 a3Var, boolean z15) {
        a0(a3Var, z15);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(v50.c cVar, d60.c cVar2, l3.o oVar, er.l lVar, int i15, int i16, p076m2.r rVar, int i17) {
        X(cVar, cVar2, oVar, lVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final String n0(v50.c cVar) {
        return fu.r.u1(t70.s.O(cVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String()) + t70.s.O(cVar.getLabelContentDescription()) + t70.s.O(cVar.getHelperText())).toString();
    }

    private static final q4.e o0(String str, j70.a aVar) {
        int i15 = e.f195374a[aVar.ordinal()];
        if (i15 == 1) {
            return new q4.e(str, null, 2, null);
        }
        if (i15 == 2) {
            return new q4.e(str.toLowerCase(Locale.ROOT), null, 2, null);
        }
        if (i15 == 3) {
            return new q4.e(dz.e.g(str, 1, " "), null, 2, null);
        }
        throw new oq.p();
    }
}
