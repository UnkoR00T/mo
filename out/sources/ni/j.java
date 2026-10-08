package ni;

import android.net.Uri;
import android.widget.ImageView;
import com.google.android.libraries.places.internal.s61;
import com.google.android.libraries.places.internal.u61;
import com.google.android.libraries.places.internal.z61;
import er.p;
import ju.p0;
import oq.i0;
import oq.u;

/* JADX INFO: loaded from: classes4.dex */
final class j extends vq.k implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f136423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f136424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, tq.e eVar) {
        super(2, eVar);
        this.f136424f = kVar;
    }

    @Override // er.p
    public final /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
        return ((j) v((p0) obj, (tq.e) obj2)).J(i0.f148189a);
    }

    @Override // vq.a
    public final Object J(Object obj) throws Throwable {
        Object objE = uq.b.e();
        int i15 = this.f136423e;
        u.b(obj);
        if (i15 == 0) {
            final k kVar = this.f136424f;
            c cVar = kVar.H0;
            if (cVar == null) {
                cVar = null;
            }
            Uri uri = Uri.parse(cVar.a());
            z61 z61VarR1 = kVar.R1();
            if (z61VarR1 != null) {
                s61 s61VarD = z61VarR1.d();
                ImageView imageView = kVar.F0;
                u61 u61Var = new u61(imageView != null ? imageView : null, new er.l() { // from class: ni.i
                    @Override // er.l
                    public final /* synthetic */ Object b(Object obj2) {
                        k.V1(kVar);
                        return i0.f148189a;
                    }
                });
                this.f136423e = 1;
                if (s61VarD.a(uri, u61Var, this) == objE) {
                    return objE;
                }
            }
        }
        return i0.f148189a;
    }

    @Override // vq.a
    public final tq.e v(Object obj, tq.e eVar) {
        return new j(this.f136424f, eVar);
    }
}
