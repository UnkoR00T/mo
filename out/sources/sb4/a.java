package sb4;

import oq.i0;
import p071kotlin.Metadata;
import pb4.d;
import rb4.b;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lsb4/a;", "Lvb4/a;", "Lrb4/b;", "biometricDataSource", "<init>", "(Lrb4/b;)V", "Lpb4/d;", "b", "(Ltq/e;)Ljava/lang/Object;", "biometricInAppStatus", "Loq/i0;", "a", "(Lpb4/d;Ltq/e;)Ljava/lang/Object;", "Lrb4/b;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements vb4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b biometricDataSource;

    public a(b bVar) {
        this.biometricDataSource = bVar;
    }

    @Override // vb4.a
    public Object a(d dVar, e<? super i0> eVar) {
        Object objD = this.biometricDataSource.d(dVar, eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // vb4.a
    public Object b(e<? super d> eVar) {
        return this.biometricDataSource.b(eVar);
    }
}
