package p046f2;

import androidx.compose.foundation.layout.d;
import b3.f;
import b3.x;
import c5.h;
import d1.d3;
import er.l;
import er.p;
import f3.m;
import h2.CalendarDate;
import h2.DateInputFormat;
import h2.a2;
import h2.b2;
import h2.l0;
import java.util.Locale;
import ju.p0;
import ju.z0;
import l3.d0;
import l3.g0;
import lr.i;
import n4.f0;
import n4.v;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p079n1.KeyboardOptions;
import q4.a4;
import q4.z3;
import tq.e;
import v4.TextFieldValue;
import v4.a0;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0011\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0095\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\n\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\"\u0010#\"\u001a\u0010)\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedDateMillis", "Lkotlin/Function1;", "Loq/i0;", "onDateSelectionChange", "Lh2/l0;", "calendarModel", "Llr/i;", "yearRange", "Lf2/h5;", "dateFormatter", "Lf2/pi;", "selectableDates", "Lf2/w4;", "colors", "Ll3/d0;", "focusRequester", "l", "(Ljava/lang/Long;Ler/l;Lh2/l0;Llr/i;Lf2/h5;Lf2/pi;Lf2/w4;Ll3/d0;Lm2/r;I)V", "Lf3/m;", "modifier", "initialDateMillis", "Lkotlin/Function0;", AnnotatedPrivateKey.LABEL, "placeholder", "Lf2/ed;", "inputIdentifier", "Lf2/u4;", "dateInputValidator", "Lh2/w0;", "dateInputFormat", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "r", "(Lf3/m;Ljava/lang/Long;Ler/l;Lh2/l0;Ler/p;Ler/p;ILf2/u4;Lh2/w0;Ljava/util/Locale;Lf2/w4;Ll3/d0;Lm2/r;II)V", "Ld1/d3;", "a", "Ld1/d3;", "B", "()Ld1/d3;", "InputTextFieldPadding", "Lc5/h;", "b", "F", "InputTextNonErroneousBottomPadding", "Lv4/t0;", "text", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d3 f57784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f57785b = h.n(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d0 f57787f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var, e<? super a> eVar) {
            super(2, eVar);
            this.f57787f = d0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f57786e;
            if (i15 == 0) {
                u.b(obj);
                if (this.f57787f != null) {
                    this.f57786e = 1;
                    if (z0.b(300L, this) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            d0.f(this.f57787f, 0, 1, null);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f57787f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Long f57789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l0 f57790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ DateInputFormat f57791h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Locale f57792j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a3<TextFieldValue> f57793k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Long l15, l0 l0Var, DateInputFormat dateInputFormat, Locale locale, a3<TextFieldValue> a3Var, e<? super b> eVar) {
            super(2, eVar);
            this.f57789f = l15;
            this.f57790g = l0Var;
            this.f57791h = dateInputFormat;
            this.f57792j = locale;
            this.f57793k = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f57788e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Long l15 = this.f57789f;
            if (l15 != null) {
                l0 l0Var = this.f57790g;
                DateInputFormat dateInputFormat = this.f57791h;
                Locale locale = this.f57792j;
                a3<TextFieldValue> a3Var = this.f57793k;
                String strA = l0Var.a(l15.longValue(), dateInputFormat.getPatternWithoutDelimiters(), locale);
                t4.u(a3Var, new TextFieldValue(strA, strA.length() == 0 ? z3.INSTANCE.a() : a4.b(strA.length(), strA.length()), (z3) null, 4, (fr.k) null));
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f57789f, this.f57790g, this.f57791h, this.f57792j, this.f57793k, eVar);
        }
    }

    static {
        float f15 = 24;
        f57784a = d1.a3.i(h.n(f15), h.n(10), h.n(f15), 0.0f, 8, null);
    }

    public static final d3 B() {
        return f57784a;
    }

    public static final void l(final Long l15, final l<? super Long, i0> lVar, final l0 l0Var, final i iVar, final h5 h5Var, final pi piVar, final w4 w4Var, final d0 d0Var, r rVar, final int i15) {
        int i16;
        i iVar2;
        pi piVar2;
        r rVar2;
        int i17;
        DateInputFormat dateInputFormat;
        int i18;
        r rVarH = rVar.h(-432341251);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(l15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(l0Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            iVar2 = iVar;
            i16 |= rVarH.G(iVar2) ? 2048 : 1024;
        } else {
            iVar2 = iVar;
        }
        if ((i15 & 24576) == 0) {
            i16 |= (i15 & 32768) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            piVar2 = piVar;
            i16 |= rVarH.W(piVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            piVar2 = piVar;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.W(w4Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.W(d0Var) ? 8388608 : 4194304;
        }
        if (rVarH.r((4793491 & i16) != 4793490, i16 & 1)) {
            if (t.k()) {
                t.o(-432341251, i16, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:67)");
            }
            boolean zW = rVarH.W(l0Var.getLocale());
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = l0Var.c(l0Var.getLocale());
                rVarH.v(objE);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objE;
            a2.Companion companion = a2.INSTANCE;
            String strB = b2.b(a2.a(ih.f56318h), rVarH, 0);
            String strB2 = b2.b(a2.a(ih.f56320j), rVarH, 0);
            String strB3 = b2.b(a2.a(ih.f56319i), rVarH, 0);
            boolean zW2 = rVarH.W(dateInputFormat2) | ((i16 & 57344) == 16384 || ((i16 & 32768) != 0 && rVarH.W(h5Var)));
            Object objE2 = rVarH.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                i17 = i16;
                dateInputFormat = dateInputFormat2;
                i18 = 0;
                u4 u4Var = new u4(iVar2, piVar2, dateInputFormat, h5Var, strB, strB2, strB3, "");
                rVarH.v(u4Var);
                objE2 = u4Var;
            } else {
                i17 = i16;
                dateInputFormat = dateInputFormat2;
                i18 = 0;
            }
            u4 u4Var2 = (u4) objE2;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            final String strB4 = b2.b(a2.a(ih.f56321k), rVarH, i18);
            m mVarL = d1.a3.l(d.h(m.INSTANCE, 0.0f, 1, null), f57784a);
            int iB = ed.INSTANCE.b();
            u4Var2.b(l15);
            int i19 = i17 << 3;
            rVar2 = rVarH;
            DateInputFormat dateInputFormat3 = dateInputFormat;
            r(mVarL, l15, lVar, l0Var, y2.m.d(-752164549, true, new p() { // from class: f2.i4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t4.m(strB4, upperCase, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-1179434278, true, new p() { // from class: f2.k4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t4.o(upperCase, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), iB, u4Var2, dateInputFormat3, l0Var.getLocale(), w4Var, d0Var, rVar2, (i19 & 7168) | (i19 & 112) | 1794054 | (i19 & 896), (i17 >> 18) & 126);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.l4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t4.q(l15, lVar, l0Var, iVar, h5Var, piVar, w4Var, d0Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final String str, final String str2, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-752164549, i15, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:93)");
            }
            m.Companion companion = m.INSTANCE;
            boolean zW = rVar.W(str) | rVar.W(str2);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.s4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t4.n(str, str2, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.d(companion, false, (l) objE, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262140);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(String str, String str2, n4.i0 i0Var) {
        f0.c0(i0Var, str + ", " + str2);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(String str, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1179434278, i15, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:98)");
            }
            m.Companion companion = m.INSTANCE;
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.j4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t4.p((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(str, v.a(companion, (l) objE), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262140);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Long l15, l lVar, l0 l0Var, i iVar, h5 h5Var, pi piVar, w4 w4Var, d0 d0Var, int i15, r rVar, int i16) {
        l(l15, lVar, l0Var, iVar, h5Var, piVar, w4Var, d0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final m mVar, Long l15, final l<? super Long, i0> lVar, final l0 l0Var, final p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, final int i15, final u4 u4Var, final DateInputFormat dateInputFormat, final Locale locale, final w4 w4Var, d0 d0Var, r rVar, final int i16, final int i17) {
        int i18;
        int i19;
        Long l16;
        r rVar2;
        d0 d0Var2;
        a3 a3Var;
        float fN;
        Object obj;
        final DateInputFormat dateInputFormat2;
        d0 d0Var3;
        m mVarA;
        Object bVar;
        final l0 l0Var2 = l0Var;
        r rVarH = rVar.h(1456309913);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.W(mVar) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.W(l15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.G(lVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= rVarH.G(l0Var2) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i18 |= rVarH.G(pVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i16 & 196608) == 0) {
            i18 |= rVarH.G(pVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i16 & 1572864) == 0) {
            i18 |= rVarH.c(i15) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i16 & 12582912) == 0) {
            i18 |= rVarH.W(u4Var) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i18 |= rVarH.W(dateInputFormat) ? 67108864 : 33554432;
        }
        if ((i16 & 805306368) == 0) {
            i18 |= rVarH.W(locale) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i17 & 6) == 0) {
            i19 = i17 | (rVarH.W(w4Var) ? 4 : 2);
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 |= rVarH.W(d0Var) ? 32 : 16;
        }
        int i25 = i19;
        if (rVarH.r(((i18 & 306783379) == 306783378 && (i25 & 19) == 18) ? false : true, i18 & 1)) {
            if (t.k()) {
                t.o(1456309913, i18, i25, "androidx.compose.material3.DateInputTextField (DateInput.kt:128)");
            }
            Object[] objArr = new Object[0];
            x<TextFieldValue, Object> xVarA = TextFieldValue.INSTANCE.a();
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            int i26 = i18;
            if (objE == companion.a()) {
                objE = new er.a() { // from class: f2.m4
                    @Override // er.a
                    public final Object a() {
                        return t4.s();
                    }
                };
                rVarH.v(objE);
            }
            final a3 a3VarL = f.l(objArr, xVarA, (er.a) objE, rVarH, MLKEMEngine.KyberPolyBytes);
            Object[] objArr2 = {t(a3VarL)};
            int i27 = i26 & 29360128;
            int i28 = i26 & 234881024;
            int i29 = i26 & 1879048192;
            boolean zW = (i27 == 8388608) | rVarH.W(a3VarL) | rVarH.G(l0Var2) | (i28 == 67108864) | (i29 == 536870912);
            int i35 = i26 & 3670016;
            boolean z15 = zW | (i35 == 1048576);
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: f2.n4
                    @Override // er.a
                    public final Object a() {
                        return t4.v(u4Var, l0Var2, dateInputFormat, locale, i15, a3VarL);
                    }
                };
                a3Var = a3VarL;
                rVarH.v(objE2);
            } else {
                a3Var = a3VarL;
            }
            final a3 a3Var2 = (a3) f.k(objArr2, (er.a) objE2, rVarH, 0);
            if (fu.r.t0((CharSequence) a3Var2.getValue())) {
                fN = f57785b;
            } else {
                d3 d3VarA = pn.A(pn.f57316a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                fN = h.n(f57785b - h.n(d3VarA.getBottom() + d3VarA.getTop()));
            }
            float f15 = fN;
            TextFieldValue textFieldValueT = t(a3Var);
            boolean zW2 = (i35 == 1048576) | (r23 == 67108864) | rVarH.W(a3Var) | rVarH.W(a3Var2) | ((i26 & 896) == 256) | rVarH.G(l0Var2) | (i29 == 536870912) | (i27 == 8388608);
            Object objE3 = rVarH.E();
            if (zW2 || objE3 == companion.a()) {
                final a3 a3Var3 = a3Var;
                dateInputFormat2 = dateInputFormat;
                obj = new l() { // from class: f2.o4
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t4.w(dateInputFormat2, a3Var2, lVar, l0Var2, locale, u4Var, i15, a3Var3, (TextFieldValue) obj2);
                    }
                };
                l0Var2 = l0Var2;
                a3Var = a3Var3;
                rVarH.v(obj);
            } else {
                obj = objE3;
                dateInputFormat2 = dateInputFormat;
            }
            l lVar2 = (l) obj;
            m mVarR = d1.a3.r(mVar, 0.0f, 0.0f, 0.0f, f15, 7, null);
            boolean zW3 = rVarH.W(a3Var2);
            Object objE4 = rVarH.E();
            if (zW3 || objE4 == companion.a()) {
                objE4 = new l() { // from class: f2.p4
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t4.x(a3Var2, (n4.i0) obj2);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarD = v.d(mVarR, false, (l) objE4, 1, null);
            if (d0Var != null) {
                d0Var3 = d0Var;
                mVarA = g0.a(m.INSTANCE, d0Var3);
            } else {
                d0Var3 = d0Var;
                mVarA = m.INSTANCE;
            }
            d0Var2 = d0Var3;
            fg.i(textFieldValueT, lVar2, mVarD.u(mVarA), false, false, null, pVar, pVar2, null, null, null, null, y2.m.d(-357881838, true, new p() { // from class: f2.q4
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return t4.y(a3Var2, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), !fu.r.t0((CharSequence) a3Var2.getValue()), new na(dateInputFormat2), new KeyboardOptions(0, Boolean.FALSE, a0.INSTANCE.d(), v4.t.INSTANCE.b(), null, null, null, 113, null), null, true, 0, 0, null, null, w4Var.getDateTextFieldColors(), rVarH, (i26 << 6) & 33030144, 12779904, 0, 4001592);
            rVar2 = rVarH;
            i0 i0Var = i0.f148189a;
            boolean z16 = (i25 & 112) == 32;
            Object objE5 = rVar2.E();
            if (z16 || objE5 == companion.a()) {
                objE5 = new a(d0Var2, null);
                rVar2.v(objE5);
            }
            Function0.d(i0Var, (p) objE5, rVar2, 6);
            boolean zG = ((i26 & 112) == 32) | rVar2.G(l0Var2) | (i28 == 67108864) | (i29 == 536870912) | rVar2.W(a3Var);
            Object objE6 = rVar2.E();
            if (zG || objE6 == companion.a()) {
                l16 = l15;
                bVar = new b(l16, l0Var2, dateInputFormat2, locale, a3Var, null);
                rVar2.v(bVar);
            } else {
                bVar = objE6;
                l16 = l15;
            }
            Function0.d(l16, (p) bVar, rVar2, (i26 >> 3) & 14);
            if (t.k()) {
                t.n();
            }
        } else {
            l16 = l15;
            rVar2 = rVarH;
            d0Var2 = d0Var;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final Long l17 = l16;
            final d0 d0Var4 = d0Var2;
            d5VarM.a(new p() { // from class: f2.r4
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return t4.z(mVar, l17, lVar, l0Var, pVar, pVar2, i15, u4Var, dateInputFormat, locale, w4Var, d0Var4, i16, i17, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3 s() {
        return c6.e(new TextFieldValue((String) null, 0L, (z3) null, 7, (fr.k) null), null, 2, null);
    }

    private static final TextFieldValue t(a3<TextFieldValue> a3Var) {
        return a3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(a3<TextFieldValue> a3Var, TextFieldValue textFieldValue) {
        a3Var.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3 v(u4 u4Var, l0 l0Var, DateInputFormat dateInputFormat, Locale locale, int i15, a3 a3Var) {
        return c6.e(t(a3Var).m().length() > 0 ? u4Var.c(l0Var.l(t(a3Var).m(), dateInputFormat.getPatternWithoutDelimiters(), locale), i15, locale) : "", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(DateInputFormat dateInputFormat, a3 a3Var, l lVar, l0 l0Var, Locale locale, u4 u4Var, int i15, a3 a3Var2, TextFieldValue textFieldValue) {
        if (textFieldValue.m().length() <= dateInputFormat.getPatternWithoutDelimiters().length()) {
            String strM = textFieldValue.m();
            for (int i16 = 0; i16 < strM.length(); i16++) {
                if (Character.isDigit(strM.charAt(i16))) {
                }
            }
            u(a3Var2, textFieldValue);
            String string = fu.r.u1(textFieldValue.m()).toString();
            Long lValueOf = null;
            if (string.length() != 0 && string.length() >= dateInputFormat.getPatternWithoutDelimiters().length()) {
                CalendarDate calendarDateL = l0Var.l(string, dateInputFormat.getPatternWithoutDelimiters(), locale);
                a3Var.setValue(u4Var.c(calendarDateL, i15, locale));
                if (((CharSequence) a3Var.getValue()).length() == 0 && calendarDateL != null) {
                    lValueOf = Long.valueOf(calendarDateL.getUtcTimeMillis());
                }
                lVar.b(lValueOf);
            } else {
                a3Var.setValue("");
                lVar.b(null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(a3 a3Var, n4.i0 i0Var) {
        if (!fu.r.t0((CharSequence) a3Var.getValue())) {
            f0.m(i0Var, (String) a3Var.getValue());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(a3 a3Var, r rVar, int i15) {
        r rVar2 = rVar;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-357881838, i15, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:215)");
            }
            if (fu.r.t0((CharSequence) a3Var.getValue())) {
                rVar2.X(-1548950640);
            } else {
                rVar2.X(-327061465);
                oo.j((String) a3Var.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262142);
                rVar2 = rVar;
            }
            rVar2.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(m mVar, Long l15, l lVar, l0 l0Var, p pVar, p pVar2, int i15, u4 u4Var, DateInputFormat dateInputFormat, Locale locale, w4 w4Var, d0 d0Var, int i16, int i17, r rVar, int i18) {
        r(mVar, l15, lVar, l0Var, pVar, pVar2, i15, u4Var, dateInputFormat, locale, w4Var, d0Var, rVar, g4.a(i16 | 1), g4.a(i17));
        return i0.f148189a;
    }
}
