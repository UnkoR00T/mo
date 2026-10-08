package gg0;

import hg0.CertificateEntity;
import oq.i0;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.CertificateStatusEntity;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nH§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lgg0/a;", "", "Lhg0/a;", "certificate", "Loq/i0;", "k", "(Lhg0/a;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "h", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "status", "j", "(Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;Ltq/e;)Ljava/lang/Object;", "", "certificateBytes", "privateKeyBytes", "certificateStatus", "", "i", "([B[BLpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "f", "()Lmu/g;", "", "g", "isAccepted", "e", "(ZLtq/e;)Ljava/lang/Object;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object d(tq.e<? super CertificateEntity> eVar);

    Object e(boolean z15, tq.e<? super i0> eVar);

    mu.g<CertificateEntity> f();

    Object g(tq.e<? super Boolean> eVar);

    Object h(tq.e<? super i0> eVar);

    Object i(byte[] bArr, byte[] bArr2, CertificateStatusEntity certificateStatusEntity, tq.e<? super Integer> eVar);

    Object j(CertificateStatusEntity certificateStatusEntity, tq.e<? super i0> eVar);

    Object k(CertificateEntity certificateEntity, tq.e<? super i0> eVar);
}
