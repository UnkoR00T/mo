package de;

import android.annotation.SuppressLint;
import be.v;

/* JADX INFO: loaded from: classes3.dex */
public class g extends ve.h<zd.f, v<?>> implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f41105e;

    public g(long j15) {
        super(j15);
    }

    @Override // de.h
    @SuppressLint({"InlinedApi"})
    public void a(int i15) {
        if (i15 >= 40) {
            b();
        } else if (i15 >= 20 || i15 == 15) {
            m(h() / 2);
        }
    }

    @Override // de.h
    public /* bridge */ /* synthetic */ v c(zd.f fVar) {
        return (v) super.l(fVar);
    }

    @Override // de.h
    public void d(h.a aVar) {
        this.f41105e = aVar;
    }

    @Override // de.h
    public /* bridge */ /* synthetic */ v e(zd.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v<?> vVar) {
        return vVar == null ? super.i(null) : vVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(zd.f fVar, v<?> vVar) {
        h.a aVar = this.f41105e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.d(vVar);
    }
}
