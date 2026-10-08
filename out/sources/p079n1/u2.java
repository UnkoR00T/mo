package p079n1;

import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.t1;
import androidx.compose.ui.platform.v1;
import c1.e;
import c5.d;
import c5.h;
import er.l;
import er.q;
import f3.j;
import f3.m;
import fr.w;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import q4.c4;
import u4.FontWeight;
import u4.y;
import u4.z;
import w0.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lf3/m;", "Lq4/b4;", "textStyle", "", "softWrap", "", "minLines", "maxLines", "b", "(Lf3/m;Lq4/b4;ZII)Lf3/m;", "c", "(Lf3/m;Lq4/b4;II)Lf3/m;", "Loq/i0;", "f", "(II)V", "", "typeface", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f130473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f130474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextStyle f130475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i15, int i16, TextStyle textStyle) {
            super(1);
            this.f130473b = i15;
            this.f130474c = i16;
            this.f130475d = textStyle;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("heightInLines");
            v1Var.getProperties().b("minLines", Integer.valueOf(this.f130473b));
            v1Var.getProperties().b("maxLines", Integer.valueOf(this.f130474c));
            v1Var.getProperties().b("textStyle", this.f130475d);
        }
    }

    public static final m b(m mVar, TextStyle textStyle, boolean z15, int i15, int i16) {
        f(i15, i16);
        if (!(i15 == 1 && i16 == Integer.MAX_VALUE) && z15) {
            return g0.isBasicTextFieldMinSizeOptimizationEnabled ? mVar.u(new s2(textStyle, i15, i16)) : c(mVar, textStyle, i15, i16);
        }
        return mVar;
    }

    public static final m c(m mVar, final TextStyle textStyle, final int i15, final int i16) {
        return j.b(mVar, t1.b() ? new a(i15, i16, textStyle) : t1.a(), new q() { // from class: n1.t2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return u2.d(textStyle, i15, i16, (m) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m d(TextStyle textStyle, int i15, int i16, m mVar, r rVar, int i17) {
        rVar.X(595899793);
        if (t.k()) {
            t.o(595899793, i17, -1, "androidx.compose.foundation.text.legacyHeightInLines.<anonymous> (HeightInLinesModifier.kt:300)");
        }
        d dVar = (d) rVar.N(g1.f());
        u4.l.b bVar = (u4.l.b) rVar.N(g1.h());
        c5.t tVar = (c5.t) rVar.N(g1.l());
        boolean zW = rVar.W(textStyle) | rVar.c(tVar.ordinal());
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = c4.d(textStyle, tVar);
            rVar.v(objE);
        }
        TextStyle textStyle2 = (TextStyle) objE;
        boolean zW2 = rVar.W(bVar) | rVar.W(textStyle2);
        Object objE2 = rVar.E();
        if (zW2 || objE2 == r.INSTANCE.a()) {
            u4.l lVarL = textStyle2.l();
            FontWeight fontWeightQ = textStyle2.q();
            if (fontWeightQ == null) {
                fontWeightQ = FontWeight.INSTANCE.d();
            }
            y yVarO = textStyle2.o();
            int value = yVarO != null ? yVarO.getValue() : y.INSTANCE.b();
            z zVarP = textStyle2.p();
            objE2 = bVar.a(lVarL, fontWeightQ, value, zVarP != null ? zVarP.getValue() : z.INSTANCE.a());
            rVar.v(objE2);
        }
        f6 f6Var = (f6) objE2;
        boolean zW3 = rVar.W(e(f6Var)) | rVar.W(dVar) | rVar.W(bVar) | rVar.W(textStyle) | rVar.c(tVar.ordinal());
        Object objE3 = rVar.E();
        if (zW3 || objE3 == r.INSTANCE.a()) {
            objE3 = Integer.valueOf((int) (t4.a(textStyle2, dVar, bVar, t4.d(), 1) & BodyPartID.bodyIdMax));
            rVar.v(objE3);
        }
        int iIntValue = ((Number) objE3).intValue();
        boolean zW4 = rVar.W(textStyle) | rVar.W(dVar) | rVar.W(bVar) | rVar.c(tVar.ordinal()) | rVar.W(e(f6Var));
        Object objE4 = rVar.E();
        if (zW4 || objE4 == r.INSTANCE.a()) {
            objE4 = Integer.valueOf((int) (t4.a(textStyle2, dVar, bVar, t4.d() + '\n' + t4.d(), 2) & BodyPartID.bodyIdMax));
            rVar.v(objE4);
        }
        int iIntValue2 = ((Number) objE4).intValue() - iIntValue;
        Integer numValueOf = i15 == 1 ? null : Integer.valueOf(((i15 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i16 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i16 - 1))) : null;
        m mVarJ = androidx.compose.foundation.layout.d.j(m.INSTANCE, numValueOf != null ? dVar.b2(numValueOf.intValue()) : h.INSTANCE.c(), numValueOf2 != null ? dVar.b2(numValueOf2.intValue()) : h.INSTANCE.c());
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarJ;
    }

    private static final Object e(f6<? extends Object> f6Var) {
        return f6Var.getValue();
    }

    public static final void f(int i15, int i16) {
        if (!(i15 > 0 && i16 > 0)) {
            e.a("both minLines " + i15 + " and maxLines " + i16 + " must be greater than zero");
        }
        if (i15 <= i16) {
            return;
        }
        e.a("minLines " + i15 + " must be less than or equal to maxLines " + i16);
    }
}
