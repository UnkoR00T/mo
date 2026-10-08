package p049fm;

import c5.d;
import c5.t;
import er.a;
import lh.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
public final class k2 implements a<f2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m3 f65169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f65170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f65171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f65172d;

    public k2(m3 m3Var, c cVar, d dVar, t tVar) {
        this.f65169a = m3Var;
        this.f65170b = cVar;
        this.f65171c = dVar;
        this.f65172d = tVar;
    }

    @Override // er.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f2 a() {
        String strB = this.f65169a.b();
        return new f2(this.f65170b, this.f65169a.a(), strB, this.f65171c, this.f65172d, this.f65169a.c());
    }
}
