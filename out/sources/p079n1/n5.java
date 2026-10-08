package p079n1;

import a4.k0;
import a4.w;
import a4.w0;
import a4.x;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b1.l;
import f3.m;
import l3.d0;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import uq.b;
import z1.c2;
import z1.x0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf3/m;", "Lz1/c2;", "manager", "", "enabled", "Lb1/l;", "interactionSource", "Ln1/s3;", "state", "Ll3/d0;", "focusRequester", "readOnly", "Lv4/i0;", "offsetMapping", "c", "(Lf3/m;Lz1/c2;ZLb1/l;Ln1/s3;Ll3/d0;ZLv4/i0;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n5 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c2 f130239a;

        a(c2 c2Var) {
            this.f130239a = c2Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, e<? super i0> eVar) {
            Object objI = x0.i(k0Var, this.f130239a.getMouseSelectionObserver(), this.f130239a.getTouchSelectionObserver(), eVar);
            return objI == b.e() ? objI : i0.f148189a;
        }
    }

    public static final m c(m mVar, final c2 c2Var, final boolean z15, l lVar, final s3 s3Var, final d0 d0Var, final boolean z16, final v4.i0 i0Var) {
        return x.b(w0.d(r5.c(x0.r(mVar, new er.l() { // from class: n1.l5
            @Override // er.l
            public final Object b(Object obj) {
                return n5.d(s3Var, ((Boolean) obj).booleanValue());
            }
        }), lVar, z15, new er.l() { // from class: n1.m5
            @Override // er.l
            public final Object b(Object obj) {
                return n5.e(s3Var, d0Var, z16, z15, c2Var, i0Var, (m3.e) obj);
            }
        }), c2Var.getMouseSelectionObserver(), c2Var.getTouchSelectionObserver(), new a(c2Var)), w.INSTANCE.c(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(s3 s3Var, boolean z15) {
        s3Var.M(z15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(s3 s3Var, d0 d0Var, boolean z15, boolean z16, c2 c2Var, v4.i0 i0Var, m3.e eVar) {
        j2.h0(s3Var, d0Var, !z15);
        if (s3Var.h() && z16) {
            if (s3Var.g() != r2.Selection) {
                k6 k6VarN = s3Var.n();
                if (k6VarN != null) {
                    s4.INSTANCE.n(eVar.getPackedValue(), k6VarN, s3Var.getProcessor(), i0Var, s3Var.r());
                    if (s3Var.getTextDelegate().getText().length() > 0) {
                        s3Var.K(r2.Cursor);
                    }
                }
            } else {
                c2Var.K(eVar);
            }
        }
        return i0.f148189a;
    }
}
