package pl.gov.coi.mobywatel.technical.containers.data.database;

import fr.k;
import java.util.List;
import l24.j;
import m24.ContainerFileEntity;
import oa.f;
import oa.u;
import p071kotlin.Metadata;
import pq.v;
import ya.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/database/b;", "Ll24/j;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "a", "Loa/u;", "Loa/f;", "Lm24/d;", "b", "Loa/f;", "__insertAdapterOfContainerFileEntity", "c", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<ContainerFileEntity> __insertAdapterOfContainerFileEntity = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/technical/containers/data/database/b$a", "Loa/f;", "Lm24/d;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lm24/d;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends f<ContainerFileEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `containerFilesEntity` (`id`,`ownerDocumentId`,`creationDate`,`fileName`,`fileExtension`,`sizeInBytes`,`fileBytes`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, ContainerFileEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getOwnerDocumentId());
            String strA = m10.b.a(entity.getCreationDate());
            if (strA == null) {
                statement.i0(3);
            } else {
                statement.S0(3, strA);
            }
            statement.S0(4, entity.getFileName());
            statement.S0(5, entity.getFileExtension());
            statement.Q(6, entity.getSizeInBytes());
            statement.g0(7, entity.getFileBytes());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.containers.data.database.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/database/b$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List<mr.c<?>> a() {
            return v.n();
        }

        private Companion() {
        }
    }

    public b(u uVar) {
        this.__db = uVar;
    }
}
