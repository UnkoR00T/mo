package pl.gov.coi.mobywatel.technical.containers.data.database;

import er.l;
import fr.k;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l24.n;
import m24.CertificateEntity;
import m24.DocumentEntity;
import m24.DocumentSchemaEntity;
import m24.DocumentScopeEntity;
import m24.DocumentWithScopes;
import m24.DocumentWithScopesAndSchemas;
import m24.ParentDocumentWithCertificate;
import m24.g;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityType;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityType;
import pq.v;
import pq.v0;
import r0.a0;
import ta.i;
import ta.m;
import ta.q;
import ya.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 b2\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 H\u0096@¢\u0006\u0004\b\"\u0010#J.\u0010%\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\u0006\u0010$\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0096@¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020\tH\u0096@¢\u0006\u0004\b*\u0010+J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160 2\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u0004\u0018\u0001002\u0006\u0010)\u001a\u00020\tH\u0096@¢\u0006\u0004\b1\u0010+J\u001e\u00104\u001a\b\u0012\u0004\u0012\u0002000 2\u0006\u00103\u001a\u000202H\u0096@¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020,2\u0006\u0010)\u001a\u00020\tH\u0096@¢\u0006\u0004\b6\u0010+J\u0018\u00107\u001a\u00020,2\u0006\u00103\u001a\u000202H\u0096@¢\u0006\u0004\b7\u00105J\u001a\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u000202H\u0096@¢\u0006\u0004\b:\u00105J\u001a\u0010<\u001a\u0004\u0018\u00010\u000b2\u0006\u0010;\u001a\u00020\tH\u0096@¢\u0006\u0004\b<\u0010+J\u001a\u0010=\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020\tH\u0096@¢\u0006\u0004\b=\u0010+J\u001a\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010)\u001a\u00020\tH\u0096@¢\u0006\u0004\b?\u0010+J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020>0 2\u0006\u00103\u001a\u000202H\u0096@¢\u0006\u0004\b@\u00105J\u0018\u0010A\u001a\u00020\r2\u0006\u0010)\u001a\u00020\tH\u0096@¢\u0006\u0004\bA\u0010+J\u0018\u0010B\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0096@¢\u0006\u0004\bB\u00105J \u0010E\u001a\u00020\r2\u0006\u0010)\u001a\u00020\t2\u0006\u0010D\u001a\u00020CH\u0096@¢\u0006\u0004\bE\u0010FJ \u0010I\u001a\u00020\r2\u0006\u0010)\u001a\u00020\t2\u0006\u0010H\u001a\u00020GH\u0096@¢\u0006\u0004\bI\u0010JJ\u0018\u0010L\u001a\u00020\r2\u0006\u0010K\u001a\u00020,H\u0096@¢\u0006\u0004\bL\u0010/J \u0010N\u001a\u00020\r2\u0006\u0010M\u001a\u00020,2\u0006\u0010K\u001a\u00020,H\u0096@¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00160Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010XR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000b0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010RR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00140Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010RR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010`¨\u0006c"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/database/c;", "Ll24/n;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lya/b;", "_connection", "Lr0/a;", "", "", "Lm24/i;", "_map", "Loq/i0;", "Z", "(Lya/b;Lr0/a;)V", "Lr0/a0;", "Lm24/a;", "b0", "(Lya/b;Lr0/a0;)V", "Lm24/h;", "X", "Lm24/e;", "document", "y", "(Lm24/e;Ltq/e;)Ljava/lang/Object;", "documentScope", "t", "(Lm24/i;Ltq/e;)Ljava/lang/Object;", "schema", "j", "(Lm24/h;Ltq/e;)Ljava/lang/Object;", "", "documentScopes", "v", "(Lm24/e;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "documentSchema", "s", "(Lm24/e;Ljava/util/List;Lm24/h;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "documentId", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "certificateId", "h", "(ILtq/e;)Ljava/lang/Object;", "Lm24/j;", "f", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;", "documentType", "q", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;Ltq/e;)Ljava/lang/Object;", "d", "l", "documentEntityType", "Lm24/l;", "n", "scopeName", "m", "e", "Lm24/k;", "b", "u", "g", "k", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;", "newStatus", "w", "(Ljava/lang/String;Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "newExpirationDate", "o", "(Ljava/lang/String;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "newId", "p", "oldId", "x", "(IILtq/e;)Ljava/lang/Object;", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfDocumentEntity", "Lm24/g;", "Lm24/g;", "__documentEntityTypeConverter", "Lm24/f;", "Lm24/f;", "__documentEntityStatusConverter", "__insertAdapterOfDocumentScopeEntity", "__insertAdapterOfDocumentSchemaEntity", "Lm24/b;", "Lm24/b;", "__certificateEntityStatusConverter", "Lm24/c;", "Lm24/c;", "__certificateEntityTypeConverter", "i", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements n {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g __documentEntityTypeConverter = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m24.f __documentEntityStatusConverter = new m24.f();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m24.b __certificateEntityStatusConverter = new m24.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m24.c __certificateEntityTypeConverter = new m24.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<DocumentEntity> __insertAdapterOfDocumentEntity = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oa.f<DocumentScopeEntity> __insertAdapterOfDocumentScopeEntity = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oa.f<DocumentSchemaEntity> __insertAdapterOfDocumentSchemaEntity = new C3945c();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/technical/containers/data/database/c$a", "Loa/f;", "Lm24/e;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lm24/e;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends oa.f<DocumentEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `documentEntity` (`id`,`documentId`,`documentType`,`expirationDate`,`lastUpdateTimestamp`,`status`,`parentDocumentId`,`parentCertificateId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, DocumentEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getDocumentId());
            String strA = c.this.__documentEntityTypeConverter.a(entity.getType());
            if (strA == null) {
                statement.i0(3);
            } else {
                statement.S0(3, strA);
            }
            String strA2 = m10.b.a(entity.getExpirationDate());
            if (strA2 == null) {
                statement.i0(4);
            } else {
                statement.S0(4, strA2);
            }
            statement.f0(5, entity.getLastUpdateTimestamp());
            String strA3 = c.this.__documentEntityStatusConverter.a(entity.getStatus());
            if (strA3 == null) {
                statement.i0(6);
            } else {
                statement.S0(6, strA3);
            }
            String parentDocumentId = entity.getParentDocumentId();
            if (parentDocumentId == null) {
                statement.i0(7);
            } else {
                statement.S0(7, parentDocumentId);
            }
            statement.f0(8, entity.getParentCertificateId());
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/technical/containers/data/database/c$b", "Loa/f;", "Lm24/i;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lm24/i;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends oa.f<DocumentScopeEntity> {
        b() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `document_scope` (`id`,`documentContainerId`,`scopeName`,`scopeData`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, DocumentScopeEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getDocumentContainerId());
            statement.S0(3, entity.getScopeName());
            statement.g0(4, entity.getScopeData());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.containers.data.database.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/technical/containers/data/database/c$c", "Loa/f;", "Lm24/h;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lm24/h;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3945c extends oa.f<DocumentSchemaEntity> {
        C3945c() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `document_schema` (`id`,`documentContainerId`,`schema`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, DocumentSchemaEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getDocumentContainerId());
            statement.g0(3, entity.getSchema());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.containers.data.database.c$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/database/c$d;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    static final class e extends vq.k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159076e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DocumentEntity f159078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<DocumentScopeEntity> f159079h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ DocumentSchemaEntity f159080j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(DocumentEntity documentEntity, List<DocumentScopeEntity> list, DocumentSchemaEntity documentSchemaEntity, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f159078g = documentEntity;
            this.f159079h = list;
            this.f159080j = documentSchemaEntity;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f159076e;
            if (i15 == 0) {
                oq.u.b(obj);
                c cVar = c.this;
                DocumentEntity documentEntity = this.f159078g;
                List<DocumentScopeEntity> list = this.f159079h;
                DocumentSchemaEntity documentSchemaEntity = this.f159080j;
                this.f159076e = 1;
                if (c.super.s(documentEntity, list, documentSchemaEntity, this) == objE) {
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
            return c.this.new e(this.f159078g, this.f159079h, this.f159080j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159081e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DocumentEntity f159083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<DocumentScopeEntity> f159084h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(DocumentEntity documentEntity, List<DocumentScopeEntity> list, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f159083g = documentEntity;
            this.f159084h = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f159081e;
            if (i15 == 0) {
                oq.u.b(obj);
                c cVar = c.this;
                DocumentEntity documentEntity = this.f159083g;
                List<DocumentScopeEntity> list = this.f159084h;
                this.f159081e = 1;
                if (c.super.v(documentEntity, list, this) == objE) {
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
            return c.this.new f(this.f159083g, this.f159084h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public c(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(String str, int i15, int i16, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, i15);
            dVarE4.f0(2, i16);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(String str, c cVar, DocumentEntityStatus documentEntityStatus, String str2, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = cVar.__documentEntityStatusConverter.a(documentEntityStatus);
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

    private final void X(final ya.b _connection, r0.a<String, List<DocumentSchemaEntity>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            i.a(_map, true, new l() { // from class: l24.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return pl.gov.coi.mobywatel.technical.containers.data.database.c.Y(this.f115435a, _connection, (r0.a) obj);
                }
            });
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT `id`,`documentContainerId`,`schema` FROM `document_schema` WHERE `documentContainerId` IN (");
        q.a(sb5, setKeySet.size());
        sb5.append(")");
        d dVarE4 = _connection.e4(sb5.toString());
        Iterator<String> it = setKeySet.iterator();
        int i15 = 1;
        while (it.hasNext()) {
            dVarE4.S0(i15, it.next());
            i15++;
        }
        try {
            int iC = m.c(dVarE4, "documentContainerId");
            if (iC == -1) {
                dVarE4.close();
                return;
            }
            while (dVarE4.Y3()) {
                List<DocumentSchemaEntity> list = _map.get(dVarE4.u3(iC));
                if (list != null) {
                    list.add(new DocumentSchemaEntity((int) dVarE4.getLong(0), dVarE4.u3(1), dVarE4.getBlob(2)));
                }
            }
            dVarE4.close();
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(c cVar, ya.b bVar, r0.a aVar) {
        cVar.X(bVar, aVar);
        return i0.f148189a;
    }

    private final void Z(final ya.b _connection, r0.a<String, List<DocumentScopeEntity>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            i.a(_map, true, new l() { // from class: l24.x
                @Override // er.l
                public final Object b(Object obj) {
                    return pl.gov.coi.mobywatel.technical.containers.data.database.c.a0(this.f115539a, _connection, (r0.a) obj);
                }
            });
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT `id`,`documentContainerId`,`scopeName`,`scopeData` FROM `document_scope` WHERE `documentContainerId` IN (");
        q.a(sb5, setKeySet.size());
        sb5.append(")");
        d dVarE4 = _connection.e4(sb5.toString());
        Iterator<String> it = setKeySet.iterator();
        int i15 = 1;
        while (it.hasNext()) {
            dVarE4.S0(i15, it.next());
            i15++;
        }
        try {
            int iC = m.c(dVarE4, "documentContainerId");
            if (iC == -1) {
                dVarE4.close();
                return;
            }
            while (dVarE4.Y3()) {
                List<DocumentScopeEntity> list = _map.get(dVarE4.u3(iC));
                if (list != null) {
                    list.add(new DocumentScopeEntity((int) dVarE4.getLong(0), dVarE4.u3(1), dVarE4.u3(2), dVarE4.getBlob(3)));
                }
            }
            dVarE4.close();
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(c cVar, ya.b bVar, r0.a aVar) {
        cVar.Z(bVar, aVar);
        return i0.f148189a;
    }

    private final void b0(final ya.b _connection, a0<CertificateEntity> _map) {
        if (_map.j()) {
            return;
        }
        if (_map.q() > 999) {
            i.b(_map, false, new l() { // from class: l24.w
                @Override // er.l
                public final Object b(Object obj) {
                    return pl.gov.coi.mobywatel.technical.containers.data.database.c.c0(this.f115537a, _connection, (r0.a0) obj);
                }
            });
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SELECT `id`,`certificate`,`privateKey`,`status`,`type`,`ticket` FROM `parentCertificate` WHERE `id` IN (");
        q.a(sb5, _map.q());
        sb5.append(")");
        d dVarE4 = _connection.e4(sb5.toString());
        int iQ = _map.q();
        int i15 = 1;
        for (int i16 = 0; i16 < iQ; i16++) {
            dVarE4.f0(i15, _map.l(i16));
            i15++;
        }
        try {
            int iC = m.c(dVarE4, "id");
            if (iC == -1) {
                dVarE4.close();
                return;
            }
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iC);
                if (_map.e(j15)) {
                    int i17 = (int) dVarE4.getLong(0);
                    byte[] blob = dVarE4.getBlob(1);
                    byte[] blob2 = dVarE4.getBlob(2);
                    String strU3 = null;
                    CertificateEntityStatus certificateEntityStatusB = this.__certificateEntityStatusConverter.b(dVarE4.isNull(3) ? null : dVarE4.u3(3));
                    if (certificateEntityStatusB == null) {
                        throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityStatus', but it was NULL.");
                    }
                    if (!dVarE4.isNull(4)) {
                        strU3 = dVarE4.u3(4);
                    }
                    CertificateEntityType certificateEntityTypeB = this.__certificateEntityTypeConverter.b(strU3);
                    if (certificateEntityTypeB == null) {
                        throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.CertificateEntityType', but it was NULL.");
                    }
                    _map.m(j15, new CertificateEntity(i17, blob, blob2, certificateEntityStatusB, certificateEntityTypeB, dVarE4.u3(5)));
                }
            }
            dVarE4.close();
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(c cVar, ya.b bVar, a0 a0Var) {
        cVar.b0(bVar, a0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(String str, String str2, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(String str, c cVar, DocumentEntityType documentEntityType, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = cVar.__documentEntityTypeConverter.a(documentEntityType);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j0(String str, c cVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "expirationDate");
            int iD5 = m.d(dVarE4, "lastUpdateTimestamp");
            int iD6 = m.d(dVarE4, "status");
            int iD7 = m.d(dVarE4, "parentDocumentId");
            int iD8 = m.d(dVarE4, "parentCertificateId");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = cVar.__documentEntityTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                long j15 = dVarE4.getLong(iD5);
                DocumentEntityStatus documentEntityStatusB = cVar.__documentEntityStatusConverter.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                arrayList.add(new DocumentEntity(i15, strU3, documentEntityTypeB, localDateB, j15, documentEntityStatusB, dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7), (int) dVarE4.getLong(iD8)));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k0(String str, int i15, c cVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, i15);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "expirationDate");
            int iD5 = m.d(dVarE4, "lastUpdateTimestamp");
            int iD6 = m.d(dVarE4, "status");
            int iD7 = m.d(dVarE4, "parentDocumentId");
            int iD8 = m.d(dVarE4, "parentCertificateId");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i16 = (int) dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = cVar.__documentEntityTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                long j15 = dVarE4.getLong(iD5);
                DocumentEntityStatus documentEntityStatusB = cVar.__documentEntityStatusConverter.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                arrayList.add(new DocumentEntity(i16, strU3, documentEntityTypeB, localDateB, j15, documentEntityStatusB, dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7), (int) dVarE4.getLong(iD8)));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParentDocumentWithCertificate l0(String str, c cVar, DocumentEntityType documentEntityType, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = cVar.__documentEntityTypeConverter.a(documentEntityType);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "expirationDate");
            int iD5 = m.d(dVarE4, "lastUpdateTimestamp");
            int iD6 = m.d(dVarE4, "status");
            int iD7 = m.d(dVarE4, "parentDocumentId");
            int iD8 = m.d(dVarE4, "parentCertificateId");
            ParentDocumentWithCertificate parentDocumentWithCertificate = null;
            a0<CertificateEntity> a0Var = new a0<>(0, 1, null);
            while (dVarE4.Y3()) {
                a0Var.m(dVarE4.getLong(iD8), null);
                iD6 = iD6;
                iD7 = iD7;
            }
            int i15 = iD6;
            int i16 = iD7;
            dVarE4.reset();
            cVar.b0(bVar, a0Var);
            if (dVarE4.Y3()) {
                int i17 = (int) dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = cVar.__documentEntityTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                long j15 = dVarE4.getLong(iD5);
                DocumentEntityStatus documentEntityStatusB = cVar.__documentEntityStatusConverter.b(dVarE4.isNull(i15) ? null : dVarE4.u3(i15));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                DocumentEntity documentEntity = new DocumentEntity(i17, strU3, documentEntityTypeB, localDateB, j15, documentEntityStatusB, dVarE4.isNull(i16) ? null : dVarE4.u3(i16), (int) dVarE4.getLong(iD8));
                CertificateEntity certificateEntityG = a0Var.g(dVarE4.getLong(iD8));
                if (certificateEntityG == null) {
                    throw new IllegalStateException("Relationship item 'certificate' was expected to be NON-NULL but is NULL in @Relation involving a parent column named 'parentCertificateId' and entityColumn named 'id'.");
                }
                parentDocumentWithCertificate = new ParentDocumentWithCertificate(documentEntity, certificateEntityG);
            }
            dVarE4.close();
            return parentDocumentWithCertificate;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentEntity m0(String str, String str2, c cVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "expirationDate");
            int iD5 = m.d(dVarE4, "lastUpdateTimestamp");
            int iD6 = m.d(dVarE4, "status");
            int iD7 = m.d(dVarE4, "parentDocumentId");
            int iD8 = m.d(dVarE4, "parentCertificateId");
            DocumentEntity documentEntity = null;
            if (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = cVar.__documentEntityTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                long j15 = dVarE4.getLong(iD5);
                DocumentEntityStatus documentEntityStatusB = cVar.__documentEntityStatusConverter.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                documentEntity = new DocumentEntity(i15, strU3, documentEntityTypeB, localDateB, j15, documentEntityStatusB, dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7), (int) dVarE4.getLong(iD8));
            }
            dVarE4.close();
            return documentEntity;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentScopeEntity n0(String str, String str2, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            return dVarE4.Y3() ? new DocumentScopeEntity((int) dVarE4.getLong(m.d(dVarE4, "id")), dVarE4.u3(m.d(dVarE4, "documentContainerId")), dVarE4.u3(m.d(dVarE4, "scopeName")), dVarE4.getBlob(m.d(dVarE4, "scopeData"))) : null;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentScopeEntity o0(String str, String str2, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            return dVarE4.Y3() ? new DocumentScopeEntity((int) dVarE4.getLong(m.d(dVarE4, "id")), dVarE4.u3(m.d(dVarE4, "documentContainerId")), dVarE4.u3(m.d(dVarE4, "scopeName")), dVarE4.getBlob(m.d(dVarE4, "scopeData"))) : null;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentWithScopesAndSchemas p0(String str, String str2, c cVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "expirationDate");
            int iD5 = m.d(dVarE4, "lastUpdateTimestamp");
            int iD6 = m.d(dVarE4, "status");
            int iD7 = m.d(dVarE4, "parentDocumentId");
            int iD8 = m.d(dVarE4, "parentCertificateId");
            r0.a<String, List<DocumentScopeEntity>> aVar = new r0.a<>();
            r0.a<String, List<DocumentSchemaEntity>> aVar2 = new r0.a<>();
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
            cVar.Z(bVar, aVar);
            cVar.X(bVar, aVar2);
            DocumentWithScopesAndSchemas documentWithScopesAndSchemas = null;
            if (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU5 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = cVar.__documentEntityTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                long j15 = dVarE4.getLong(iD5);
                DocumentEntityStatus documentEntityStatusB = cVar.__documentEntityStatusConverter.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                documentWithScopesAndSchemas = new DocumentWithScopesAndSchemas(new DocumentEntity(i15, strU5, documentEntityTypeB, localDateB, j15, documentEntityStatusB, dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7), (int) dVarE4.getLong(iD8)), (List) v0.j(aVar, dVarE4.u3(iD2)), (List) v0.j(aVar2, dVarE4.u3(iD2)));
            }
            dVarE4.close();
            return documentWithScopesAndSchemas;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q0(String str, c cVar, DocumentEntityType documentEntityType, ya.b bVar) {
        c cVar2 = cVar;
        d dVarE4 = bVar.e4(str);
        try {
            String strA = cVar2.__documentEntityTypeConverter.a(documentEntityType);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "expirationDate");
            int iD5 = m.d(dVarE4, "lastUpdateTimestamp");
            int iD6 = m.d(dVarE4, "status");
            int iD7 = m.d(dVarE4, "parentDocumentId");
            int iD8 = m.d(dVarE4, "parentCertificateId");
            r0.a<String, List<DocumentScopeEntity>> aVar = new r0.a<>();
            r0.a<String, List<DocumentSchemaEntity>> aVar2 = new r0.a<>();
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
            cVar2.Z(bVar, aVar);
            cVar2.X(bVar, aVar2);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU5 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = cVar2.__documentEntityTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                long j15 = dVarE4.getLong(iD5);
                DocumentEntityStatus documentEntityStatusB = cVar2.__documentEntityStatusConverter.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                arrayList.add(new DocumentWithScopesAndSchemas(new DocumentEntity(i15, strU5, documentEntityTypeB, localDateB, j15, documentEntityStatusB, dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7), (int) dVarE4.getLong(iD8)), (List) v0.j(aVar, dVarE4.u3(iD2)), (List) v0.j(aVar2, dVarE4.u3(iD2))));
                cVar2 = cVar;
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentWithScopes r0(String str, String str2, c cVar, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "expirationDate");
            int iD5 = m.d(dVarE4, "lastUpdateTimestamp");
            int iD6 = m.d(dVarE4, "status");
            int iD7 = m.d(dVarE4, "parentDocumentId");
            int iD8 = m.d(dVarE4, "parentCertificateId");
            r0.a<String, List<DocumentScopeEntity>> aVar = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD2);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
            }
            dVarE4.reset();
            cVar.Z(bVar, aVar);
            DocumentWithScopes documentWithScopes = null;
            if (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU4 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = cVar.__documentEntityTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                long j15 = dVarE4.getLong(iD5);
                DocumentEntityStatus documentEntityStatusB = cVar.__documentEntityStatusConverter.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                documentWithScopes = new DocumentWithScopes(new DocumentEntity(i15, strU4, documentEntityTypeB, localDateB, j15, documentEntityStatusB, dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7), (int) dVarE4.getLong(iD8)), (List) v0.j(aVar, dVarE4.u3(iD2)));
            }
            dVarE4.close();
            return documentWithScopes;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List s0(String str, c cVar, DocumentEntityType documentEntityType, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = cVar.__documentEntityTypeConverter.a(documentEntityType);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "documentId");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "expirationDate");
            int iD5 = m.d(dVarE4, "lastUpdateTimestamp");
            int iD6 = m.d(dVarE4, "status");
            int iD7 = m.d(dVarE4, "parentDocumentId");
            int iD8 = m.d(dVarE4, "parentCertificateId");
            r0.a<String, List<DocumentScopeEntity>> aVar = new r0.a<>();
            while (dVarE4.Y3()) {
                String strU3 = dVarE4.u3(iD2);
                if (!aVar.containsKey(strU3)) {
                    aVar.put(strU3, new ArrayList());
                }
            }
            dVarE4.reset();
            cVar.Z(bVar, aVar);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = (int) dVarE4.getLong(iD);
                String strU4 = dVarE4.u3(iD2);
                DocumentEntityType documentEntityTypeB = cVar.__documentEntityTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (documentEntityTypeB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityType', but it was NULL.");
                }
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4));
                long j15 = dVarE4.getLong(iD5);
                DocumentEntityStatus documentEntityStatusB = cVar.__documentEntityStatusConverter.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (documentEntityStatusB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.containers.`data`.database.entities.DocumentEntityStatus', but it was NULL.");
                }
                arrayList.add(new DocumentWithScopes(new DocumentEntity(i15, strU4, documentEntityTypeB, localDateB, j15, documentEntityStatusB, dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7), (int) dVarE4.getLong(iD8)), (List) v0.j(aVar, dVarE4.u3(iD2))));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(c cVar, DocumentEntity documentEntity, ya.b bVar) throws Exception {
        cVar.__insertAdapterOfDocumentEntity.d(bVar, documentEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u0(c cVar, DocumentSchemaEntity documentSchemaEntity, ya.b bVar) throws Exception {
        cVar.__insertAdapterOfDocumentSchemaEntity.d(bVar, documentSchemaEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(c cVar, DocumentScopeEntity documentScopeEntity, ya.b bVar) throws Exception {
        cVar.__insertAdapterOfDocumentScopeEntity.d(bVar, documentScopeEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w0(String str, String str2, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            return dVarE4.Y3() ? (int) dVarE4.getLong(0) : 0;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x0(String str, c cVar, DocumentEntityType documentEntityType, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = cVar.__documentEntityTypeConverter.a(documentEntityType);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            return dVarE4.Y3() ? (int) dVarE4.getLong(0) : 0;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(String str, int i15, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, i15);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z0(String str, LocalDate localDate, String str2, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            String strA = m10.b.a(localDate);
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

    @Override // l24.n
    public Object a(tq.e<? super List<DocumentEntity>> eVar) {
        final String str = "SELECT * FROM documentEntity";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.g0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.j0(str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object b(final String str, tq.e<? super DocumentWithScopesAndSchemas> eVar) {
        final String str2 = "SELECT * FROM documentEntity WHERE documentId = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.v
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.p0(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object c(final String str, tq.e<? super DocumentEntity> eVar) {
        final String str2 = "SELECT * FROM documentEntity WHERE documentId = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.i0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.m0(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object d(final String str, tq.e<? super Integer> eVar) {
        final String str2 = "SELECT COUNT(*) FROM documentEntity WHERE documentId = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.r
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(pl.gov.coi.mobywatel.technical.containers.data.database.c.w0(str2, str, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // l24.n
    public Object e(final String str, tq.e<? super DocumentScopeEntity> eVar) {
        final String str2 = "SELECT * FROM document_scope WHERE documentContainerId = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.o
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.n0(str2, str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object f(final String str, tq.e<? super DocumentWithScopes> eVar) {
        final String str2 = "SELECT * FROM documentEntity WHERE documentId = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.z
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.r0(str2, str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object g(final String str, tq.e<? super i0> eVar) {
        final String str2 = "DELETE FROM documentEntity WHERE documentId = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.j0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.h0(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.n
    public Object h(final int i15, tq.e<? super List<DocumentEntity>> eVar) {
        final String str = "SELECT * FROM documentEntity WHERE parentCertificateId = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.q
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.k0(str, i15, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object j(final DocumentSchemaEntity documentSchemaEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.t
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.u0(this.f115530a, documentSchemaEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.n
    public Object k(final DocumentEntityType documentEntityType, tq.e<? super i0> eVar) {
        final String str = "DELETE FROM documentEntity WHERE documentType = ? AND parentDocumentId is NULL";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.s
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.i0(str, this, documentEntityType, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.n
    public Object l(final DocumentEntityType documentEntityType, tq.e<? super Integer> eVar) {
        final String str = "SELECT COUNT(*) FROM documentEntity WHERE documentType = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.h0
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(pl.gov.coi.mobywatel.technical.containers.data.database.c.x0(str, this, documentEntityType, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // l24.n
    public Object m(final String str, tq.e<? super DocumentScopeEntity> eVar) {
        final String str2 = "SELECT * FROM document_scope WHERE scopeName = ? LIMIT 1";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.e0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.o0(str2, str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object n(final DocumentEntityType documentEntityType, tq.e<? super ParentDocumentWithCertificate> eVar) {
        final String str = "SELECT * FROM documentEntity WHERE documentType = ?";
        return ta.a.e(this.__db, true, true, new l() { // from class: l24.l0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.l0(str, this, documentEntityType, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object o(final String str, final LocalDate localDate, tq.e<? super i0> eVar) {
        final String str2 = "UPDATE documentEntity SET expirationDate = ? WHERE documentId = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.f0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.z0(str2, localDate, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.n
    public Object p(final int i15, tq.e<? super i0> eVar) {
        final String str = "UPDATE documentEntity SET parentCertificateId = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.d0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.y0(str, i15, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.n
    public Object q(final DocumentEntityType documentEntityType, tq.e<? super List<DocumentWithScopes>> eVar) {
        final String str = "SELECT * FROM documentEntity WHERE documentType = ?";
        return ta.a.e(this.__db, true, true, new l() { // from class: l24.p
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.s0(str, this, documentEntityType, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object s(DocumentEntity documentEntity, List<DocumentScopeEntity> list, DocumentSchemaEntity documentSchemaEntity, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new e(documentEntity, list, documentSchemaEntity, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // l24.n
    public Object t(final DocumentScopeEntity documentScopeEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.u
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.v0(this.f115532a, documentScopeEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.n
    public Object u(final DocumentEntityType documentEntityType, tq.e<? super List<DocumentWithScopesAndSchemas>> eVar) {
        final String str = "SELECT * FROM documentEntity WHERE documentType = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: l24.c0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.q0(str, this, documentEntityType, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // l24.n
    public Object v(DocumentEntity documentEntity, List<DocumentScopeEntity> list, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new f(documentEntity, list, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // l24.n
    public Object w(final String str, final DocumentEntityStatus documentEntityStatus, tq.e<? super i0> eVar) {
        final String str2 = "UPDATE documentEntity SET status = ? WHERE documentId = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.k0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.B0(str2, this, documentEntityStatus, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.n
    public Object x(final int i15, final int i16, tq.e<? super i0> eVar) {
        final String str = "UPDATE documentEntity SET parentCertificateId = ? WHERE parentCertificateId = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.b0
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.A0(str, i16, i15, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // l24.n
    public Object y(final DocumentEntity documentEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: l24.y
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.technical.containers.data.database.c.t0(this.f115541a, documentEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
