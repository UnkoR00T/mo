package p079n1;

import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.n3;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import ju.p0;
import m3.g;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.r;
import p076m2.t;
import p3.f;
import q4.TextLayoutResult;
import q4.z3;
import tq.e;
import uq.b;
import v4.TextFieldValue;
import vq.k;
import x1.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf3/m;", "Ln1/s3;", "state", "Lv4/t0;", "value", "Lv4/i0;", "offsetMapping", "Landroidx/compose/ui/graphics/c;", "cursorBrush", "", "enabled", "c", "(Lf3/m;Ln1/s3;Lv4/t0;Lv4/i0;Landroidx/compose/ui/graphics/c;Z)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o4 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ z f130268f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z zVar, e<? super a> eVar) {
            super(2, eVar);
            this.f130268f = zVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f130267e;
            if (i15 == 0) {
                u.b(obj);
                z zVar = this.f130268f;
                this.f130267e = 1;
                if (zVar.f(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f130268f, eVar);
        }
    }

    public static final m c(m mVar, final s3 s3Var, final TextFieldValue textFieldValue, final v4.i0 i0Var, final c cVar, boolean z15) {
        return z15 ? j.c(mVar, null, new q() { // from class: n1.m4
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return o4.d(cVar, s3Var, textFieldValue, i0Var, (m) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null) : mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m d(final c cVar, final s3 s3Var, final TextFieldValue textFieldValue, final v4.i0 i0Var, m mVar, r rVar, int i15) {
        m mVarD;
        rVar.X(-84507373);
        if (t.k()) {
            t.o(-84507373, i15, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
        }
        boolean zBooleanValue = ((Boolean) rVar.N(g1.e())).booleanValue();
        boolean zA = rVar.a(zBooleanValue);
        Object objE = rVar.E();
        if (zA || objE == r.INSTANCE.a()) {
            objE = new z(zBooleanValue);
            rVar.v(objE);
        }
        final z zVar = (z) objE;
        boolean z15 = ((cVar instanceof SolidColor) && ((SolidColor) cVar).getValue() == 16) ? false : true;
        if (((n3) rVar.N(g1.v())).b() && s3Var.h() && z3.h(textFieldValue.getSelection()) && z15) {
            rVar.X(-707487962);
            q4.e text = textFieldValue.getText();
            z3 z3VarB = z3.b(textFieldValue.getSelection());
            boolean zG = rVar.G(zVar);
            Object objE2 = rVar.E();
            if (zG || objE2 == r.INSTANCE.a()) {
                objE2 = new a(zVar, null);
                rVar.v(objE2);
            }
            Function0.e(text, z3VarB, (p) objE2, rVar, 0);
            boolean zG2 = rVar.G(zVar) | rVar.G(i0Var) | rVar.W(textFieldValue) | rVar.G(s3Var) | rVar.W(cVar);
            Object objE3 = rVar.E();
            if (zG2 || objE3 == r.INSTANCE.a()) {
                Object obj = new l() { // from class: n1.n4
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o4.e(zVar, i0Var, textFieldValue, s3Var, cVar, (p3.c) obj2);
                    }
                };
                rVar.v(obj);
                objE3 = obj;
            }
            mVarD = k3.k.d(mVar, (l) objE3);
            rVar.R();
        } else {
            rVar.X(-705473241);
            rVar.R();
            mVarD = m.INSTANCE;
        }
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(z zVar, v4.i0 i0Var, TextFieldValue textFieldValue, s3 s3Var, c cVar, p3.c cVar2) {
        g gVar;
        TextLayoutResult value;
        cVar2.H2();
        float fD = zVar.d();
        if (fD != 0.0f) {
            int iE = i0Var.e(z3.n(textFieldValue.getSelection()));
            k6 k6VarN = s3Var.n();
            if (k6VarN == null || (value = k6VarN.getValue()) == null || (gVar = value.e(iE)) == null) {
                gVar = new g(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float fD2 = lr.m.d((float) Math.floor(cVar2.l2(p4.a())), 1.0f);
            float f15 = fD2 / 2;
            float fD3 = lr.m.d(lr.m.i(gVar.getLeft() + f15, Float.intBitsToFloat((int) (cVar2.a() >> 32)) - f15), f15);
            float fFloor = ((int) fD2) % 2 == 1 ? ((float) Math.floor(fD3)) + 0.5f : (float) Math.rint(fD3);
            f.S(cVar2, cVar, m3.e.e((((long) Float.floatToRawIntBits(gVar.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), m3.e.e((((long) Float.floatToRawIntBits(gVar.getBottom())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), fD2, 0, null, fD, null, 0, 432, null);
        }
        return i0.f148189a;
    }
}
