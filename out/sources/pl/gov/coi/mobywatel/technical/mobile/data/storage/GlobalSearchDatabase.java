package pl.gov.coi.mobywatel.technical.mobile.data.storage;

import fr.k;
import m64.a;
import m64.f;
import o10.b;
import oa.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase;", "Loa/u;", "<init>", "()V", "Lm64/f;", "b0", "()Lm64/f;", "Lm64/k;", "c0", "()Lm64/k;", "Lm64/a;", "a0", "()Lm64/a;", "o", "a", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GlobalSearchDatabase extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f159273p = b.b("global_search_db");

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.mobile.data.storage.GlobalSearchDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase$a;", "", "<init>", "()V", "Lo10/b;", "DATABASE_NAME", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "VERSION_1", "I", "VERSION_2", "VERSION_3", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String a() {
            return GlobalSearchDatabase.f159273p;
        }

        private Companion() {
        }
    }

    public abstract a a0();

    public abstract f b0();

    public abstract m64.k c0();
}
