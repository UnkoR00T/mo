package pc4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lpc4/l3;", "", "<init>", "()V", "La84/b;", "clearNotificationsDeviceTokenUseCase", "Lx34/b;", "c", "(La84/b;)Lx34/b;", "Lch1/f;", "deleteDocumentFromOrderUC", "Lc54/b;", "isFeatureEnabledUseCase", "Lw24/y1;", "hasOnlyOneCertificateUC", "Lq34/i1;", "isContainOneParentTypeDocumentUseCase", "Lw24/q1;", "getVehiclesDataUC", "Lq34/e1;", "getVehiclesDataUseCase", "Lx34/a;", "b", "(Lch1/f;Lc54/b;Lw24/y1;Lq34/i1;Lw24/q1;Lq34/e1;)Lx34/a;", "Lw24/f2;", "isDocumentAddedByType", "Lw24/i0;", "getDocumentIdsByTypeUC", "Lw24/r;", "getAddedDocumentTypesUC", "Lv24/b;", "documentsContainerRepository", "Ls34/a;", "a", "(Lc54/b;Lw24/f2;Lw24/i0;Lw24/r;Lv24/b;)Ls34/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3 f155102a = new l3();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/l3$a", "Lx34/b;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements x34.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a84.b f155103a;

        a(a84.b bVar) {
            this.f155103a = bVar;
        }

        @Override // x34.b
        public Object a(tq.e<? super oq.i0> eVar) throws Throwable {
            Object objA = this.f155103a.a(gz.b.a.C1792a.f78542a, eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    private l3() {
    }

    public final s34.a a(c54.b isFeatureEnabledUseCase, w24.f2 isDocumentAddedByType, w24.i0 getDocumentIdsByTypeUC, w24.r getAddedDocumentTypesUC, v24.b documentsContainerRepository) {
        return new tc4.a(isFeatureEnabledUseCase, isDocumentAddedByType, getDocumentIdsByTypeUC, getAddedDocumentTypesUC, documentsContainerRepository);
    }

    public final x34.a b(ch1.f deleteDocumentFromOrderUC, c54.b isFeatureEnabledUseCase, w24.y1 hasOnlyOneCertificateUC, q34.i1 isContainOneParentTypeDocumentUseCase, w24.q1 getVehiclesDataUC, q34.e1 getVehiclesDataUseCase) {
        return new tc4.b(deleteDocumentFromOrderUC, isFeatureEnabledUseCase, hasOnlyOneCertificateUC, isContainOneParentTypeDocumentUseCase, getVehiclesDataUC, getVehiclesDataUseCase);
    }

    public final x34.b c(a84.b clearNotificationsDeviceTokenUseCase) {
        return new a(clearNotificationsDeviceTokenUseCase);
    }
}
