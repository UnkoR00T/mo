package pl.gov.coi.mjunior.technical.containers.data.database.entities;

import androidx.annotation.Keep;
import p071kotlin.Metadata;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "TO_UPDATE", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum DocumentEntityStatus {
    ACTIVE,
    INACTIVE,
    TO_UPDATE;

    private static final /* synthetic */ a $ENTRIES = b.a(values());

    public static a<DocumentEntityStatus> getEntries() {
        return $ENTRIES;
    }
}
