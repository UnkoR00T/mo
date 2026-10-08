package p079n1;

import android.view.KeyEvent;
import er.l;
import f3.j;
import f3.m;
import fr.q;
import mr.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import v4.TextFieldValue;
import y3.b;
import y3.f;
import z1.c2;
import z1.d3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lf3/m;", "Ln1/s3;", "state", "Lz1/c2;", "manager", "Lv4/t0;", "value", "Lkotlin/Function1;", "Loq/i0;", "onValueChange", "", "editable", "singleLine", "Lv4/i0;", "offsetMapping", "Ln1/i7;", "undoManager", "Lv4/t;", "imeAction", "b", "(Lf3/m;Ln1/s3;Lz1/c2;Lv4/t0;Ler/l;ZZLv4/i0;Ln1/i7;I)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i5 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements l<b, Boolean> {
        a(Object obj) {
            super(1, obj, g5.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
        }

        public final Boolean E(KeyEvent keyEvent) {
            return Boolean.valueOf(((g5) this.f66391b).o(keyEvent));
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(b bVar) {
            return E(bVar.getNativeKeyEvent());
        }
    }

    public static final m b(m mVar, final s3 s3Var, final c2 c2Var, final TextFieldValue textFieldValue, final l<? super TextFieldValue, i0> lVar, final boolean z15, final boolean z16, final v4.i0 i0Var, final i7 i7Var, final int i15) {
        return j.c(mVar, null, new er.q() { // from class: n1.h5
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i5.c(s3Var, c2Var, textFieldValue, z15, z16, i0Var, i7Var, lVar, i15, (m) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m c(s3 s3Var, c2 c2Var, TextFieldValue textFieldValue, boolean z15, boolean z16, v4.i0 i0Var, i7 i7Var, l lVar, int i15, m mVar, r rVar, int i16) {
        rVar.X(851809892);
        if (t.k()) {
            t.o(851809892, i16, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:256)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = new d3();
            rVar.v(objE);
        }
        d3 d3Var = (d3) objE;
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            objE2 = new n2();
            rVar.v(objE2);
        }
        g5 g5Var = new g5(s3Var, c2Var, textFieldValue, z15, z16, d3Var, i0Var, i7Var, (n2) objE2, null, lVar, i15, 512, null);
        m.Companion companion2 = m.INSTANCE;
        boolean zG = rVar.G(g5Var);
        Object objE3 = rVar.E();
        if (zG || objE3 == companion.a()) {
            objE3 = new a(g5Var);
            rVar.v(objE3);
        }
        m mVarA = f.a(companion2, (l) ((g) objE3));
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarA;
    }
}
