package l24;

import java.util.List;
import m24.CertificateEntity;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityType;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Ll24/a;", "", "Lm24/a;", "certificate", "", "e", "(Lm24/a;Ltq/e;)Ljava/lang/Object;", "Lf24/c;", "certificateType", "b", "(Lf24/c;Ltq/e;)Ljava/lang/Object;", "", "a", "(Ltq/e;)Ljava/lang/Object;", "h", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;", "Loq/i0;", "c", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;Ltq/e;)Ljava/lang/Object;", "", "newId", "d", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;ILtq/e;)Ljava/lang/Object;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;", "status", "g", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "f", "()Lmu/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(tq.e<? super List<CertificateEntity>> eVar);

    Object b(f24.c cVar, tq.e<? super CertificateEntity> eVar);

    Object c(CertificateEntityType certificateEntityType, tq.e<? super oq.i0> eVar);

    Object d(CertificateEntityType certificateEntityType, int i15, tq.e<? super oq.i0> eVar);

    Object e(CertificateEntity certificateEntity, tq.e<? super Long> eVar);

    mu.g<CertificateEntity> f();

    Object g(CertificateEntityStatus certificateEntityStatus, tq.e<? super oq.i0> eVar);

    Object h(f24.c cVar, tq.e<? super CertificateEntity> eVar);
}
