package p076m2;

import er.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class m2 implements l<Long, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l<Long, Object> f123004a;

    /* JADX WARN: Multi-variable type inference failed */
    public m2(l<? super Long, Object> lVar) {
        this.f123004a = lVar;
    }

    @Override // er.l
    public /* bridge */ /* synthetic */ Object b(Long l15) {
        return c(l15.longValue());
    }

    public final Object c(long j15) {
        return this.f123004a.b(Long.valueOf(j15 / 1000000));
    }
}
