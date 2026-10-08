package pl.gov.coi.mobywatel.feature.developer.view.screens.database.data;

import fr.k;
import oa.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lpl/gov/coi/mobywatel/feature/developer/view/screens/database/data/DeveloperSecureDatabase;", "Loa/u;", "<init>", "()V", "Luo1/b;", "a0", "()Luo1/b;", "o", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DeveloperSecureDatabase extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f158640p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f158641q = o10.b.b("developer_secure_sample.db");

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.developer.view.screens.database.data.DeveloperSecureDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpl/gov/coi/mobywatel/feature/developer/view/screens/database/data/DeveloperSecureDatabase$a;", "", "<init>", "()V", "Lo10/b;", "DATABASE_NAME", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String a() {
            return DeveloperSecureDatabase.f158641q;
        }

        private Companion() {
        }
    }

    public abstract uo1.b a0();
}
