package mw3;

import android.graphics.Matrix;
import er.l;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lmw3/a;", "", "Landroid/graphics/Matrix;", "startMatrix", "endMatrix", "Lkotlin/Function1;", "Loq/i0;", "onUpdate", "Lkotlin/Function0;", "onEnd", "a", "(Landroid/graphics/Matrix;Landroid/graphics/Matrix;Ler/l;Ler/a;)V", "cancel", "()V", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a(Matrix startMatrix, Matrix endMatrix, l<? super Matrix, i0> onUpdate, er.a<i0> onEnd);

    void cancel();
}
