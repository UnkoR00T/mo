package pl.gov.coi.mjunior.technical.containers.data.database;

import fr.k;
import gg0.l;
import hg0.DocumentEntity;
import hg0.SchemaEntity;
import hg0.ScopeEntity;
import hg0.d;
import ig0.DocumentWithScopes;
import ig0.DocumentWithScopesAndSchemas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityType;
import pq.v;
import pq.v0;
import ta.i;
import ta.m;
import ta.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010 \u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\tH\u0096@¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0004\b'\u0010$J\u0018\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020&H\u0096@¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020&0\u001c2\u0006\u0010,\u001a\u00020\tH\u0096@¢\u0006\u0004\b-\u0010$J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020(0\u001c2\u0006\u0010,\u001a\u00020\tH\u0096@¢\u0006\u0004\b.\u0010$J \u00100\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0096@¢\u0006\u0004\b0\u00101J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cH\u0096@¢\u0006\u0004\b2\u0010+J\u001b\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001c03H\u0016¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u0004\u0018\u00010\t2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0004\b6\u0010$J\u0018\u00108\u001a\u0002072\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0004\b8\u0010$J\u0018\u00109\u001a\u00020\r2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0004\b9\u0010$J\u0018\u0010:\u001a\u00020\r2\u0006\u0010%\u001a\u00020\tH\u0096@¢\u0006\u0004\b:\u0010$J \u0010=\u001a\u00020\r2\u0006\u0010%\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0096@¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\rH\u0096@¢\u0006\u0004\b?\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00120A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010BR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010B¨\u0006M"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/b;", "Lgg0/l;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lya/b;", "_connection", "Lr0/a;", "", "", "Lhg0/g;", "_map", "Loq/i0;", ip.a.f96137b, "(Lya/b;Lr0/a;)V", "Lhg0/f;", "Q", "Lhg0/c;", "document", "m", "(Lhg0/c;Ltq/e;)Ljava/lang/Object;", "scope", "v", "(Lhg0/g;Ltq/e;)Ljava/lang/Object;", "schema", "j", "(Lhg0/f;Ltq/e;)Ljava/lang/Object;", "", "scopes", "u", "(Lhg0/c;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "r", "(Lhg0/c;Lhg0/g;Lhg0/f;Ltq/e;)Ljava/lang/Object;", "parentOrChildId", "w", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentId", "Lig0/a;", "f", "Lig0/b;", "b", "i", "(Ltq/e;)Ljava/lang/Object;", "parentId", "t", "o", "name", "p", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "Lmu/g;", "h", "()Lmu/g;", "q", "", "d", "g", "s", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;", "newStatus", "n", "(Ljava/lang/String;Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;Ltq/e;)Ljava/lang/Object;", "e", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfDocumentEntity", "Lhg0/e;", "c", "Lhg0/e;", "__documentEntityTypeDtoConverter", "Lhg0/d;", "Lhg0/d;", "__documentEntityStatusDtoConverter", "__insertAdapterOfScopeEntity", "__insertAdapterOfSchemaEntity", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hg0.e __documentEntityTypeDtoConverter = new hg0.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d __documentEntityStatusDtoConverter = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<DocumentEntity> __insertAdapterOfDocumentEntity = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oa.f<ScopeEntity> __insertAdapterOfScopeEntity = new C3931b();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oa.f<SchemaEntity> __insertAdapterOfSchemaEntity = new c();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mjunior/technical/containers/data/database/b$a", "Loa/f;", "Lhg0/c;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lhg0/c;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends oa.f<DocumentEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `container` (`id`,`documentId`,`documentType`,`status`,`expirationDate`,`identityId`,`parentId`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, DocumentEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getDocumentId());
            String strA = b.this.__documentEntityTypeDtoConverter.a(entity.getType());
            if (strA == null) {
                statement.i0(3);
            } else {
                statement.S0(3, strA);
            }
            String strA2 = b.this.__documentEntityStatusDtoConverter.a(entity.getStatus());
            if (strA2 == null) {
                statement.i0(4);
            } else {
                statement.S0(4, strA2);
            }
            String strA3 = m10.b.a(entity.getExpirationDate());
            if (strA3 == null) {
                statement.i0(5);
            } else {
                statement.S0(5, strA3);
            }
            Integer certificateId = entity.getCertificateId();
            if (certificateId == null) {
                statement.i0(6);
            } else {
                statement.f0(6, certificateId.intValue());
            }
            String parentId = entity.getParentId();
            if (parentId == null) {
                statement.i0(7);
            } else {
                statement.S0(7, parentId);
            }
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.containers.data.database.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mjunior/technical/containers/data/database/b$b", "Loa/f;", "Lhg0/g;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lhg0/g;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3931b extends oa.f<ScopeEntity> {
        C3931b() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `container_scope` (`id`,`containerId`,`name`,`data`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, ScopeEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getDocumentOwnerId());
            statement.S0(3, entity.getName());
            statement.g0(4, entity.getScope());
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mjunior/technical/containers/data/database/b$c", "Loa/f;", "Lhg0/f;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lhg0/f;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends oa.f<SchemaEntity> {
        c() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `container_schema` (`id`,`containerId`,`data`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, SchemaEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getDocumentOwnerId());
            statement.g0(3, entity.getData());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.containers.data.database.b$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/b$d;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158600e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f158602g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f158602g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158600e;
            if (i15 == 0) {
                oq.u.b(obj);
                b bVar = b.this;
                String str = this.f158602g;
                this.f158600e = 1;
                if (b.super.w(str, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new e(this.f158602g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158603e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DocumentEntity f158605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ScopeEntity f158606h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ SchemaEntity f158607j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(DocumentEntity documentEntity, ScopeEntity scopeEntity, SchemaEntity schemaEntity, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f158605g = documentEntity;
            this.f158606h = scopeEntity;
            this.f158607j = schemaEntity;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158603e;
            if (i15 == 0) {
                oq.u.b(obj);
                b bVar = b.this;
                DocumentEntity documentEntity = this.f158605g;
                ScopeEntity scopeEntity = this.f158606h;
                SchemaEntity schemaEntity = this.f158607j;
                this.f158603e = 1;
                if (b.super.r(documentEntity, scopeEntity, schemaEntity, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(this.f158605g, this.f158606h, this.f158607j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158608e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DocumentEntity f158610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<ScopeEntity> f158611h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(DocumentEntity documentEntity, List<ScopeEntity> list, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f158610g = documentEntity;
            this.f158611h = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158608e;
            if (i15 == 0) {
                oq.u.b(obj);
                b bVar = b.this;
                DocumentEntity documentEntity = this.f158610g;
                List<ScopeEntity> list = this.f158611h;
                this.f158608e = 1;
                if (b.super.u(documentEntity, list, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new g(this.f158610g, this.f158611h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public b(u uVar) {
        this.__db = uVar;
    }

    private final void Q(final ya.b _connection, r0.a<String, List<SchemaEntity>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            i.a(_map, true, new er.l() { // from class: gg0.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return pl.gov.coi.mjunior.technical.containers.data.database.b.R(this.f72751a, _connection, (r0.a) obj);
                }
            });
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT `id`,`containerId`,`data` FROM `container_schema` WHERE `containerId` IN (");
        q.a(sb5, setKeySet.size());
        sb5.append(")");
        ya.d dVarE4 = _connection.e4(sb5.toString());
        Iterator<String> it = setKeySet.iterator();
        int i15 = 1;
        while (it.hasNext()) {
            dVarE4.S0(i15, it.next());
            i15++;
        }
        try {
            int iC = m.c(dVarE4, "containerId");
            if (iC == -1) {
                dVarE4.close();
                return;
            }
            while (dVarE4.Y3()) {
                List<SchemaEntity> list = _map.get(dVarE4.u3(iC));
                if (list != null) {
                    list.add(new SchemaEntity((int) dVarE4.getLong(0), dVarE4.u3(1), dVarE4.getBlob(2)));
                }
            }
            dVarE4.close();
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(b bVar, ya.b bVar2, r0.a aVar) {
        bVar.Q(bVar2, aVar);
        return i0.f148189a;
    }

    private final void S(final ya.b _connection, r0.a<String, List<ScopeEntity>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            i.a(_map, true, new er.l() { // from class: gg0.v
                @Override // er.l
                public final Object b(Object obj) {
                    return pl.gov.coi.mjunior.technical.containers.data.database.b.T(this.f72828a, _connection, (r0.a) obj);
                }
            });
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT `id`,`containerId`,`name`,`data` FROM `container_scope` WHERE `containerId` IN (");
        q.a(sb5, setKeySet.size());
        sb5.append(")");
        ya.d dVarE4 = _connection.e4(sb5.toString());
        Iterator<String> it = setKeySet.iterator();
        int i15 = 1;
        while (it.hasNext()) {
            dVarE4.S0(i15, it.next());
            i15++;
        }
        try {
            int iC = m.c(dVarE4, "containerId");
            if (iC == -1) {
                dVarE4.close();
                return;
            }
            while (dVarE4.Y3()) {
                List<ScopeEntity> list = _map.get(dVarE4.u3(iC));
                if (list != null) {
                    list.add(new ScopeEntity((int) dVarE4.getLong(0), dVarE4.u3(1), dVarE4.u3(2), dVarE4.getBlob(3)));
                }
            }
            dVarE4.close();
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(b bVar, ya.b bVar2, r0.a aVar) {
        bVar.S(bVar2, aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            String strU3 = null;
            if (dVarE4.Y3() && !dVarE4.isNull(0)) {
                strU3 = dVarE4.u3(0);
            }
            return strU3;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d0(String str, b bVar, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "expirationDate");
            int iD6 = m.d(dVarE4, "identityId");
            int iD7 = m.d(dVarE4, "parentId");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = bVar.__documentEntityTypeDtoConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                DocumentEntityStatus documentEntityStatusB = bVar.__documentEntityStatusDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                arrayList.add(new DocumentEntity(i15, strU3, documentEntityTypeB, documentEntityStatusB, m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), dVarE4.isNull(iD6) ? null : Integer.valueOf((int) dVarE4.getLong(iD6)), dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7)));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentWithScopesAndSchemas e0(String str, String str2, b bVar, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "expirationDate");
            int iD6 = m.d(dVarE4, "identityId");
            int iD7 = m.d(dVarE4, "parentId");
            r0.a<String, List<ScopeEntity>> aVar = new r0.a<>();
            r0.a<String, List<SchemaEntity>> aVar2 = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD2);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
                String strU4 = dVarE4.u3(iD2);
                if (!aVar2.containsKey(strU4)) {
                    aVar2.put(strU4, new ArrayList());
                }
            }
            dVarE4.reset();
            bVar.S(bVar2, aVar);
            bVar.Q(bVar2, aVar2);
            if (!dVarE4.Y3()) {
                throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'pl.gov.coi.mjunior.technical.containers.`data`.database.model.DocumentWithScopesAndSchemas'.");
            }
            int i15 = (int) dVarE4.getLong(iD);
            String strU5 = dVarE4.u3(iD2);
            DocumentEntityType documentEntityTypeB = bVar.__documentEntityTypeDtoConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
            if (documentEntityTypeB == null) {
                throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
            }
            DocumentEntityStatus documentEntityStatusB = bVar.__documentEntityStatusDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
            if (documentEntityStatusB == null) {
                throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
            }
            DocumentWithScopesAndSchemas documentWithScopesAndSchemas = new DocumentWithScopesAndSchemas(new DocumentEntity(i15, strU5, documentEntityTypeB, documentEntityStatusB, m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), dVarE4.isNull(iD6) ? null : Integer.valueOf((int) dVarE4.getLong(iD6)), dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7)), (List) v0.j(aVar, dVarE4.u3(iD2)), (List) v0.j(aVar2, dVarE4.u3(iD2)));
            dVarE4.close();
            return documentWithScopesAndSchemas;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentWithScopes f0(String str, String str2, b bVar, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "expirationDate");
            int iD6 = m.d(dVarE4, "identityId");
            int iD7 = m.d(dVarE4, "parentId");
            r0.a<String, List<ScopeEntity>> aVar = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD2);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
            }
            dVarE4.reset();
            bVar.S(bVar2, aVar);
            if (!dVarE4.Y3()) {
                throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'pl.gov.coi.mjunior.technical.containers.`data`.database.model.DocumentWithScopes'.");
            }
            int i15 = (int) dVarE4.getLong(iD);
            String strU4 = dVarE4.u3(iD2);
            DocumentEntityType documentEntityTypeB = bVar.__documentEntityTypeDtoConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
            if (documentEntityTypeB == null) {
                throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
            }
            DocumentEntityStatus documentEntityStatusB = bVar.__documentEntityStatusDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
            if (documentEntityStatusB == null) {
                throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
            }
            DocumentWithScopes documentWithScopes = new DocumentWithScopes(new DocumentEntity(i15, strU4, documentEntityTypeB, documentEntityStatusB, m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), dVarE4.isNull(iD6) ? null : Integer.valueOf((int) dVarE4.getLong(iD6)), dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7)), (List) v0.j(aVar, dVarE4.u3(iD2)));
            dVarE4.close();
            return documentWithScopes;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g0(String str, String str2, b bVar, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "expirationDate");
            int iD6 = m.d(dVarE4, "identityId");
            int iD7 = m.d(dVarE4, "parentId");
            r0.a<String, List<ScopeEntity>> aVar = new r0.a<>();
            r0.a<String, List<SchemaEntity>> aVar2 = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD2);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
                String strU4 = dVarE4.u3(iD2);
                if (!aVar2.containsKey(strU4)) {
                    aVar2.put(strU4, new ArrayList());
                }
            }
            dVarE4.reset();
            bVar.S(bVar2, aVar);
            bVar.Q(bVar2, aVar2);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU5 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = bVar.__documentEntityTypeDtoConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                DocumentEntityStatus documentEntityStatusB = bVar.__documentEntityStatusDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                arrayList.add(new DocumentWithScopesAndSchemas(new DocumentEntity(i15, strU5, documentEntityTypeB, documentEntityStatusB, m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), dVarE4.isNull(iD6) ? null : Integer.valueOf((int) dVarE4.getLong(iD6)), dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7)), (List) v0.j(aVar, dVarE4.u3(iD2)), (List) v0.j(aVar2, dVarE4.u3(iD2))));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h0(String str, String str2, b bVar, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "expirationDate");
            int iD6 = m.d(dVarE4, "identityId");
            int iD7 = m.d(dVarE4, "parentId");
            r0.a<String, List<ScopeEntity>> aVar = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD2);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
            }
            dVarE4.reset();
            bVar.S(bVar2, aVar);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU4 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = bVar.__documentEntityTypeDtoConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                DocumentEntityStatus documentEntityStatusB = bVar.__documentEntityStatusDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                arrayList.add(new DocumentWithScopes(new DocumentEntity(i15, strU4, documentEntityTypeB, documentEntityStatusB, m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), dVarE4.isNull(iD6) ? null : Integer.valueOf((int) dVarE4.getLong(iD6)), dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7)), (List) v0.j(aVar, dVarE4.u3(iD2))));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentWithScopes i0(String str, b bVar, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "expirationDate");
            int iD6 = m.d(dVarE4, "identityId");
            int iD7 = m.d(dVarE4, "parentId");
            r0.a<String, List<ScopeEntity>> aVar = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD2);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
            }
            dVarE4.reset();
            bVar.S(bVar2, aVar);
            if (!dVarE4.Y3()) {
                throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'pl.gov.coi.mjunior.technical.containers.`data`.database.model.DocumentWithScopes'.");
            }
            int i15 = (int) dVarE4.getLong(iD);
            String strU4 = dVarE4.u3(iD2);
            DocumentEntityType documentEntityTypeB = bVar.__documentEntityTypeDtoConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
            if (documentEntityTypeB == null) {
                throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
            }
            DocumentEntityStatus documentEntityStatusB = bVar.__documentEntityStatusDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
            if (documentEntityStatusB == null) {
                throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
            }
            DocumentWithScopes documentWithScopes = new DocumentWithScopes(new DocumentEntity(i15, strU4, documentEntityTypeB, documentEntityStatusB, m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), dVarE4.isNull(iD6) ? null : Integer.valueOf((int) dVarE4.getLong(iD6)), dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7)), (List) v0.j(aVar, dVarE4.u3(iD2)));
            dVarE4.close();
            return documentWithScopes;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScopeEntity j0(String str, String str2, String str3, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.S0(2, str3);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "containerId");
            int iD3 = m.d(dVarE4, "name");
            int iD4 = m.d(dVarE4, "data");
            if (!dVarE4.Y3()) {
                throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.ScopeEntity'.");
            }
            ScopeEntity scopeEntity = new ScopeEntity((int) dVarE4.getLong(iD), dVarE4.u3(iD2), dVarE4.u3(iD3), dVarE4.getBlob(iD4));
            dVarE4.close();
            return scopeEntity;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(b bVar, DocumentEntity documentEntity, ya.b bVar2) throws Exception {
        bVar.__insertAdapterOfDocumentEntity.d(bVar2, documentEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(b bVar, SchemaEntity schemaEntity, ya.b bVar2) throws Exception {
        bVar.__insertAdapterOfSchemaEntity.d(bVar2, schemaEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(b bVar, ScopeEntity scopeEntity, ya.b bVar2) throws Exception {
        bVar.__insertAdapterOfScopeEntity.d(bVar2, scopeEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n0(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            return dVarE4.Y3() ? (int) dVarE4.getLong(0) : 0;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o0(String str, b bVar, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "status");
            int iD5 = m.d(dVarE4, "expirationDate");
            int iD6 = m.d(dVarE4, "identityId");
            int iD7 = m.d(dVarE4, "parentId");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = bVar.__documentEntityTypeDtoConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                DocumentEntityStatus documentEntityStatusB = bVar.__documentEntityStatusDtoConverter.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mjunior.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                arrayList.add(new DocumentEntity(i15, strU3, documentEntityTypeB, documentEntityStatusB, m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5)), dVarE4.isNull(iD6) ? null : Integer.valueOf((int) dVarE4.getLong(iD6)), dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7)));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(String str, b bVar, DocumentEntityStatus documentEntityStatus, String str2, ya.b bVar2) {
        ya.d dVarE4 = bVar2.e4(str);
        try {
            String strA = bVar.__documentEntityStatusDtoConverter.a(documentEntityStatus);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    @Override // gg0.l
    public Object a(tq.e<? super List<DocumentEntity>> eVar) {
        final String str = "SELECT * FROM container";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.d0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.d0(str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object b(final String str, tq.e<? super DocumentWithScopesAndSchemas> eVar) {
        final String str2 = "SELECT * FROM container WHERE documentId = ?";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.y
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.e0(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object d(final String str, tq.e<? super Integer> eVar) {
        final String str2 = "SELECT COUNT(*) FROM container WHERE documentId = ?";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.r
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(pl.gov.coi.mjunior.technical.containers.data.database.b.n0(str2, str, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object e(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM container";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.c0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.Z(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.l
    public Object f(final String str, tq.e<? super DocumentWithScopes> eVar) {
        final String str2 = "SELECT * FROM container WHERE documentId = ?";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.u
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.f0(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object g(final String str, tq.e<? super i0> eVar) {
        final String str2 = "DELETE FROM container WHERE documentId = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.o
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.a0(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.l
    public mu.g<List<DocumentEntity>> h() {
        final String str = "SELECT * FROM container";
        return qa.k.a(this.__db, false, new String[]{"container"}, new er.l() { // from class: gg0.t
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.o0(str, this, (ya.b) obj);
            }
        });
    }

    @Override // gg0.l
    public Object i(tq.e<? super DocumentWithScopes> eVar) {
        final String str = "SELECT * FROM container WHERE documentType = 'SCHOOL_CARD' ORDER BY id ASC LIMIT 1";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.x
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.i0(str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object j(final SchemaEntity schemaEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.p
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.l0(this.f72815a, schemaEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.l
    public Object m(final DocumentEntity documentEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.s
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.k0(this.f72821a, documentEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.l
    public Object n(final String str, final DocumentEntityStatus documentEntityStatus, tq.e<? super i0> eVar) {
        final String str2 = "UPDATE container SET status = ? WHERE documentId = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.e0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.p0(str2, this, documentEntityStatus, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.l
    public Object o(final String str, tq.e<? super List<DocumentWithScopesAndSchemas>> eVar) {
        final String str2 = "SELECT * FROM container WHERE parentId = ?";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.z
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.g0(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object p(final String str, final String str2, tq.e<? super ScopeEntity> eVar) {
        final String str3 = "SELECT * FROM container_scope WHERE containerId = ? AND name = ? ";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.w
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.j0(str3, str, str2, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object q(final String str, tq.e<? super String> eVar) {
        final String str2 = "SELECT parentId FROM container WHERE documentId = ? LIMIT 1";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.b0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.c0(str2, str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object r(DocumentEntity documentEntity, ScopeEntity scopeEntity, SchemaEntity schemaEntity, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new f(documentEntity, scopeEntity, schemaEntity, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // gg0.l
    public Object s(final String str, tq.e<? super i0> eVar) {
        final String str2 = "DELETE FROM container WHERE documentId = ? OR parentId = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.q
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.b0(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.l
    public Object t(final String str, tq.e<? super List<DocumentWithScopes>> eVar) {
        final String str2 = "SELECT * FROM container WHERE parentId = ?";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: gg0.m
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.h0(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // gg0.l
    public Object u(DocumentEntity documentEntity, List<ScopeEntity> list, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new g(documentEntity, list, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // gg0.l
    public Object v(final ScopeEntity scopeEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: gg0.n
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mjunior.technical.containers.data.database.b.m0(this.f72811a, scopeEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // gg0.l
    public Object w(String str, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new e(str, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }
}
