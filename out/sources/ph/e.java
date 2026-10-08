package ph;

/* JADX INFO: loaded from: classes3.dex */
final class e extends vq.k implements er.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ e0 f157556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(e0 e0Var, tq.e eVar) {
        super(2, eVar);
        this.f157556e = e0Var;
    }

    @Override // er.p
    public final /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
        return ((e) v((ju.p0) obj, (tq.e) obj2)).J(oq.i0.f148189a);
    }

    @Override // vq.a
    public final Object J(Object obj) throws Throwable {
        uq.b.e();
        oq.u.b(obj);
        this.f157556e.b9();
        return oq.i0.f148189a;
    }

    @Override // vq.a
    public final tq.e v(Object obj, tq.e eVar) {
        return new e(this.f157556e, eVar);
    }
}
