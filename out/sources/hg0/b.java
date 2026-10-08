package hg0;

import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.CertificateStatusEntity;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhg0/b;", "", "<init>", "()V", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "value", "", "a", "(Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;)Ljava/lang/String;", "b", "(Ljava/lang/String;)Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    public final String a(CertificateStatusEntity value) {
        if (value != null) {
            return value.name();
        }
        return null;
    }

    public final CertificateStatusEntity b(String value) {
        if (value != null) {
            return CertificateStatusEntity.valueOf(value);
        }
        return null;
    }
}
